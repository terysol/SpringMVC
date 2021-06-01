package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub1")
public class TestController {
	
//	@RequestMapping(value="/test2", method = RequestMethod.GET)
	@GetMapping("/test2")
	public String test2() {
		return "/sub1/test2";		// 절대경로 /:WEB-INF/views 가 루트가 된다. 			
//		return "test2";				// 상대 경로   현재 나의 위치를 기준으로 된다. views/test2.jsp
	}
	
//	@RequestMapping(value="/test3", method = RequestMethod.GET)
	@GetMapping("/test3")
	public String test3() {
		return "sub1/test3";		// 절대경로 : root 부터 시작   webapp/WEB-INF/....
		// WEB-INF/views/sub1/test3.jsp   -> 상대 경로 : 현재나의 위치    /sub1/WEB-INF/views/sub1/
	}
	
	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public String test4() {
		return "sub1/test4";
	}
}
