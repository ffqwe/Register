package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {

	@RequestMapping("/")    // "/" で来たリクエストを"input.html"へ渡す
	public String start() {
		return "input.html";
	}

	@RequestMapping("/register")  //input.HTMLからのリクエストを受け取る
	public ModelAndView register  // MODELとVIEWを保持  RegisterBeanはRegisterBean.javaに値を渡す
	(@ModelAttribute RegisterBean rb, ModelAndView m) {
		//@ModelAttribute HTMLからリクエストパラメータを取得することができる（今回だと氏名、年齢）
		m.addObject("rb", rb);//Modelを保持
		m.setViewName("register.html");//ModelとViewを保持
		return m;  // 20行目register.html　へ遷移
	}
}
