package de.hybris.training.facades.dealerFacade.impl;

import de.hybris.platform.commercefacades.dealerDetails.data.DealerData;
import de.hybris.platform.commercefacades.driverDetails.data.DriverData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;
import de.hybris.training.core.services.DealerDetailsApiServices;
import de.hybris.training.core.services.DriverDetailsApiServices;

import java.util.List;

public class DealerFacadeImpl implements DealerFacade {
    public DealerDetailsApiServices getDealerDetailsApiServices() {
        return dealerDetailsApiServices;
    }

    public void setDealerDetailsApiServices(DealerDetailsApiServices dealerDetailsApiServices) {
        this.dealerDetailsApiServices = dealerDetailsApiServices;
    }

    private DealerDetailsApiServices dealerDetailsApiServices;

    public Converter<DealerModel, DealerData> getStoreconverter() {
        return storeconverter;
    }

    public void setStoreconverter(Converter<DealerModel, DealerData> storeconverter) {
        this.storeconverter = storeconverter;
    }

    private Converter<DealerModel, DealerData> storeconverter;

    @Override
    public List<DealerData> getDealerName(String dealerName) {
        final List<DealerModel> dealerDataModel = dealerDetailsApiServices.getDealerName(dealerName);


        return Converters.convertAll(dealerDataModel, getStoreconverter());
    }

    @Override
    public List<DealerData> getAllDealerDetails() {
        final List<DealerModel> dealerModel = dealerDetailsApiServices.getAllDealerDetails();

        return Converters.convertAll(dealerModel, getStoreconverter());
    }
}
