package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Member;

@Controller
@RequestMapping("hello")
public class HelloModelController {
	
	@GetMapping("model")
	public String helloView(Model model) {
		
		Member mb = new Member();
		mb.setId(1);
		mb.setName("次郎");

		Member mb2 = new Member();
		mb2.setId(2);
		mb2.setName("三郎");

		List<String> list = new ArrayList<>();
		list.add("東");
		list.add("西");
		list.add("南");
		list.add("北");
		
		Map<String, Member> map = new HashMap<>();
		map.put("tanaka", mb);
		map.put("suzuki", mb2);
		
		model.addAttribute("msg", "タイムリーフ");
		model.addAttribute("name", "太郎");
		model.addAttribute("number", 123);
		model.addAttribute("mb", mb);
		model.addAttribute("list", list);
		model.addAttribute("map", map);
		return "helloThymeleaf";
	}
	
	@GetMapping("fragment")
	public String fragmentView(Model model) {		
		return "useThymeleaf";
	}

}
