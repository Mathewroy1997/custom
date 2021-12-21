package de.hybris.training.core.services;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.core.dao.impl.DriverNameApiDao;
import de.hybris.training.core.model.DriverModel;

import javax.annotation.Resource;
import java.util.List;

public class DriverDetailsApiServices {
    @Resource
    private DriverNameApiDao driverNameApiDao;
    @Resource
    private ModelService modelService;

    public DriverNameApiDao getDriverNameApiDao() {
        return driverNameApiDao;
    }

    public void setDriverNameApiDao(DriverNameApiDao driverNameApiDao) {
        this.driverNameApiDao = driverNameApiDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public List<DriverModel> getDriverDetails(final String driverName) {
        final List<DriverModel> driverModels = driverNameApiDao.getDriverDetailsByName(driverName);
        return driverModels;
    }

    public List<DriverModel> getAllDriverDetails() {
        final List<DriverModel> storeModels = driverNameApiDao.getDriverDetails();
        return storeModels;
    }

    public void removeDriver(String driverName) {
        for (DriverModel driverModel : driverNameApiDao.removeDriver(driverName)) {
            getModelService().remove(driverModel);
        }
    }
}
