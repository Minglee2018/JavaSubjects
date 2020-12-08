package Example2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFile {
	public static void textOutputFile() throws IOException{
		FileWriter outFileWrite= new FileWriter("danhsach.txt");
		PrintWriter out= new PrintWriter(outFileWrite);
		out.println("xyz");
		out.close();
	}
	public static void TextInputFile() throws IOException{
		FileReader inFileReader = new FileReader("danhsach.txt");
		BufferedReader in= new BufferedReader(inFileReader);
		String tmpStr;
		int anInt;
		double aDouble;
		boolean aBoolean;
		
		tmpStr=in.readLine();
//		anInt= (new Integer(tmpStr)).intValue();
		//Co the viet theo cach nay 
		anInt= Integer.parseInt(tmpStr);
		System.out.println(anInt);
		
		tmpStr= in.readLine();
		System.out.println(tmpStr);
		
		tmpStr=in.readLine();
		aDouble=(new Double(tmpStr)).doubleValue();
//		aDouble = new doubleValue(tmpStr)
		System.out.println(aDouble);
		
		tmpStr=in.readLine();
		aBoolean=(new Boolean(tmpStr)).booleanValue();
		System.out.println(aBoolean);
		in.close();
	}
	
	public static void binaryOutputFile() throws IOException{
		FileOutputStream outFile= new FileOutputStream("abc.bin");
		DataOutputStream out= new DataOutputStream(outFile);
		out.writeInt(2);
		for(int i=0; i<2; i++) {
			out.writeInt(123+i);
			out.writeUTF("HELLO WORLD");
			out.writeDouble(123.45+i);
			out.writeBoolean(false);
		}
		out.close();
	}
	
	public static void binaryInputFile() throws IOException{
		FileInputStream inFile = new FileInputStream("abc.bin");
		DataInputStream in= new DataInputStream(inFile);
		int recCount;
		String aStr;
		int anInt;
		double aDouble;
		boolean aBoolean;
		
		//Doc so luong ban ghi du lieu
		recCount= in.readInt();
		for(int i=0; i<recCount; i++) {
			anInt= in.readInt();
			System.out.println(anInt);
			aStr=in.readUTF();
			System.out.println(aStr);
			aDouble=in.readDouble();
			System.out.println(aDouble);
			aBoolean=in.readBoolean();
			System.out.println(aBoolean);
		}
		in.close();
	}
	

}
