package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.DealerModel;

import java.util.List;

public interface DealerApiDao extends Dao {
    List<DealerModel> getDealerName(String dealerName);

    List<DealerModel> getDealerDetails();
}
