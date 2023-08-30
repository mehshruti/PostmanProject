package com.MainPackage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MainPackage.Config.EmployeeDetails;
import com.MainPackage.Interface.EmpInt;

@RestController
public class tControllerProgram {
	@Autowired
	private EmpInt empInt;
	
	@GetMapping("/Employee")
	public List<EmployeeDetails> getdata() 
	{
	return this.empInt.getInfo();
}

}
