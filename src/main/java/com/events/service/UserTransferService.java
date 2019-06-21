package com.events.service;

import com.events.domain.UserTransfer;

import java.util.List;

public interface UserTransferService {

    public List<UserTransfer> getUserByPages(int pageNo, int pageSize);

    public List<UserTransfer> getTransferByUserPages(String account,int pageNo, int pageSize);
}
