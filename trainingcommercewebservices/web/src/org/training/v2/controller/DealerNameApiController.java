package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.dealerstores.DealerStoresDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.driverstores.DriverStoresDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.training.facades.dealerFacade.impl.DealerFacade;
import de.hybris.training.facades.driverFacade.DriverFacadeInter;
import de.hybris.training.queues.data.DealerStoresDataList;
import de.hybris.training.queues.data.DriverStoresDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller

@RequestMapping(value = "/{baseSiteId}")

@Api(tags = "Hybris dealer stores")
public class DealerNameApiController extends BaseCommerceController {
    private static final Logger LOGGER = Logger.getLogger(DealerNameApiController.class);

    @Resource(name = "dealerFacadeImpl")

    private DealerFacade dealerFacade;

    //@Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/{dealerName}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDealerDetailsByName", value = "Get a specific dealer store detail", notes = "Returns a specific Store based on driver name", authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public DealerStoresDataListWSDTO getDealerDetailsByName(@ApiParam(value = "dealerName", required = true)

                                                            @PathVariable

                                                            final String dealerName,
                                                            @ApiParam(value = "Response Configuration. This is the list of the fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                            @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {
        LOGGER.info("driver name is :" + dealerName);
        final DealerStoresDataList dealerStoresDataList = new DealerStoresDataList();
        dealerStoresDataList.setDealerstores(dealerFacade.getDealerName(dealerName));
        return getDataMapper().map(dealerStoresDataList, DealerStoresDataListWSDTO.class, fields);

    }
}
