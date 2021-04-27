package com.example.demo.web;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.HelloService;


@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("aaa")
    @ResponseBody
    public String aaa() {
    	
        return "html/test";
    }
    

    @RequestMapping("fragments/header")
    public String bbb() {
    	
        return "fragments/header";
    }
    
    
    @RequestMapping("/")
    //@ResponseBody
    public String root(Model m) {
    	String s=helloService.getHelloMessage();
    	m.addAttribute("aaa", "kkkkk");

        return "html/test";
    }
    
    @GetMapping("/login")
    //@ResponseBody
    public String login(Model m) {
    	String s=helloService.getHelloMessage();
    	m.addAttribute("aaa", "kkkkk");

        return "html/test";
    }
    
    @GetMapping("/hello")
    //@ResponseBody
    public String hello(Model m) {
    	String s=helloService.getHelloMessage();
    	m.addAttribute("aaa", "kkkkk");

        return "html/test";
    }
    
    
    @RequestMapping("/helloAjax")
    @ResponseBody
    public Object helloAjax(Model m) {
    	
    	List<Map<String,Object>> list=new LinkedList<Map<String,Object>>();

    	HashMap<String,Object> mm=new HashMap<String,Object>();
    	mm.put("a", "aa");
    	mm.put("b", "bb");
    	
    	list.add(mm);
    	
    	mm=new HashMap<String,Object>();
    	mm.put("a", "aaa");
    	mm.put("b", "bbb");
    	
    	list.add(mm);
    	
    	mm=new HashMap<String,Object>();
    	mm.put("a", "aaaa");
    	mm.put("b", "bbbb");
    	
    	list.add(mm);
        return list;
    }
}
