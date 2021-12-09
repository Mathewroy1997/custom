package de.hybris.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.tx.Transaction;
import de.hybris.training.core.dao.impl.VehicleCountDao;
import de.hybris.training.core.model.TestProcessesModel;
import de.hybris.training.core.model.VehicleCountCronjobModel;
import de.hybris.training.core.model.VehicleModel;
import org.apache.log4j.Logger;


import java.util.List;

public class VehicleCountJob extends AbstractJobPerformable<VehicleCountCronjobModel> {
    private ModelService modelService;


    private BusinessProcessService businessProcessService;

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public VehicleCountDao vehicleCountDao;

    public VehicleCountDao getVehicleCountDao() {
        return vehicleCountDao;
    }

    public void setVehicleCountDao(VehicleCountDao vehicleCountDao) {
        this.vehicleCountDao = vehicleCountDao;
    }


    private final static Logger LOG = Logger.getLogger(VehicleCountJob.class.getName());
    @Override
    public PerformResult perform(VehicleCountCronjobModel vehicleCountCronjobModel) {


        List<VehicleModel> vehicle=vehicleCountDao.findVehicleCount();

        String registrationNumber;
        for( VehicleModel vehicleModel:vehicle){
             registrationNumber=vehicleModel.getVehicleRegistrationNumber();
            int count=0;
            for(int i=0;i<registrationNumber.length();i++){
                if(registrationNumber.charAt(i)=='-'){
                    count ++;
                    if(count==3){
                        StringBuilder sb=new StringBuilder(registrationNumber);
                        while(sb.substring(i+1).length()!=4){
                            sb.insert(i+1,"0");
                            break;


                        }
                        vehicleModel.setVehicleRegistrationNumber(sb.toString());

                    }
                }
            }
        }
        Transaction tx = null;
        try {
            tx = Transaction.current();
            tx.begin();
            getModelService().saveAll(vehicle);
            tx.commit();
        } catch (final ModelSavingException e) {
            if (null != tx) {
                tx.rollback();
            }
        }


        LOG.info("***************************************");
        LOG.info("Current vehicle count is " + vehicle.size());
        LOG.info("***************************************");

        final TestProcessesModel testProcessModel = (TestProcessesModel) getBusinessProcessService().createProcess("test-process" + System.currentTimeMillis(), "test-process");
        businessProcessService.startProcess(testProcessModel);
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }


}
