package com.example.kpi.database;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeedeptController {
	
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/dept") 
	public List<String> getSample(){
		List<String> l = new ArrayList<String>();
		for(EmployeeEntity emt:er.findAll()) {
			l.add(emt.getDept());
		}
		return l;
	}

}