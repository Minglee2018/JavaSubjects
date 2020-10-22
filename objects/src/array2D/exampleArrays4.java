package array2D;


public class exampleArrays4 {
	
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
			arrInt[i] = exampleArrays4.generateArray(cols);
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
			exampleArrays4.printArray(row);
		}
	}
	
//swap 
	
	public static int [][] solve(int[][] Arr,int rows, int cols, int number_of_sort_col){
		int[] arr = new int[rows]; 
		int[] arrIndex = new int[rows]; 
		
		for(int i =0; i< rows; i++) {
			arr[i] = Arr[i][number_of_sort_col];
			arrIndex[i] = i;  
		}
		int tmp1, tmp2; 
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]  > arr[j] ) {

					tmp1 = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp1;
					tmp2 = arrIndex[i]; 
					arrIndex[i] = arrIndex[j];
					arrIndex[j] = tmp2; 
					
				}
			}
		}
		int[][] arr2D = new int[rows][cols];
		for(int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j ++) {
				arr2D[i][j] = Arr[arrIndex[i]][j];  
			}
		}
		
		return arr2D; 
	}
	


	public static void main(String[] args) {
		int rows = 5; 
		int cols = 10; 
		int number_of_sort_col = 5; 
		int[][] arr2D = exampleArrays4.generateArray(rows, cols);
		System.out.println("\n mảng chưa sắp xếp theo côt " + number_of_sort_col + " là: \n ");
		exampleArrays4.printArray2D(arr2D);
		System.out.println("\n mảng đã sắp xếp theo côt " + number_of_sort_col + " là: \n ");
		exampleArrays4.printArray2D(exampleArrays4.solve(arr2D, rows, cols, number_of_sort_col));

	}
	
}
