package CollegeProject.Interface;

import java.util.ArrayList;
import java.util.List;

import CollegeProject.details.StudentDet;

public class StudentImpl implements StudentInt {

	public List<StudentDet> list;
	public StudentImpl() {
	list= new ArrayList<>();
	list.add(new StudentDet(12321,"shruti",123," koeri bari gaya"));
	}
	@Override
	public List<StudentDet> GetStudent() {
		
		return list;
	}

}
