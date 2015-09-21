package ch1;
//string compression
public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Bucky="ioooe";
		System.out.println(compression(Bucky));
	}
	
	public static String compression(String str){
		if(str.length()==0||str==null){
			return str.toString();
		}//if the string is empty
		
		StringBuffer result = new StringBuffer();
		char last = str.charAt(0);
		result.append(last);
		int account = 1;
		int i=0;
		while(i < str.length()){
			if(str.charAt(i)==str.charAt(i+1)){
				account++;
				i++;
			}
			result.append(account);
			result.append(str.charAt(i));
			account=0;
		}
		return result.toString();
	}
}
