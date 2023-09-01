package CollegeProject.Interface;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import CollegeProject.details.StudentDet;
@Service
public class StudentImpl implements StudentInt {

	public List<StudentDet> list;
	public StudentImpl() 
	{
	list= new ArrayList<>();
	list.add(new StudentDet(12321,"shruti",123," koeri bari gaya"));
	list.add(new StudentDet(12312,"surbhi",120," koeri bari gaya"));
	}
	@Override
	public List<StudentDet> GetStudent() {
		
		return list;
	}
	@Override
	public StudentDet GetDetails(Long StudentId) {
		StudentDet c= null;
		for(StudentDet Student : list)
		{
			if(Student.getID()==StudentId)
			{
				c=Student;
				break;
			}
		}
		return c;
	}

}
