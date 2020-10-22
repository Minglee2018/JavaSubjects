package array2D;



public class exampleArrays3 {
	
	public static int rows ; 
	public static int cols; 
	public static int m;
	public static int count = 0; 
	public static int[][] arr2D = null; 
	public static int[][] tmp = null; 
	
//	generator Arrays random 
	public static int getRandomIntValue(int MAX_VALUE) {
		return (int) (Math.random()*MAX_VALUE); 
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
			arrInt[i] = exampleArrays3.generateArray(cols);
		}
		return arrInt;
	}
	
//	genrator Arrays zero

	public static int[] generateArrayZero(int n) {
		int[] arrInt = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = 0;
		}
		return arrInt;
	}
	
	
	public static int[][] generateArrayZero(int rows, int cols) {
		int[][] arrInt = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			arrInt[i] = exampleArrays3.generateArrayZero(cols);
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
			exampleArrays3.printArray(row);
		}
	}
	public static void printArr() {
		for(int i=0; i<exampleArrays3.rows; i++) {
			for(int j=0; j<exampleArrays3.cols; j++) {
				if(exampleArrays3.tmp[i][j] ==1) { 
					System.out.print(exampleArrays3.arr2D[i][j] + "\t");
				}
				else System.out.print(0 + "\t");
					
			}
			System.out.print("\n");
		}
	}
	
//  solve problem 
	public static int check() {
		int sum = 0; 
		for(int i=0;i <exampleArrays3.rows; i++) { 
			for(int j=0; j<exampleArrays3.cols; j++) {
				if(exampleArrays3.tmp[i][j]==1)
					sum+=exampleArrays3.arr2D[i][j];
			}
		}
		return sum; 
	}
	
	public static void solve(int row, int col){
		if(check() == m)
		{
			count ++ ; 
			System.out.println("cách thứ: " + count);
			exampleArrays3.printArray2D(tmp);
			return ;
		}
		if(row <= rows - 1)
		{
			if(col <= cols -1) 
				for(int k =0; k<2; k++) {
					tmp[row][col] = k; 
					solve(row, col + 1);
				}
			else solve(row+1,0); 
			
		}
		
	}
	
	public static void main(String[] args) {
		exampleArrays3.rows = 5; 
		exampleArrays3.cols = 5; 
		exampleArrays3.m = 100; 
		exampleArrays3.arr2D = exampleArrays3.generateArray(exampleArrays3.rows, exampleArrays3.cols);
		exampleArrays3.tmp   = exampleArrays3.generateArrayZero(exampleArrays3.rows,exampleArrays3.cols); 
		exampleArrays3.printArray2D(arr2D);
		System.out.println();
		exampleArrays3.printArray2D(tmp);
		solve(0,0); 
//		exampleArrays3.printArray2D(arr2D);

	}
}
