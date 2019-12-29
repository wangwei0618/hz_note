package com.ww.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/getIndex")
	public String index(){
		return "自动化部署。。。。。";
	}
}
