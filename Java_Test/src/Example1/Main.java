 package Example1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			 //Sửa lại đường dẫn tuyệt đối trên local
		     File f = new File("E:/lap_trinh_java/Java_Test/test/danhsach.txt");
		     if (!f.exists()) {
		            try {
		                f.createNewFile();
		                
		            } catch (IOException ex) {
		                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		            }
		        }
		     FileWriter fw = new FileWriter(f);
		     
		     fw.write("DANH SACH SINH VIEN\n");
		     fw.write("| STT || HO TEN | \n");
		     List<SinhVien> stdList = new ArrayList<>();
	            System.out.println("Nhập số sinh viên: ");
	            int n = scan.nextInt();
	            SinhVien sv = null;
	            for(int i=0; i<n; i++){
	                System.out.println(" Nhập sinh viên thứ: " + (i+1));
	                sv = new SinhVien();
	                sv.NhapSV();
	                sv.setStt(i+1);
	                stdList.add(sv);
	            }
	            for(SinhVien std : stdList){
	                String stt = String.valueOf(std.getStt()) + " ";
	                String hoten = std.getHoten() + "\n";
	                fw.write(stt);
	                fw.write(hoten);
	            }
	            
	            int tong = stdList.size();
	            String tongSo = "Tong so: " + tong + "\n";
	            fw.write(tongSo);	     
	
		     fw.close();
		   } catch (IOException ex) {
		     System.out.println("Loi ghi file: " + ex);
		 }
			
		 try {
		     //Sửa lại đường dẫn tuyệt đối trên local
		     File f = new File("E:/lap_trinh_java/Java_Test/test/danhsach.txt");
		     FileReader fr = new FileReader(f);
		  
		     BufferedReader br = new BufferedReader(fr);
		     String line;
		     while ((line = br.readLine()) != null){
		       System.out.println(line);
		     }
		  
		     fr.close();
		     br.close();
		    } 
		 catch (Exception ex) {
		      System.out.println("Loi doc file: "+ex);
		  }
		            
	}
}
