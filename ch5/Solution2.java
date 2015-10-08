package ch5;

//if the input double from 0 to 1 cannot be presented within 32 characters, print "ERROR"
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test = 1.111;
		System.out.println(judge(test));

	}
	// the thinking is to multiply 2 everytime and check the number before point
	// is more than 1 or not

	public static String judge(double num) {
		StringBuilder Binary = new StringBuilder();
		if (num >= 1 | num <= 0) {
			return "ERROR";
		}
		Binary.append(".");
		while (num > 0) {
			if (Binary.length() >= 32) {
				return "ERROR";
			}
			double n = num * 2;
			if (n > 1) {
				num = n - 1;
				Binary.append(1);
			} else {
				num = n;
				Binary.append(0);
			}
		}
		return Binary.toString();
	}

}
