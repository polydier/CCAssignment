package ch3;
//Desecribe how you use a single array to implement three stacks
public class Solution1 {

	public static class StackNode{
		int  value;
		StackNode next;		
		StackNode(int nvalue){
			value = nvalue;
		}
	}//define StackNode
	
	public static class StackfromArray{
		public StackNode[] Nodelink = new StackNode[9];//define the storage space for stacknode
		public int[] stackpointer = {0, 3, 6};//define the starting point, dividing 9 stack nodes
		//into {0,1,2} {3,4,5} {6,7,8}
	    public void push(int stacknum, int value) {
	    	Nodelink[stacknum].value = value;
	    	stackpointer[stacknum]++;//then the pointer move forward
	    }
	   
	    private void init(){
	    	Nodelink[0] = new StackNode(-1);
	    	for(int i = 1; i < 9; i++){
	    		Nodelink[i] = new StackNode(-1);//create the space for storing nums
	    		Nodelink[i-1].next = Nodelink[i];
	    	}
	    
	    }
	    
	    
	    public void pop(int stacknum) {//remove top of the stack
	    	Nodelink[stacknum].value = Nodelink[stacknum+1].value;
	    	Nodelink[stacknum].next = Nodelink[stacknum+1].next;
	    }
	    
	    public boolean Isempty(int stacknum) {
	    	for(int i = stacknum; i>stacknum-3; i--){
	    		if(Nodelink[stacknum].value != -1){
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	    
	    public StackNode peek(int stacknum){//return top of the stack
	    	return Nodelink[stacknum];
	    }
	    
	    StackfromArray makeStackfromArray(){
	    	return new StackfromArray();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  // Solution1.StackfromArray
	   //makeStackfromArray();
		StackfromArray outer = new StackfromArray();
		outer.init();
		outer.push(0, 1);
		outer.push(0, 1);
		outer.push(0, 1);
		outer.push(1, 1);
		outer.push(1, 1);
		outer.push(1, 1);
		outer.push(2, 1);
		outer.push(2, 1);
		outer.push(2, 1);
		outer.pop(1);
	}

}
