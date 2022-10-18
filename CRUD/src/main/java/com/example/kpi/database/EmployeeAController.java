package com.example.kpi.database;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeAController {
	
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/A") 
	public List<EmployeeEntity> getSample(){
	ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
	for(EmployeeEntity emt:er.findAll()) {
		EmployeeEntity temp=new EmployeeEntity();
		temp.setId(emt.getId());
		if(emt.getEmployee_name().startsWith("a")) {
			temp.setEmployee_name(emt.getEmployee_name());
		}
		transformedvalues.add(temp);
	}
	return transformedvalues;
}

}