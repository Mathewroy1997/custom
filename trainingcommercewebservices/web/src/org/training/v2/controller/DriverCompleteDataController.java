package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.driverstores.DriverStoresAllDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.training.facades.driverFacade.DriverFacadeInter;
import de.hybris.training.queues.data.DriverStoresDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/apparel-uk")
@Api(tags = "All dealers")
public class DriverCompleteDataController extends BaseCommerceController {


    private static final Logger LOGGER = Logger.getLogger(DriverCompleteDataController.class);

    @Resource(name = "driverFacadeImpl")
    private DriverFacadeInter driverFacadeInter;

    //@Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDriverDetails", value = "Get a specific driver base store detail", notes = "Returns a specific Store based on driver name", authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public DriverStoresAllDataListWSDTO getDriverDetailsByName(@ApiParam(value = "Response Configuration. This is the list of the fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                               @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {

        final DriverStoresDataList driverStoresDataList = new DriverStoresDataList();
        driverStoresDataList.setDriverstores(driverFacadeInter.getAllDriverDetails());
        return getDataMapper().map(driverStoresDataList, DriverStoresAllDataListWSDTO.class, fields);

    }


}
