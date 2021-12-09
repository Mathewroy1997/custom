package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class DriverNamePopulator extends SearchResultVariantProductPopulator {


    @Override
    public void populate(SearchResultValueData source, ProductData target) {

        super.populate(source, target);
        final Object obj = this.getValue(source, "driver");
        //final Object obj1=this.getValue(source,"vehicleRegistrationNumber");
        if (obj != null) {


            //final String driver=this.getValue(source,"driver").toString();

            target.setDriver(this.getValue(source, "driver").toString());
            target.setVehicleRegistrationNumber(this.getValue(source, "vehicleRegistrationNumber").toString());
            target.setDealer(this.getValue(source, "dealer").toString());


        } else {
            target.setDriver(null);
        }


    }
}