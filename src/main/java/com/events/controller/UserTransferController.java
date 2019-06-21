package com.events.controller;

import com.events.domain.UserTransfer;
import com.events.service.UserTransferService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfer")
@Api(value = "Short URL Controller")
public class UserTransferController {

    private static final Logger logger = LoggerFactory.getLogger(UserTransferController.class);

    @Autowired
    private UserTransferService userTransferService;

    @ResponseBody
    @RequestMapping(value ="/alls", method= RequestMethod.GET)
    @ApiOperation(value="Generate short URL from the original long URL and store into database", notes="short url is right, it could return")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "account", value = "accounts", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "sign", value = "sign", required = true, dataType = "String")
    })
    public String getAllTransfers(@RequestParam String account, @RequestParam String sign){
        logger.info("account={}, and sign = {}", account, sign);
        List<UserTransfer> users = userTransferService.getUserByPages(2,2);
        users.forEach(p->{
            System.out.println("User is: "+p.getPayer());
        });
        return "";
    }

    @ResponseBody
    @RequestMapping(value ="/users", method= RequestMethod.GET)
    @ApiOperation(value="Generate short URL from the original long URL and store into database", notes="short url is right, it could return")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "account", value = "account", required = true, dataType = "String")
    })
    public String getUserTransfers(@RequestParam String account){
        logger.info("account={} ", account);
        List<UserTransfer> users = userTransferService.getTransferByUserPages(account,2,2);
        users.forEach(p->{
            System.out.println("User is: "+p.getPayer());
        });
        return "";
    }
}
