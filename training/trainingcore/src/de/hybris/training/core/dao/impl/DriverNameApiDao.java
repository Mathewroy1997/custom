package de.hybris.training.core.dao.impl;

import de.hybris.training.core.model.DriverModel;

import java.util.List;

public interface DriverNameApiDao {
    List<DriverModel> getDriverDetailsByName(String driverName);
}
