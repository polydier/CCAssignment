package ch1;
//replace all space in a string with "%20", use character array
public class problem3 {
	public static void main(String[] args) {
		char[] bucky = {'k','b',' ','c','k'};
		//char[] bucky = {'a'};
		space(bucky,bucky.length);
	}
	
	public static void space(char[] line, int length){
		int spacecount = 0;
		for(int i=0; i<length; i++){
			if(line[i]==' '){
				spacecount ++;
			}
	System.out.println("spacecount:"+spacecount);
		}
		
		int newlength = length + 2*spacecount;
		char[] newline= new char[newlength];
		for(int i=newlength-1; i>0; i--){
			if(line[i-2*spacecount]==' '){
				newline[i]='0';
				newline[i-1]='2';
				newline[i-2]='%';
				spacecount-=1;
			}
			
			else{
				newline[i]=line[i-i-2*spacecount];
			}
		}
		System.out.println(newline);
	}
	
}
