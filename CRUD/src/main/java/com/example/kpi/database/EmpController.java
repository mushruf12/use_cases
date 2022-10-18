package com.example.kpi.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class EmpController {
	@Autowired
	private EmployeeRepository er;
	
	@GetMapping("/samp") 
	
	public List<EmployeeEntity> list(){
		ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		temp.setId(emt.getId());
    		if(emt.getEmployee_name().contains("$")) {
    			temp.setEmployee_name(emt.getEmployee_name().replaceAll("\\$", ""));
    		}
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}

}
