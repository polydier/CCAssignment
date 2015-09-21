package ch1;
//check a string if it is a permutation of a palindrome.
public class problem4 {
	public static void main(String[] args){
		String bucky="acc cba";//input your testing string
		System.out.println(permutation(bucky));
	}
	
	public static boolean permutation(String str){
		str.toLowerCase();
		for(int i=0; i<(str.length()/2); i++){
		if(str.charAt(i)!=str.charAt(str.length()-1-i)){
			return false;
		  }
		}
		return true;
	}
}
