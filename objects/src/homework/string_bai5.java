package homework;

import process.MyStrings;

public class string_bai5 {
	
	public static String formatWord(String st, int n) {
		st = st.trim(); 
		
		while(st.indexOf("  ")!=-1) {
			st = st.replace("  "," "); 
		}
		
		int cnt = 0; 
		boolean oke = false;
		String sub_st =""; 
		for (int i =0; i< st.length(); i++) {
			if(st.charAt(i) == ' ') {
				cnt ++ ; 
			}
			if(cnt <=n) {
				sub_st += st.charAt(i);
			}
			else 
				oke = true; 
		}
		if (oke) sub_st += "..."; 
		return sub_st; 
	}

	
	public static void main(String[] args) {
		String st = "Cộng hòa xã hội chủ nghĩa việt nam độc lập tự do hạnh phúc";  // chuỗi ban đầu 
		int n = 10; // số từ cần lấy 
		st = string_bai5.formatWord(st, n-1); 
		System.out.print(st);
		
	}
	
}
