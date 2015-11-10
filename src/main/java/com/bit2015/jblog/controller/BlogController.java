package com.bit2015.jblog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit2015.jblog.service.BlogService;
import com.bit2015.jblog.vo.PostVo;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	private BlogService blogService;
	@RequestMapping("/list")
   public String main(@RequestParam(value="userNo", required=true, defaultValue="") long no,Model model){
		System.out.println(no);
		List<PostVo> list =blogService.list(no);
		model.addAttribute("list", list);
		return "/blog/main";
   }
   
   @RequestMapping("/maindetail")
   public String maindetail(){
      return "/blog/main-detail";
   }
   @RequestMapping("/writeform")
   public String writeform(){
      return "/blog/write";
   }
   @RequestMapping("/basic")
   public String basic(){
      return "/blog/basic";
   }
   @RequestMapping("/category")
   public String category(){
      return "/blog/category";
   }
}