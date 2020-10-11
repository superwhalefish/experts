package com.shzp.thymeleaf;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shzp.sys.dao.UserDao;
import com.shzp.sys.entity.Account;
import com.shzp.sys.entity.User;
import com.shzp.sys.service.UserService;

@Controller
public class IndexThymeleaf {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/menu")
	public String login(Model model) {
		Subject subject = SecurityUtils.getSubject();
		Account acc = (Account) subject.getPrincipal();
		String user_code = acc.getUser_code();
		User user = userDao.findUserByUser_code(user_code);
		model.addAttribute("username", user.getUser_name());
		model.addAttribute("userimg", user.getUser_img());
		return "menu";
	}

	@RequestMapping("/index")
	public String index() {

		return "index";
	}

	@RequestMapping("/noAuth")
	public String noAuth() {
		return "noAuth";

	}
}
