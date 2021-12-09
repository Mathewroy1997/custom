package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class VehicleRegistrationNumberPopulator extends SearchResultVariantProductPopulator {


    @Override
    public void populate(SearchResultValueData source, ProductData target) {

        super.populate(source, target);
        final Object obj = this.getValue(source, "vehicleRegistrationNumber");
        if (obj != null) {


            final String registrationNumber = this.getValue(source, "vehicleRegistrationNumber").toString();
            target.setVehicleRegistrationNumber(this.getValue(source, "vehicleRegistrationNumber").toString());
        } else {
            target.setVehicleRegistrationNumber(null);
        }


    }
}