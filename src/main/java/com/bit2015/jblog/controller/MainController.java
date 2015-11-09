package com.bit2015.jblog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit2015.jblog.service.BlogUserService;
import com.bit2015.jblog.vo.BlogUserVo;

@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired
	BlogUserService blogUserService;
	
	@RequestMapping("")
	public String indexform() {
		return "/main/index";
	}

	@RequestMapping("/registerform")
	public String registerform() {
		return "/user/register-form";
	}

	@RequestMapping("/register")
	public String register(@ModelAttribute BlogUserVo vo) {
		blogUserService.join(vo);
		return "redirect:/main/userlistform";
	}

	@RequestMapping("/userlistform")
	public String userlistform(Model model) {
		List<BlogUserVo> list = blogUserService.userList();
		model.addAttribute("list", list);
		return "/user/list";
	}
	
	@RequestMapping("/loginform")
	public String loginform() {
		return "/user/login-form";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, @ModelAttribute BlogUserVo vo, Model model) {
		BlogUserVo userVo = blogUserService.login(vo);
		if (userVo == null) {
			return "redirect:/user/login-form?result=error";
		}
		session.setAttribute("authUser", userVo);
		model.addAttribute("vo", userVo);
		return "/main/index";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("authUser");
		session.invalidate();
		return "/main/index";
	}
}
