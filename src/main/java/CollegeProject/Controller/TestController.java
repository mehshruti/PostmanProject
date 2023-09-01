package CollegeProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import CollegeProject.Interface.StudentImpl;
import CollegeProject.Interface.StudentInt;
import CollegeProject.details.StudentDet;

@RestController
public class TestController {
	@Autowired
	private StudentInt studentInt; 
	@GetMapping("/home")
	public String Test() {
		return "Hello world!";
	}
	@GetMapping("/test")
	public List<StudentDet> getInfo(){
		return this.studentInt.GetStudent();
	}
	@GetMapping("/test/{StudentId}")
	public StudentDet GetDetails(@PathVariable String StudentId)
	{
		return this.studentInt.GetDetails(Long.parseLong(StudentId));
	}
}
