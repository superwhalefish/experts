package com.shzp.sys.dao;

import com.shzp.sys.entity.Account;

public interface AccountDao {

	Account findByAcc_name(String acc_name);
}
