package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.driverDetails.data.DriverData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.DriverModel;

public class DriverDataPopulator implements Populator<DriverModel, DriverData> {


    @Override
    public void populate(DriverModel driverBaseModel, DriverData driverData) throws ConversionException {
        driverData.setDriverName(driverBaseModel.getDriverName());
        driverData.setDriverId(driverBaseModel.getDriverId());
        driverData.setDriverExperience(driverBaseModel.getDriverExperience());
    }
}