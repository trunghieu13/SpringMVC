package com.hieunguyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String homePage()
    {
        return "homePage";
    }

    @RequestMapping(value = "/hi")
    public String secondPage()
    {
        return "secondPage";
    }

    //test @PathVariable
    @RequestMapping(value = "/testpathvariable/{id}/{name}")
    public String test1(@PathVariable("id") int id, @PathVariable("name") String name, Model model)
    {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "thirdPage";
    }

    //Test RequestParam
    @RequestMapping(value ="/testrequestparam")
    public String test2(@RequestParam("id") int id, @RequestParam("name") String name, Model model)
    {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "fourthPage";
    }

    //Test RedirectAttributes
    @RequestMapping("/redirect")
    public RedirectView redirect(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("name", name);
        return new RedirectView("page2");
    }
    @RequestMapping("/page2")
    public String page2(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "page2";
    }
}
