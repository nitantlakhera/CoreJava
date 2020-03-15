package DataStructure.Tree;

public class SizeOfBinaryTree {
 static Node root;
	public static void main(String args []) {
		root = new Node(10);
		root.leftLink= new Node(20); 
		root.rightLink = new Node(30); 
		root.leftLink.leftLink = new Node(40); 
		root.rightLink.leftLink = new Node(50);    
		print(root);
		System.out.println("size is -> "+returnSize(root));
	}
	
	public static int returnSize(Node head) {
	   if(head==null) {
		   return 0;
	   }else{
		   return 1+ returnSize(head.leftLink)+returnSize(head.rightLink);
	   }
	}
	
	public static void print(Node root) {
		if(root!=null) {
			System.out.println(""+root.data);
			print(root.leftLink);
			print(root.rightLink);
		}
	}
}
