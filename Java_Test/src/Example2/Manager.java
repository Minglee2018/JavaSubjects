package Example2;

import java.io.File;
import java.util.ArrayList;

public interface Manager {
	public boolean addStudent(Person p);
	public boolean editStudent(Person p);
	public boolean delStudent(Person p);
	
	public ArrayList<Student> searchStudent(Person[] list, String ten);
	public ArrayList<Student> searchStudent(Person[] list, Address addr);
	
	public ArrayList<Student> addStudent(File f);
	public ArrayList<Student> editStudent(File f);
	public ArrayList<Student> delStudent(File f);
	
}
