package Example1;


import java.util.Scanner;

public class SinhVien {
	private int stt;
    private String hoten;
    
    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    public void NhapSV(){
    	Scanner scan = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên: ");
        hoten = scan.nextLine();    
    }
}
