package in.hrishikesh.kharch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mov = new ModelAndView("home");
		return mov;
	}
	
}
