package ch1;
// Implement an algorithm to determine if a string has all unique characters

public class problem1 {
	public static void main(String[] args){
		String bucky = "abcdsjr";//input the testing string
		boolean result = uniquetest(bucky);
		System.out.println(result);
	}
	
	public static boolean uniquetest(String line){
		if(line.length()>26){
			return false;
		}//if the length of the line bigger than 26, must repeating
		char[] testline={'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0; i<testline.length; i++){
			int sum =0;
			for(int j=0;j<line.length();j++){
				if(testline[i]==line.charAt(j)){
					sum+=1;
				}	
			}
			if(sum > 1){
					return false;
				}
			}
		return true;	
	}	
}
