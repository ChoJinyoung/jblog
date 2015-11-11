package com.bit2015.jblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit2015.jblog.service.BlogService;
import com.bit2015.jblog.vo.BlogVo;
import com.bit2015.jblog.vo.CategoryVo;
import com.bit2015.jblog.vo.PostVo;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
@Autowired
   private BlogService blogService;
	
   @RequestMapping("/list")
   public String main(@ModelAttribute PostVo vo ,Model model){
	   List<PostVo> list=blogService.list(vo);
	   System.out.println("main list: "+list);
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
   
   @RequestMapping("/basicform")
   public String basicform(@ModelAttribute BlogVo vo, Model model){
	   System.out.println("basicform :" + vo);
	   BlogVo blogVo = blogService.settingDone(vo);	   
	   model.addAttribute("vo", blogVo);
	   return "/blog/basic";
   }
   
   @RequestMapping("/basic")
   public String basic(@ModelAttribute BlogVo vo){
	  blogService.updateSetting(vo); 
	  System.out.println("basicvo: "+ vo);
      return "redirect:/blog/basicform";
   }
   
   @RequestMapping("/categoryform")
   public String categoryform(@ModelAttribute CategoryVo vo,Model model){
      List<CategoryVo> list=blogService.categoryList(vo);
      model.addAttribute("list", list);
      return "/blog/category";
   }
   
   @RequestMapping("/categoryinsert")
   public String categoryInsert(@ModelAttribute CategoryVo vo){
      System.out.println(vo);
     blogService.categoryInsert(vo);
      return "redirect:/blog/categoryform";
   }
}