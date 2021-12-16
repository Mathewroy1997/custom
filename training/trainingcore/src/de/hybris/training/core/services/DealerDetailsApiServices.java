package de.hybris.training.core.services;

import de.hybris.training.core.dao.impl.DealerApiDao;
import de.hybris.training.core.dao.impl.DriverNameApiDao;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.DriverModel;

import javax.annotation.Resource;
import java.util.List;

public class DealerDetailsApiServices {
    @Resource
    private DealerApiDao dealerApiDao;

    public List<DealerModel> getDealerName(final String dealerName) {
        final List<DealerModel> dealerModels = dealerApiDao.getDealerName(dealerName);
        return dealerModels;
    }

    public List<DealerModel> getAllDealerDetails() {
        final List<DealerModel> dealerModels = dealerApiDao.getDealerDetails();
        return dealerModels;
    }
}
