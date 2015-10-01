package ch10;
//imporvement on binary search

public class Solution5 {

	public static void main(String[] args){
		String[] test = {"baco","","","","see","","","","zalo","","","Jery",""};
		System.out.println(search(test,"zalo"));
	}
	
	static int search(String[] Strings, String str, int start, int end){
		int mid = (start+end)/2;
		if(start>end){
			return -1;
		}
		if(Strings[mid].isEmpty()){
			int left = mid-1;
			int right = mid+1;
			while(true){
				if(left<start && right>end){
					return -1;
				}else if(right<end && !Strings[right].isEmpty()){
					mid = right;
					break;
				}else if(left>start && !Strings[left].isEmpty()){
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}
		if(str.equals(Strings[mid])){
			return mid;
		}else if(Strings[mid].compareTo(str)<0){
			return search(Strings, str, mid+1,end);
		}else if(Strings[mid].compareTo(str)>0){
			return search(Strings, str, start, mid-1);
		}
		return 0;//can I just delete it?
	}
	

	static int search(String[] Strings, String str){
		if(Strings==null||str==null||str==""){
			return -1;
		}
		return search(Strings, str, 0 ,Strings.length-1);
	}
}
