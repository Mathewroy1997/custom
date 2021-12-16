package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DealerApiDaoImpl extends AbstractItemDao implements DealerApiDao {
    private static final Logger LOGGER = Logger.getLogger(DealerApiDaoImpl.class);
    private static final String STORE_QUERY = "SELECT {" + DealerModel.PK + "} FROM{" + DealerModel._TYPECODE + "} WHERE {" + DealerModel.DEALERNAME + "}= ?dealerName ";
    private static final String STORE_QUERY2 = "SELECT {pk} FROM {Dealer}";

    @Override
    public List<DealerModel> getDealerName(String dealerName) {
        ServicesUtil.validateParameterNotNull(dealerName, "dealer name must not be null");

        final Map<String, Object> params = new HashMap<>();
        params.put("dealerName", dealerName);
        LOGGER.info(getFlexibleSearchService().search(STORE_QUERY, params
        ).getClass());
        final SearchResult<DealerModel> stores = getFlexibleSearchService().search(STORE_QUERY, params);
        return stores.getResult() == null ? Collections.emptyList() : stores.getResult();
    }

    @Override
    public List<DealerModel> getDealerDetails() {
        final SearchResult<DealerModel> stores = getFlexibleSearchService().search(STORE_QUERY2);
        return stores.getResult() == null ? Collections.emptyList() : stores.getResult();
    }
}
