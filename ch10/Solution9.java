package ch10;
//given M*N matrix in which each row and column is sorted in ascending order
//write a method to find an element
public class Solution9 {

	static void main(String[] args){
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		boolean result = findElement(matrix,3);
		System.out.println(result);
	}
	
	static boolean findElement(int[][] matrix, int element){
		int row = 0;
		int column = matrix[0].length-1;
		while(row< matrix.length && column>=0){
			if(matrix[row][column]==element){
				return true;
			}else if(matrix[row][column]> element){
				column--;
			}else{
				row++;
			}
		}
		return false;
	}
}
