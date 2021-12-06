package in.hrishikesh.kharch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.hrishikesh.kharch.model.Expense;
import in.hrishikesh.kharch.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mov = new ModelAndView("home");
		mov.addObject("message", "List of Expenses");
		List<Expense> expenses = expenseService.findAll();
		System.out.println(expenses);
		return mov;
	}
	
}
