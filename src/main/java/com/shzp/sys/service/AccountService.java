package com.shzp.sys.service;

import com.shzp.sys.entity.Account;

public interface AccountService {

	Account findByAcc_name(String acc_name);
}
