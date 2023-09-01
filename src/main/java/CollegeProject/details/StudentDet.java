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
	public StudentDet(long ID, String name, int roll, String add) {
		super();
		this.ID = ID;
		this.name = name;
		this.Roll = roll;
		this.Add = add;
	}
	
	public long getID() {
		return ID;
	}
	public void setID(long ID) {
		this.ID = ID;
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
		this.Roll = roll;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		this.Add = add;
	}

}
