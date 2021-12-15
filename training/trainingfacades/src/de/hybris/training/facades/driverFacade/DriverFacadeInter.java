package de.hybris.training.facades.driverFacade;


import de.hybris.platform.commercefacades.driverDetails.data.DriverData;

import java.util.List;

public interface DriverFacadeInter {

    public List<DriverData> getDriverDetails(final String driverName);

}