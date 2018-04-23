/**
 * 
 */

/**
 * @author Daniel Acuña Mora
 *
 */
public class BinaryTree {
	Node root;
	
	private Node addR(Node current, int value) {
		if(current==null) {
			return new Node(value);
			
		}
		if(value<current.value) {
			current.left = addR(current.left,value);
			
		}
		else if(value > current.value){
			current.right = addR(current.right,value);
		}else {
			return current;
		}
		return current;
	}
	public void add(int value) {
		root = addR(root,value);
	}
	public void preOrder() {
		preOrder(root);
	}
	private void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.value);
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(Node node) {
		if(node==null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);
		
	}
	public void postOrder() {
		
	}
	private void postOrder(Node node) {
		if(node==null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);
	}
}
