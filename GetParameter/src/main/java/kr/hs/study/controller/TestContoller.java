package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.hs.study.model.dto.TestDTO;

@Controller
public class TestContoller {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String a= request.getParameter("a");
		String b= request.getParameter("b");
		String c= request.getParameter("c");
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String a= request.getParameter("a");
		String b= request.getParameter("b");
		String []c= request.getParameterValues("c");
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		for(String i : c) {
			System.out.println("c : " + i);
		}
		
		return "result";
	}

	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	
	@PostMapping("/test3")
	public String Login(HttpServletRequest request) {
		String id= request.getParameter("id");
		String password = request.getParameter("password");
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		
		return "index";
	}
	
	@GetMapping("/test4")
	public String test4(WebRequest request) {
		String a= request.getParameter("a");
		String b= request.getParameter("b");
		
		System.out.println("a : "  + a);
		System.out.println("b : " + b);
		return "index";
	}
	
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a, @PathVariable int b, @PathVariable int c) {		// @PathVariable은 형변환 가능
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		return "index";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam int a, @RequestParam int b, @RequestParam int c) {	// a태그에 작성했던 이름과 똑같이 작성해줘야함.
		// 이름을 다르게 할경우 @RequestParam(value="a") 라고 작성해줘야함.
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		return "index";
	}
	@GetMapping("/test7")
	public String test7(@RequestParam int a, @RequestParam int b, @RequestParam int []c) {	// a태그에 작성했던 이름과 똑같이 작성해줘야함.
		// 이름을 다르게 할경우 @RequestParam(value="a") 라고 작성해줘야함.
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		for(int value:c)
			System.out.println("c : " + value);
		
		return "index";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam int a, @RequestParam int b) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		return "index";
	}
	
//	@GetMapping("/test8")
//	public String test8_1(@RequestParam int a, @RequestParam int b,
//							@RequestParam int c, @RequestParam(required=false) String d) {		
//					// required=false 넘어오는 값이 없으면 자동으로 null를 삽입하라  => 자료형을 string으로 주기
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
//		
//		return "index";
//	}
	
	@GetMapping("/test9")
	public String test9(@RequestParam Map<String, String> map) {
		String a=map.get("a");
		String b=map.get("b");
		String c=map.get("c");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		return "index";
	}
	
	@GetMapping("/test10")
	public String test10(@RequestParam Map<String, String> map,
						@RequestParam List<String> c) {
		String a=map.get("a");
		String b=map.get("b");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		for(String val: c)
			System.out.println("c : " + val);
		return "index";
	}
	
	@GetMapping("/test11")
	public String test11(@ModelAttribute TestDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "index";
	}
}

