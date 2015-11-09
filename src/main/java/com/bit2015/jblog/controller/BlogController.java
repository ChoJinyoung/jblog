package com.bit2015.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	
   @RequestMapping("")
   public String main(){
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