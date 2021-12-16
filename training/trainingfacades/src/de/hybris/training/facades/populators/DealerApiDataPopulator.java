package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.dealerDetails.data.DealerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.DealerModel;


public class DealerApiDataPopulator implements Populator<DealerModel, DealerData> {
    @Override
    public void populate(DealerModel dealerModel, DealerData dealerData) throws ConversionException {
        dealerData.setDealerName(dealerModel.getDealerName());
        dealerData.setDealerId(dealerModel.getDealerId());
        dealerData.setDealerAddress(dealerModel.getDealerAddress());
    }
}
