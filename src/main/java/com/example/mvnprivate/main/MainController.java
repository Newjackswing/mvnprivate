package com.example.mvnprivate.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/index.do")
    public String index (
            HttpServletRequest request,
            Model model
    ){
        System.out.println("index :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        return "jsp/index.jsp";
    }

    @RequestMapping(value = "/vindex.do")
    public String vueIndex(
            HttpServletRequest request,
            Model model
    ){
        System.out.println("vue :::::::::::::::::::::::::::::::::");
        return "vue/index.vue";
    }
}
