package ch10;

//I use array instead of Listy, but I suppose I do not know the length of it.
//I just know how to get the elementAt(i)
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listy test = new Listy();
		for(int i =0; i< 40;i++){
			test.arr[i] = i;
		}//init 40 nums in Listy
		System.out.println(search(test,20));
	}

	static int search(Listy a, int b){
		int index = 1;
		while(a.elementAt(index)!=-1 && (a.elementAt(index)>b)) {
			index *= 2;
		}
		return binarySearch(a, b, index/2,index );
	}

	static int binarySearch(Listy a, int b, int low, int high){
		if(high<low)return -1;
		while(low<high){
		int mid = (high+low)/2;
		if(a.arr[mid]<b){
			low = mid+1;
		}else if(a.arr[mid]>b||a.arr[mid]==-1){
			high = mid-1;
		}else{
			return mid;
		}
		}
		return high;//when program run to this way, means high=low;
	}
}

class Listy {
	int[] arr;// use array to store the nums, suppose the num will not transcend
				// 100
	public Listy() {
		arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = -1;// when init, give all nums in arr value of -1
		}
	}
	public int elementAt(int i) {
		return arr[i];
	}
}
