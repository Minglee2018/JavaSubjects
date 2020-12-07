package Example1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = new File("danhsach.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try{
            //Ghi file
            fileOutputStream = new FileOutputStream(file);
            String dong1 = "DANH SACH SINH VIEN\n";
            String dong2 = "|STT||HO TEN|\n";
            fileOutputStream.write(dong1.getBytes());
            fileOutputStream.write(dong2.getBytes());
            
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
                fileOutputStream.write(stt.getBytes());
                fileOutputStream.write(hoten.getBytes());
            }
            
            int tong = stdList.size();
            String tongSo = "Tong so: " + tong;
            fileOutputStream.write(tongSo.getBytes());
            
            
            //Doc file
            fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while(c != -1){
                System.out.print((char) c);
                c = fileInputStream.read();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
