package Example2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// init
		ManagerImpl manager = new ManagerImpl();
		manager.init();

		List<Student> studentList = manager.getStudent();
		// sort by name
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
		});

		Scanner scan = new Scanner(System.in);
		try {
			 //Sửa lại đường dẫn tuyệt đối trên local
			File f = new File("E:/lap_trinh_java/Java_Test/test/danhsach_bai2.txt");
			if (!f.exists()) {
				try {
					f.createNewFile();

				} catch (IOException ex) {
					System.out.println("Lỗi Tạo File: " + ex);
				}

			}
			FileWriter fw = new FileWriter(f);
			fw.write("STT\tTen");

			int i = 0;
			for (Person person : studentList) {
				i++;
				fw.write(i + "\t" + person.getFirstName() + "\n");
			}
			fw.write("Tong: " + i);
			fw.close();

			fw.close();
		} catch (IOException ex) {
			System.out.println("Lỗi Ghi File: " + ex);
		}

		try {
			 //Sửa lại đường dẫn tuyệt đối trên local
			File f = new File("E:/lap_trinh_java/Java_Test/test/danhsach_bai2.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
			br.close();
		} catch (Exception ex) {
			System.out.println("Lỗi Đọc File: " + ex);
		}

	}
}
