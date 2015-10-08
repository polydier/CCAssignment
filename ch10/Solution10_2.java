package ch10;
//use binary thinking in this method
public class Solution10_2 {
	public static void main(String[] args){
		CountNode nod1 = new CountNode(1);
		CountNode nod2 = new CountNode(2);
		CountNode nod3 = new CountNode(3);
		CountNode nod4 = new CountNode(4);
		CountNode nod5 = new CountNode(5);
		CountNode nod6 = new CountNode(6);		
	}


static public void insert(CountNode origin, int x){
	if(x<=origin.data){
		if(origin.left!=null)insert(origin.left,x);
		else origin.left=new CountNode(x);
		origin.left.Count = origin.Count;
		origin.Count++;
	}else{
		if(origin.right!=null) insert(origin.right,x);
		else origin.right = new CountNode(x);
	}
}

static public int getRank(CountNode root, int x){
	if(x==root.data){
		return root.Count;}
	if(x<root.data){
		if(root.left==null) return -1;
		else{
		return getRank(root.left,x);}
	if(x>root.data){
		if(root.right==null) return -1;
		return root.Count+1+getRank(root.right,x);}
	}
}

 class CountNode{
	 int Count=0;//record the amount of num less the this node
	 int data;
	 CountNode left;
	 CountNode right;
	 CountNode(int ndata){
		 data= ndata;
	}	 	 
}
 