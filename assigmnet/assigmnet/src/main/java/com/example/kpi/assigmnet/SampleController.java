package com.example.kpi.assigmnet;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	
	@Autowired
	private SchoolRepo sr;
	@GetMapping("/student") 
	
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
    	for(SchoolEntity emt:sr.findAll()) {
    		SchoolEntity temp=new SchoolEntity();
    		temp.setId(emt.getId());
    		if(emt.getName().contains(" ")) {
    			//temp.setName(emt.getName().replaceAll("", ""));
    		}
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}

}
