package ch1;
//given an image presented by N*N matrix, each pixel in the image is 4 bytes, 
//write a method to rotate the image by 90degrees.
public class problem7 {
	public void matrixrotation(int[][] matrix, int n){
		for(int i = 0 ; i< n/2; i++){
			int start = i;
			int end = n-1-i;
		
			for(int j = start; j < end; j++ ){
				int left = matrix[start+j][start];//save left number
				//botom->left
				matrix[start+j][start] = matrix[end-1][start+j];
				//right->botom
				matrix[end][start+i]=matrix[end-i][end];
				//top->right
				matrix[start+i][end]=matrix[start][start+i];
				//saved left->top
				matrix[start][start+i+1]=matrix[end-i][start];
			}		
		}
		
	}
	
	public static void printing(int[][] matrix, int n){
		for(int i =0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
		int Bucky[][]={{1,2,3},{4,5,6},{7,8,9}};//input the matrix for rotation
		int newBucky[][]=matrixrotation(Bucky,3);
		printing(newBucky,3);
	}
	
}
