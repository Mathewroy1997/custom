package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.dealerstores.DealerStoresAllDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.driverstores.DriverStoresAllDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.driverstores.DriverStoresDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdAndUserIdParam;
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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller

@RequestMapping(value = "/{baseSiteId}")

@Api(tags = "Hybris driver stores")
public class VehicleDealershipApiDataController extends BaseCommerceController {


    private static final Logger LOGGER = Logger.getLogger(VehicleDealershipApiDataController.class);

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

    @RequestMapping(value = "/allDrivers", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDriverDetails", value = "Get a specific driver base store detail", notes = "Returns a specific Store based on driver name", authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public DriverStoresAllDataListWSDTO getDriverDetailsByName(@ApiParam(value = "Response Configuration. This is the list of the fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                               @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {

        final DriverStoresDataList driverStoresDataList = new DriverStoresDataList();
        driverStoresDataList.setDriverstores(driverFacadeImpl.getAllDriverDetails());
        return getDataMapper().map(driverStoresDataList, DriverStoresAllDataListWSDTO.class, fields);

    }

    @Resource(name = "dealerFacadeImpl")

    private DealerFacade dealerFacade;

    //@Secured("ROLE_TRUSTED_CLIENT")
   /* @RequestMapping(value = "/{dealerName}", method = RequestMethod.GET)
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

    }*/
    @RequestMapping(value = "/allDealers", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDealerDetails", value = "Get a specific dealer store detail", notes = "Returns a specific Store based on dealer name", authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public DealerStoresAllDataListWSDTO getDealerDetailsByName(@ApiParam(value = "Response Configuration. This is the list of the fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                               @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {

        final DealerStoresDataList dealerStoresDataList = new DealerStoresDataList();
        dealerStoresDataList.setDealerstores(dealerFacade.getAllDealerDetails());
        return getDataMapper().map(dealerStoresDataList, DealerStoresAllDataListWSDTO.class, fields);

    }

    @RequestMapping(value = "/{driverName}", method = RequestMethod.DELETE)
    @ApiOperation(nickname = "removedriver", value = "Delete Driver.", notes = "Remove Driver.")
    @ApiBaseSiteIdAndUserIdParam
    @ResponseStatus(HttpStatus.OK)
    public void removedriver(@ApiParam(value = "driver ID", required = true) @PathVariable final String driverName) {

        driverFacadeImpl.removeDriver(driverName);
        LOGGER.info("deletion of driver success");

    }


}
