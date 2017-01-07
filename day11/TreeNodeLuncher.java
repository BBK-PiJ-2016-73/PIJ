
public class TreeNodeLuncher{
	
	private static IntegerTreeNode treeNode;
	
	public static void main(String args[]) {
       treeNode = new IntegerTreeNode(1);
	   treeNode.add(2);
	   treeNode.add(3);
	   treeNode.add(4);
	   treeNode.add(5);
	   treeNode.add(7);
	   treeNode.add(11);
	  
	  System.out.println("Maximum on the tree node is: " + treeNode.getMax()); 	  
	  System.out.println("Minimum on the tree node is: " + treeNode.getMin()); 
	  System.out.println(treeNode.toString("L"));
	}
	
}