package de.hybris.training.facades.dealerFacade.impl;

import de.hybris.platform.commercefacades.dealerDetails.data.DealerData;


import java.util.List;

public interface DealerFacade {
    public List<DealerData> getDealerName(final String dealerName);

    public List<DealerData> getAllDealerDetails();
}
