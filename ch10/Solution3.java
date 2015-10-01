package ch10;
//search in rotated array
public class Solution3 {
	public static void main(String[] args) {
		int[] a={30,40,50,60,70,10,20};
		System.out.println(newBinarySearch(a,20,0,a.length-1));
	}

	public static int newBinarySearch(int[] a, int b, int start, int end) {// locate b in a
		int mid = (start+end)/2;
		if(a[mid]>a[start]){
			if(b<a[mid]){
				return BinarySearch(a, b, start, mid-1);
			}else if(b>a[mid]){
				return newBinarySearch(a, b, mid, end);
			}else{
				return mid;
			}
		}
		else if(a[mid]<a[start]){
			if(b>a[mid]){
				return BinarySearch(a,b,mid,end);
			}else if(b<a[mid]){
				return newBinarySearch(a,b,start, mid-1);
			}else{
				return mid;
			}
		}
		return start;//if equals with start, just return start
	}

	public static int BinarySearch(int[] a, int b, int start, int end) {
		//int maxlocation = a.Arrays.sort(a);
		int mid;
		if(end<start) return start;
		while (start <= end) {
			mid = (start + end) / 2;
			if (b < a[mid]) {
				end = mid - 1;
			}else if(b>a[mid]){
				start = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
