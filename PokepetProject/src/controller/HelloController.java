package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView printHello() {
		ModelAndView m = new ModelAndView("hello");
		m.addObject("message", "Hello Spring MVC Framework!");
		return m;
	}

	@RequestMapping("/hi")
	public ModelAndView printHi() {
		ModelAndView m = new ModelAndView("hello");
		m.addObject("message", "Hi Spring MVC Framework!");
		return m;
	}
}