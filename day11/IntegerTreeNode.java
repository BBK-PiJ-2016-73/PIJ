

public class IntegerTreeNode {
	
	private	int max;
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	private int count;
	
	public IntegerTreeNode(){
		this.value = 0;
		this.left = null;
		this.right = null;
		this.count = 0;
		
	}
	
	public IntegerTreeNode(int newNumber){
		this.value = newNumber;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
			right.add(newNumber);
			}
			} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
			left.add(newNumber);
			}
		}
	}
	
	/*
	method which checks whether a number has been added to a tree 
	*/
	public boolean contains(int searchValue) {
		if (searchValue == this.value) {
			return true;
		} else if (searchValue > this.value) {
		
			if (right == null) {

				return false;
			} else {
				return right.contains(searchValue);
			}
		} else {
			if (left == null) {
			return false;
			} else {
				return left.contains(searchValue);
			}
		}
	}
	/*
	method which gets the maximum number of nodes on the tree 
	*/
	public int getMax(){
	    
		if(right != null)
		{
		  int max = right.getMax();
		  return max;
		}else{
			return this.value;
		}	
	} 
	
	/*
	method which gets the minimum number of nodes on the tree 
	*/
	public int getMin(){
	  if(left != null)
		{
		  int max = left.getMax();
		  return max;
		}else{
			return this.value;
		}
	}
	
	public String toString(String value){
		String array = "";
		if(value == "L"){
			if(left != null)
			{
			   array += "[" + left.value + "L]";
			   toString("L");
			}
			else{
				array += "[]";
			}
		
		}else if(value == "R"){
		}
		
		return array;
	}
	
}