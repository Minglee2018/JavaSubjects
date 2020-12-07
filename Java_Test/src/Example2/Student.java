package Example2;

public class Student extends Person {
	public static final String ID="(2020)0123999999";
	public static final String SPECIALY="NONE";
	private String id;
	private String specialy;
	
	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS, Student.ID, Student.SPECIALY);
	}
	public Student(String firstName, String lastName, byte age, Address address) {
		super(firstName, lastName, age, address);
	}
	public Student(String firstName, String lastName, byte age, Address address, String id, String specialy) {
		super(firstName, lastName, age, address);
		this.id=id;
		this.specialy=specialy;
		
	}
	public String getId() {
		return id;
	}
	public String getSpecialy() {
		return specialy;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSpecialy(String specialy) {
		this.specialy = specialy;
	}
	@Override
	public String toString() {
		return "Student ["+super.toString()+" -ID =" + id + " ,SPE =" + specialy + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return ((Student) obj).getId().equals(this.id);
		}else return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}

