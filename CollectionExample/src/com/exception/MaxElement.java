package com.exception;
import java.util.Arrays;

public class MaxElement {

    private static int maxElement(int[] row){
        int max = row[0];
        for (int i : row) max = Math.max(max, i);
        return max;
    }
    
   
    private static int[] maxElementRow(int[][] matrix) {
        int[] rowMaxElements = new int[matrix.length];
        int i = 0;
        for(int[] row: matrix) {
            rowMaxElements[i] = maxElement(row);
            i++;
        }
        return rowMaxElements;
    }

    public static void main(String[] args) {
        int[][] matrix = { {12, 43,1,4},
                            {234, 54, 5,8},
                            {642, 687, 9, 4},
                            {23, 99,2,0}
        };
        int[] maxElements = maxElementRow(matrix);
       
        System.out.println("Maximum elements in each row are as follows: ");
        System.out.println(Arrays.toString(maxElements));
        
        
        System.out.println("-------------------------------------");

        
        largestInColumn(4, matrix);
    }

	private static void largestInColumn(int cols, int[][] arr) {
		// TODO Auto-generated method stub
		
		
		 for (int i = 0; i < cols; i++) {
			 
	            // Initialize max to 0 at beginning
	            // of finding max element of each column
	            int maxm = arr[0][i];
	            for (int j = 1; j < arr[i].length; j++)
	                if (arr[j][i] > maxm)
	                    maxm = arr[j][i];
	 
	            System.out.println(maxm);
	        }
	}


}