package de.hybris.training.core.services;

import de.hybris.training.core.dao.impl.DriverNameApiDao;
import de.hybris.training.core.model.DriverModel;

import javax.annotation.Resource;
import java.util.List;

public class DriverDetailsApiServices {
    @Resource
    private DriverNameApiDao driverNameApiDao;

    public List<DriverModel> getDriverDetails(final String driverName) {
        final List<DriverModel> driverModels = driverNameApiDao.getDriverDetailsByName(driverName);
        return driverModels;
    }
}
