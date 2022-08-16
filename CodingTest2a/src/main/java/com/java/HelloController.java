package com.java;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {

  @RequestMapping("/hello")

  public String display(@RequestParam("eno") String eno,@RequestParam("name") String name,@RequestParam("des") String des,@RequestParam("sal") String sal, Model m)

  {

    

      String msg="Details are "+ eno + " " + name + " " + des + " " + sal;

      m.addAttribute("message", msg);

      return "viewpage";


  }

}

