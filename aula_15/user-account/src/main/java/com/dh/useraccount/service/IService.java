package com.dh.useraccount.service;

import com.dh.useraccount.model.UserAccount;
import com.dh.useraccount.repository.UserAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IService {

    List<UserAccount> getAll();

    UserAccount post(UserAccount userAccount);
}
