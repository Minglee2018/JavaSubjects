package Example2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ManagerImpl implements Manager{
	private List<Student> studentList;
	
	public void init() {
		//sinh ngau nghien 30-50 sv
		int countStudent=RandomUtil.randomNumber(30, 50);
		List<Student> studentList= new ArrayList<Student>();
		for(int i=0; i<countStudent; i++) {
			Student temp= new Student(RandomUtil.randomString(), RandomUtil.randomString(), (byte) RandomUtil.randomNumber(0, 100), new Address());
			studentList.add(temp);
		}
		
		this.studentList= studentList;
	}
	
	@Override
	public boolean addStudent(Person p) {
		studentList.add((Student) p);
		
		return true;
	}

	@Override
	public boolean editStudent(Person p) {
		boolean ktra=false;
		for (Student student : studentList) {
			if(p.equals(student)) {
				student=(Student) p;
				ktra=true;
			}
		}
		
		return ktra;
	}

	@Override
	public boolean delStudent(Person p) {
		boolean ktra=false;
		for (int i=0; i<studentList.size();) {
			if(p.equals(studentList.get(i))) {
				studentList.remove(i);
				ktra=true;
			}else {
				i++;
			}
		}
		
		return ktra;
	}

	@Override
	public ArrayList<Student> searchStudent(Person[] list, String ten) {
		ArrayList<Student> result= new ArrayList<Student>();
		for(Person p: list) {
			if(p.getFirstName().equals(ten)) {
				result.add((Student) p);
			}
		}
		
		return result;
	}

	@Override
	public ArrayList<Student> searchStudent(Person[] list, Address addr) {
		ArrayList<Student> result= new ArrayList<Student>();
		for(Person p: list) {
			if(p.getAddress().equals(addr)) {
				result.add((Student) p);
			}
		}
		
		return result;
	}

	@Override
	public ArrayList<Student> addStudent(File f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> editStudent(File f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> delStudent(File f) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getStudent() {
		return studentList;
	}

	public void setStudent(List<Student> studentList) {
		this.studentList = studentList;
	}

	public ManagerImpl(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	public ManagerImpl() {
		super();
	}

}
