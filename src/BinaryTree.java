import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Daniel Acuña Mora
 *
 */
public class BinaryTree {
	Node root;
	ArrayList<Integer> datos = new ArrayList();

	private Node addR(Node current, int value) {
		if (current == null) {
			return new Node(value);

		}
		if (value < current.value) {
			current.left = addR(current.left, value);

		} else if (value > current.value) {
			current.right = addR(current.right, value);
		} else {
			return current;
		}
		return current;
	}

	public void add(int value) {
		root = addR(root, value);
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.value);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);

	}

	public ArrayList<Integer> inOrder2() {
		ArrayList<Integer> b = inOrder2(root);
		return b;
	}

	private ArrayList<Integer> inOrder2(Node node) {
		if (node == null) {
			return null;
		}
		inOrder2(node.left);
		datos.add(node.value);
		inOrder2(node.right);
		// a.add(node.value);
		return datos;
	}
	public int min(Node current) {
		if(current.left == null) {
			return current.value;
		}else {
			return min(current.left);
		}
	}
	public int max(Node current) {
		if(current.right==null) {
			return current.value;
		}
		else {
			return max(current.right);
		}
	}
//	public void diff() {
//		
//	}
	public void diffAux() {
		int a = this.max(root); 
		int b = this.min(root);
		System.out.println("El valor maximo es: "+a);
		System.out.println("El valor minmo es: "+b);
		System.out.println();
		System.out.println("Y La diferencia es: "+(a-b));
	}
}
