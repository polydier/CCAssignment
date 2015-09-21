package ch1;
//method isString to check if one is the subString of another. Given two string
//s1 and s2, write a code to check if s2 is a rotation of s1 using only one call to isSubstring
public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "waterbottle";//input the two strings you want to judge
		String B = "erbotteewat";
		System.out.println(Rotation(A,B));
	}
	
    public static boolean Rotation(String s1, String s2) {
        if(s1.length()!=s2.length()){
        	return false;
        }
        return isSubstring(s1+s1,s2);
    }
    
    public static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

}
