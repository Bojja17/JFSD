package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ClientController {
  
  @RequestMapping("/greet")
  public String greet(@RequestParam String username, Model model) {
    model.addAttribute("message", "Hello, " + username + "!");
    return "greet";
  }

  @RequestMapping("/about")
  public String about() {
    return "about";
  }

  @RequestMapping("/demo1")
  public String demo1(@RequestParam int age, @RequestParam String country, Model model) {
    model.addAttribute("age", age);
    model.addAttribute("country", country);
    return "demo1";
  }

  @RequestMapping("/demo2/{num1}/{num2}")
  public String demo2(@PathVariable int num1, @PathVariable int num2, Model model) {
    model.addAttribute("subtraction", num1 - num2);
    model.addAttribute("division", num1 / num2);
    return "demo2";
  }

  @RequestMapping("/productform")
  public String productForm() {
    return "productform";
  }

  @RequestMapping("/multiplyNumbers")
  public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
    model.addAttribute("result", num1 * num2);
    return "multiply";
  }

  @RequestMapping("/reverse")
  public String reverse(@RequestParam String str1, @RequestParam String str2, Model model) {
    model.addAttribute("reversedStr1", new StringBuilder(str1).reverse().toString());
    model.addAttribute("reversedStr2", new StringBuilder(str2).reverse().toString());
    return "reverse";
  }

  @RequestMapping("/calculate")
  public String calculate(@RequestParam int num1, @RequestParam int num2, Model model) {
    model.addAttribute("addition", num1 + num2);
    model.addAttribute("subtraction", num1 - num2);
    return "calculate";
  }
}
