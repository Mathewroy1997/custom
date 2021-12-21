package de.hybris.training.facades.driverFacade.impl;


import de.hybris.platform.commercefacades.driverDetails.data.DriverData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.DriverModel;
import de.hybris.training.core.services.DriverDetailsApiServices;
import de.hybris.training.facades.driverFacade.DriverFacadeInter;

import java.util.List;

public class DriverFacadeImpl implements DriverFacadeInter {


    public DriverDetailsApiServices getDriverDetailsApiServices() {
        return driverDetailsApiServices;
    }

    public void setDriverDetailsApiServices(DriverDetailsApiServices driverDetailsApiServices) {
        this.driverDetailsApiServices = driverDetailsApiServices;
    }

    private DriverDetailsApiServices driverDetailsApiServices;
    private Converter<DriverModel, DriverData> storesconverter;

    public Converter<DriverModel, DriverData> getStoresconverter() {
        return storesconverter;
    }

    public void setStoresconverter(Converter<DriverModel, DriverData> storesconverter) {
        this.storesconverter = storesconverter;
    }


    @Override
    public List<DriverData> getDriverDetails(final String driverName) {

        final List<DriverModel> driverDataModel = driverDetailsApiServices.getDriverDetails(driverName);


        return Converters.convertAll(driverDataModel, getStoresconverter());
    }


    @Override
    public List<DriverData> getAllDriverDetails() {
        final List<DriverModel> driverBaseDataModel = driverDetailsApiServices.getAllDriverDetails();

        return Converters.convertAll(driverBaseDataModel, getStoresconverter());
    }

    @Override
    public void removeDriver(String driverName) {
        driverDetailsApiServices.removeDriver(driverName);
    }
}



