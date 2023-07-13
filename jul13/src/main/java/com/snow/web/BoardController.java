package com.snow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// Ctrl + shift + o --> 임포트정리

@Controller
public class BoardController {
    //사용자가 /board라고 호출하면 동작할 메소드를 만들겠습니다.
	
	//요청에 대해서 연결시킬 녀석 
	@GetMapping("/board")  //get방식
	public String board() {
		return "board"; //jsp파일명
	}
	
	//@PostMapping("/board") //post방식
	//@RequestMapping("/board")  //둘다 
	
	
	
	
}
