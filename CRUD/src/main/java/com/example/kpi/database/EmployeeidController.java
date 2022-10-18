package com.example.kpi.database;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeidController {
	
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/id") 
	public List<Integer> getSample(){
		List<Integer> l = new ArrayList<Integer>();
		for(EmployeeEntity emt:er.findAll()) {
			l.add(emt.getId());
		}
		return l;
	}

}