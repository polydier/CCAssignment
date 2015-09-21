package ch1;
/*judge three types of edits performed on strings:insert, 
 * remove, replace a character.Given two strings, write a function to
 * check if they are one edit(or zero) away.
 */
public class problem5
 {
	public boolean oneeditdistance(String a, String b){
		if(a.length()>b.length()){
			String temp = b;
			b = a;
			a = temp;
		}
		if(b.length()-a.length()>1){
			return false;
		}
		boolean have = false;
		for(int i =0, j= 0; i<a.length(); i++,j++){
			if(a.charAt(i) != b.charAt(i)){
				if(have){
					return false;
				}
				have = true;
				if(a.length()<b.length()){
					--i;
				}
			}
		}
		return (have)||(a.length()<b.length());
	}
}
