package homework;
import java.util.*;

public class string_bai6 {
	public static void statisticWord (String str) {
		Dictionary<String, Integer> dict = new Hashtable<String, Integer>();

		str +='#'; 
		str = '#' + str; 
		 String tmp = "";
		 for (int i = 0; i < str.length(); i++ ) { 
			 if(str.charAt(i)!='#') tmp += str.charAt(i);  
			 else 
			 {
				 if(tmp != "") {
					 if(dict.get(tmp)==null) {
						 dict.put(tmp, 1); 
					 }
					 else 
					 {
						 dict.put(tmp,(int)dict.get(tmp) + 1 ); 
					 }
					 tmp = "";
				 }
				 
			 }
		 }
		 for (Enumeration<String> k = dict.keys(); k.hasMoreElements();) { 
			 String word =  k.nextElement(); 
	         System.out.println(" Từ: " + word + " \t  lặp lại: " + dict.get(word) + " lần."); 
	      } 		 
	}
	public static void main(String[] args) {
		String str = "aaa#aaa#aaa#a#a#ab#ab#ab#b#jkj3ss"; 
		string_bai6.statisticWord(str);
		
	}
	
}
