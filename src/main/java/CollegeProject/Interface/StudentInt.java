package CollegeProject.Interface;

import java.util.List;

import CollegeProject.details.StudentDet;

public interface StudentInt {
	
	public List<StudentDet> GetStudent();
	public StudentDet GetDetails(Long StudentId);

}
