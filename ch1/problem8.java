package ch1;
//if an element in an M*N matrix is 0; its entire row an column are set to 0
public class problem8 {
	public static void main(String[] args){
		int[][] matrix={{1,2,3},{1,0,4},{2,3,7}};
		setzero(matrix,3,3);
				System.out.print(matrix[i][j]+' ');
			System.out.println();
		}
		//setzero(matrix,matrix[0].length,matrix.length);
		//System.out.println(matrix.length);
		//printing(matrix);
		
	}
	
	public static void printing(int[][] origin){
		for(int i = 0; i<origin.length-1; i++){
			for(int j = 0; j<origin[0].length-1; j++){
				System.out.print(origin[i][j]+' ');
			}
			System.out.println();
		}
	}
	
	public static void setzero(int[][] origin, int m, int n){
		for(int i=0; i<m-1; i++){
			for(int j=0; j<n-1; j++){
				if(origin[i][j]==0){
					setline(origin,i);
					setcolumn(origin,j);
				}
			}
		}
	}
	
		public static void setline(int[][] origin,int m){
			for(int k =0; k<origin.length ;k++){
				origin[m][k]=0;
			}
	}//set all the line as zero
		
	public static void setcolumn(int[][] origin,  int n){
		for(int k =0; k<origin[n].length ;k++){
			origin[k][n]=0;
		}
	}//set all the column as zero
	*/
}
