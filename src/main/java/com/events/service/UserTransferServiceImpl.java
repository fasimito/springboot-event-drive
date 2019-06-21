package com.events.service;

import com.events.domain.UserTransfer;
import com.events.mapper.UserTransferMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTransferServiceImpl implements UserTransferService{

    private static final Logger logger = LoggerFactory.getLogger(UserTransferServiceImpl.class);

    @Autowired
    private UserTransferMapper userTransferMapper;

    @Override
    public List<UserTransfer> getUserByPages(int pageNo, int pageSize) {
        Page<UserTransfer> pages = PageHelper.startPage(pageNo, pageSize);
        List<UserTransfer> results = userTransferMapper.getAllUsersByPage();
        logger.info("the page total is: {}",pages.getTotal());
        return results;
    }

    @Override
    public List<UserTransfer> getTransferByUserPages(String account, int pageNo, int pageSize) {
        Page<UserTransfer> pages = PageHelper.startPage(pageNo, pageSize);
        List<UserTransfer> results = userTransferMapper.getTransfersPageByUser(account);
        logger.info("the page total is: {}",pages.getTotal());
        return results;
    }
}
