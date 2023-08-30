package com.controller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.Config.GetConfig;
import com.controller.Interface.GetInterface;
@ComponentScan(basePackages = {"com.example"})
@RestController
public class GitController {
	@Autowired
	private GetInterface getinterface;
@GetMapping("/876")
public List<GetConfig> getcourse() {
	System.out.println("hiii");
	return this.getinterface.getcourse();
}
}
