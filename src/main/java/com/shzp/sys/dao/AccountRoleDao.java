package com.shzp.sys.dao;

import java.util.List;
import java.util.Set;

public interface AccountRoleDao {

	List<String> findRoleByAcc_code(String acc_code);

}
