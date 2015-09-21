package practice;

public class problem5_2 {
	
		public static boolean main(String[] args){
			String a = "place";
			String b = "plac";
			String s1;
			String s2;
			s1 = a.length()<b.length()? a:b;
			s2 = a.length()<b.length()? b:a;		
			//s1 is the short one, s2 is the long one
			return distance(s1, s2);
		}
		
		public static boolean distance(String a, String b){
			int index1 = 0;
			int index2 = 0;
			boolean difference=false;
			while(index1<a.length() && index2< b.length()){
				if(a.charAt(index1) != b.charAt(index2)){
					if(difference){
						return true;
					}; //if there has been one difference, 
					//there can be the second difference, more than one edit
					difference = true; //mark the difference
				}
				if(a.length()!=b.length()){
					index2++;//m
				}
				index1++;
				index2++;
			 } 
			return true;
			}
	
			
}
		
		
