package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, buh";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<Html>");
		sb.append("<head>");
		sb.append("<title> not a web page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Okay maybe it is a web page");
		sb.append("</body>");
		sb.append("<Html>");
		
		
		return sb.toString();
	}
	
	// JSP
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
	
	

}
