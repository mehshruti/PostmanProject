package CollegeProject.details;

public class StudentDet
{
	private long ID;
	private String name;
	private int Roll;
	private String Add;
	
	public StudentDet() 
	{
	
	}	
	public StudentDet(long iD, String name, int roll, String add) {
		super();
		ID = iD;
		this.name = name;
		Roll = roll;
		Add = add;
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}

}
