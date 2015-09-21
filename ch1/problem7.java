package ch1;
//given an image presented by N*N matrix, each pixel in the image is 4 bytes, 
//write a method to rotate the image by 90degrees.
public class problem7 {
	public static void main(String[] args){
		
		int Bucky[][]={{1,2,3},{4,5,6},{7,8,9}};//input the matrix for rotation
		int newBucky[][]=rotate(Bucky,3);
		printing(newBucky,3);
	}
	
	public static int[][] rotate(int[][] origin, int n){
		int[][] newrotate = new int[n][n];
		for(int i = 0; i<n ; i++){
			for(int j =0; j<n; j++){
				newrotate[i][j]=origin[n-1-j][i];
			}
		}
		return newrotate;
	}
	
	public static void printing(int[][] matrix, int n){
		for(int i =0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
}
