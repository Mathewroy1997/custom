package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.model.VehicleModel;

import java.util.Collections;
import java.util.List;

public class VehicleCountDaoImpl implements VehicleCountDao {

    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<VehicleModel> findVehicleCount() {
        final String query ="select {pk} from {Vehicle}";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        searchQuery.setResultClassList(Collections.singletonList(VehicleModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }
}
