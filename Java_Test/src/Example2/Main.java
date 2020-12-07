package Example2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		//init
		ManagerImpl manager= new ManagerImpl();
		manager.init();
		
		List<Student> studentList=manager.getStudent();
		//sort by name
		Collections.sort(studentList, new Comparator<Student>() {//anonymous class
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
		});
		
		//ghi vo file
		FileWriter outFileWrite= new FileWriter("danhsach.txt");
		PrintWriter out= new PrintWriter(outFileWrite);
		out.println("STT\tTen");
		int i=0;
		for (Person person : studentList) {
			i++;
			out.println(i+"\t"+person.getFirstName());
		}
		out.println("Tong: "+i);
		out.close();
		
	}
}
