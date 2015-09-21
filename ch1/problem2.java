package ch1;
// given two strings, write a method to decide if one is a permutation of the other
public class problem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String A = "abcdefg";
        String B = "gffdcba";
		boolean result = ispermutation(A,B);
		System.out.println(result);
	}
	//function to juge permutation
	public static boolean ispermutation(String A, String B){
		if(A.length()!=B.length()){
			return false;
		}
		for(int i=0; i<A.length(); i++){
			if(A.charAt(i)!=B.charAt(B.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}
