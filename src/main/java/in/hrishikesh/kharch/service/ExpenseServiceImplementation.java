package in.hrishikesh.kharch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.hrishikesh.kharch.model.Expense;
import in.hrishikesh.kharch.repository.ExpenseRepository;

public class ExpenseServiceImplementation implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

}
