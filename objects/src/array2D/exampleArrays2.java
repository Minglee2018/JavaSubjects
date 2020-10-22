package array2D;



public class exampleArrays2 {
	
	public static int getRandomIntValue(int MAX_VALUE) {
		return (int) (Math.random()*MAX_VALUE); 
	}
	
	public static boolean isPrime(int n) {
		boolean flag = true; 
		for (int i = 2; i<= Math.sqrt(n); i++)
			if (n%i==0) flag = false; 
		return flag; 
	}
	public static int[] generateArray(int n) {
		int[] arrInt = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = getRandomIntValue(100);
		}
		return arrInt;
	}
	public static int[][] generateArray(int rows, int cols) {
		int[][] arrInt = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			arrInt[i] = exampleArrays2.generateArray(cols);
		}
		return arrInt;
	}
	
//	print
	public static void printArray(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.print(arrInt[i] + "\t");
		}
		System.out.println();

	}

	public static void printArray2D(int[][] arrInt) {
		for (int[] row : arrInt) {
			exampleArrays2.printArray(row);
		}
	}
	public static int[][] solve(int[][] arr,int rows, int cols){
		
		int avg = 0; 
		for(int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++) {
				avg+=arr[i][j]; 
			}
		}
		avg = avg / (rows*cols); 
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(arr[i][j] > avg) arr[i][j] = -1; 
			}
		}
		
		System.out.println("phần tử trung bình của mảng là:" + avg);
		return arr; 
		
	}
	
	public static void main(String[] args) {
		int rows = 5; 
		int cols = 10; 
		int[][] arr2D = exampleArrays2.generateArray(rows, cols);
		arr2D = solve(arr2D, rows, cols); 
		
		System.out.println("lọc thông thấp: \n ");
		exampleArrays2.printArray2D(arr2D);

	}
}
