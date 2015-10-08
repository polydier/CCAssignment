package ch5;
// a screen is stored as a single array of bytes
//screen has width w, w is divisible by 8, the height of screen can be derived
//from the length of the array and the width. Implement a function that draws 
//a horizontal line from (x1,y) to (x2,y)
public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void drawline(byte[] screen, int width, int x1, int x2, int y){
		int start_byte = x1/8;
		int start_off = x1%8;
		//pay attention, 此处需要取出整数byte
		if(start_off!=0){
			start_byte++;
		}
		
		int end_byte = x2/8;
		int end_off = x2%8;
		//此处依然取出整数个byte
		if(end_off!=7){
			end_byte--;
		}
		
		for(int i= start_byte; i<= end_byte;i++){
			screen[(width/8)*y+i]=(byte)0xFF;
		}//change the color of the whole byte
		
		int start_mask = (byte)((0xFF)>>start_off);
		int end_mask = (byte)(~0xFF>>(end_off+1));
		
		if(start_byte==end_byte){//如果都发生在同一个格子里面
			screen[(width/8)*y+start_byte]=(byte)(start_mask&end_mask);
		}else{//如果发生在不同的格子里
			screen[(width/8)*y+start_byte-1]|=(byte)start_mask;
		    screen[(width/8)*y+end_byte+1]|=(byte)end_mask;
		}
				
	}
}
