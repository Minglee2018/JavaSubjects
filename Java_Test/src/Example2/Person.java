package Example2;


public class Person implements Comparable<Person>{
	public static final String FIRSTNAME= "No FirstName";
	public static final String LASTNAME= "No FirstName";
	public static final byte AGE= 0;
	public static final Address ADDRESS= new Address();
	public static int count=0;
	private String firstName;
	private String lastName;
	byte age;// -128-->127
	private Address address;
	public Person()
	{
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}
	public Person(byte age) {
		this(Person.FIRSTNAME, Person.LASTNAME, age, Person.ADDRESS);
	}
	public Person(String firstName, String lastName, byte age, Address address) {
		this.firstName = firstName;
		this.lastName= lastName;
		this.age= age;
		this.address=new Address(address);
		Person.count++;
		
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public byte getAge() {
		return this.age;
	}
	public Address getAddress() {
		return address;
	}
	public Person setFirstName(String firstName)
	{
		this.firstName=firstName;
		return this;
	}
	public Person setLasttName(String lastName)
	{
		this.lastName=lastName;
		return this;
	}
	public Person setAge(byte age)
	{
		this.age=age;
		return this;
	}
	public Person setAddress(Address address) {
		this.address = address;
		return this;
	}
	public Person setAddress(String cityName, String districtName, String streetName) {
		this.address=new Address(cityName, districtName, streetName);
		return this;
	}
	public String toString() {
		return this.lastName+ " "+ this.firstName+ " "+ this.age+ " "+this.address.toString();
	}
	
	public static int getCountPerson() {
		return Person.count;
	}
	
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		
		if(this.age>p.getAge()) {
			return 1;
		}else if(this.age<p.getAge()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
