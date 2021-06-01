package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// MVC중에 controller에 해당한다.
@Controller
public class HomeController {
	
	@RequestMapping(value="/",method= {RequestMethod.GET,RequestMethod.POST})
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	// get 방식으로 /test1으로 접속했을 때 콘솔에 test1 출력
	@RequestMapping(value="/test1",method = RequestMethod.GET)
	public String test() {
		System.out.println("test1");
		return "test1";
	}
}
