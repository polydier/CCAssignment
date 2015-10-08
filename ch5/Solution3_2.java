package ch5;
// just use bruce force
public class Solution3_2 {
	static int Sequence_length=32;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int lastLongest(int num){
		int max = 0;
		
		for(int i=0;i<Sequence_length;i++){
			max = Math.max(max, LongestSequence(num,i));//找到flip每一个点时候点最大值
		}
		return max;
	}
	
	public static boolean getBit(int num, int i){//judge on the certain location is 0 or not
		return (num&(1<<i))!=0;
	}
	
	public static int LongestSequence(int num, int Change){//int Change represents the location that I can flip 0 to 1
		int max=0;
		int Count=0;
		for(int i=0;i<Sequence_length;i++){
			if(getBit(num,i)||i==Change){
				Count++;
				max = Math.max(Count,max);
			}else{
				Count=0;
			}
		}
		return max;
	}
}
