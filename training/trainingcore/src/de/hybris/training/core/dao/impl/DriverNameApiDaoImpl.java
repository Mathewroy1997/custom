package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.training.core.model.DriverModel;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverNameApiDaoImpl extends AbstractItemDao implements DriverNameApiDao {

    private static final Logger LOGGER = Logger.getLogger(DriverNameApiDaoImpl.class);
    private static final String STORE_QUERY = "SELECT {" + DriverModel.PK + "} FROM{" + DriverModel._TYPECODE + "} WHERE {" + DriverModel.DRIVERNAME + "}= ?driverName ";


    @Override
    public List<DriverModel> getDriverDetailsByName(String driverName) {
        ServicesUtil.validateParameterNotNull(driverName, "driver name must not be null");

        final Map<String, Object> params = new HashMap<>();
        params.put("driverName", driverName);
        LOGGER.info(getFlexibleSearchService().search(STORE_QUERY, params
        ).getClass());
        final SearchResult<DriverModel> stores = getFlexibleSearchService().search(STORE_QUERY, params);
        return stores.getResult() == null ? Collections.emptyList() : stores.getResult();
    }
}
