package com.controller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.controller.Config.GetConfig;
import com.controller.Interface.GetInterface;
@RestController
public class GitController {
	@Autowired
	private GetInterface getinterface;
@GetMapping("/Course/")
public List<GetConfig> getcourse() {

	return this.getinterface.getcourse();
}
@GetMapping("/Course/{CourseId}") 
public GetConfig getcourseId(@PathVariable String CourseId) {
	System.out.println("hiii");
	return this.getinterface.getcourse(Long.parseLong(CourseId));

}
@PostMapping("/Course/")
public GetConfig AddCourse( @RequestBody GetConfig getConfig) 
{
	return this.getinterface.addCourse(getConfig);
}

}