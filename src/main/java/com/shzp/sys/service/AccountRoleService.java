package com.shzp.sys.service;

import java.util.List;

public interface AccountRoleService {

	List<String> findRoleByAcc_code(String acc_code);

}
