package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.driverstores.DriverStoresDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.training.facades.driverFacade.DriverFacadeInter;
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

@Api(tags = "Hybris driver stores")
public class DriverDataController extends BaseCommerceController {


    private static final Logger LOGGER = Logger.getLogger(DriverDataController.class);

    @Resource(name = "driverFacadeImpl")

    private DriverFacadeInter driverFacadeImpl;

    //@Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/{driverName}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDriverDetailsByName", value = "Get a specific driver base store detail", notes = "Returns a specific Store based on driver name", authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public DriverStoresDataListWSDTO getDriverDetailsByName(@ApiParam(value = "driverName", required = true)

                                                            @PathVariable

                                                            final String driverName,
                                                            @ApiParam(value = "Response Configuration. This is the list of the fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                            @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {
        LOGGER.info("driver name is :" + driverName);
        final DriverStoresDataList driverStoresDataList = new DriverStoresDataList();
        driverStoresDataList.setDriverstores(driverFacadeImpl.getDriverDetails(driverName));
        return getDataMapper().map(driverStoresDataList, DriverStoresDataListWSDTO.class, fields);

    }


}
