package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.Model1DTO;
import kr.hs.study.model.ModelDTO;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(ModelDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "/login/login";
	}
	
	@PostMapping("/test2")
	public String Login(LoginDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPassword());
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(Model1DTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		
		for(int val : dto.getC())
			System.out.println(val);
		return "result";
	}
	
}
