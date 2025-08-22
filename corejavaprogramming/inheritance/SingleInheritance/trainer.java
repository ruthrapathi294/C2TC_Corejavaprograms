package SingleInheritance;
public class trainer extends person {
	
	private int eid;
	private String designation;
	private String location;
	
	//Parameterized Constructor
	public trainer(int pid, String name, String city, int eid, String designation, String location) {
		
		super(pid, name, city);
		this.eid = eid;
		this.designation = designation;
		this.location = location;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "trainer [personid= "+ super.getPid()+" ,personName= "+ super.getName()+",personCity="+ super.getCity()+", id=" + eid + ", designation=" + designation + ", location=" + location + "]";
	}
	
	
	
}
