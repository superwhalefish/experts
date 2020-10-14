package com.shzp.sys.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/system")
public class SysIndexThymeleaf {
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String test1(Model model) {
		return "system/account";
	}

	@RequestMapping(value = "/accountInfo", method = RequestMethod.GET)
	public String accountInfo(Model model, String acc_code) {
		model.addAttribute("acc_code", acc_code);
		return "system/accountInfo";
	}

	@RequestMapping(value = "/role", method = RequestMethod.GET)
	public String role(Model model) {
		return "system/role";
	}

	@RequestMapping(value = "/moduleToRole", method = RequestMethod.GET)
	public String moduleToRole(Model model, String role_code) {
		model.addAttribute("role_code", role_code);
		return "system/roleinfo";
	}
	@RequestMapping(value = "/roleToAcc", method = RequestMethod.GET)
	public String roleToAcc(Model model, String acc_code) {
		model.addAttribute("acc_code", acc_code);
		return "system/roletoacc";
	}

}
