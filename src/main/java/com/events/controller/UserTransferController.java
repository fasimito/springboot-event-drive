package com.events.controller;

import com.alibaba.fastjson.JSONObject;
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
    @RequestMapping(value ="/alls", method= RequestMethod.POST)
    @ApiOperation(value="Generate short URL from the original long URL and store into database", notes="short url is right, it could return")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "pageNo", value = "pageNo", required = true, dataType = "int"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "pageSize", required = true, dataType = "int")
    })
    public String getAllTransfers(
            @RequestParam int pageNo,
            @RequestParam int pageSize
    ){
        String results = "";
        logger.info("pageNo={}, and pageSize = {}", pageNo, pageSize);
        List<UserTransfer> users = userTransferService.getUserByPages(pageNo, pageSize);
        users.forEach(p->{
            System.out.println("User is: "+p.getPayer()+" id="+p.getId());
        });
        results = JSONObject.toJSONString(users);
        System.out.println(results);
        return results;
    }

    @ResponseBody
    @RequestMapping(value ="/users", method= RequestMethod.GET)
    @ApiOperation(value="Generate short URL from the original long URL and store into database", notes="short url is right, it could return")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "account", value = "account", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "pageNo", value = "pageNo", required = true, dataType = "int"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "pageSize", required = true, dataType = "int")
    })
    public String getUserTransfers(
            @RequestParam String account,
            @RequestParam int pageNo,
            @RequestParam int pageSize
    ){
        logger.info("account={} , pageNo = {}, pageSize = {}", account,pageNo,pageSize);
        List<UserTransfer> users = userTransferService.getTransferByUserPages(account,pageNo,pageSize);
        users.forEach(p->{
            System.out.println("User is: "+p.getPayer()+" id= "+ p.getId());
        });
        return "";
    }
}
