/**
 * 
 */

/**
 * @author Daniel Acuña Mora
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.add(5);
		bt.add(2);
		bt.add(7);
		bt.add(9);
		bt.add(3);
		bt.add(1);
		bt.preOrder();
		System.out.println();
		bt.inOrder();
		System.out.println();
		bt.postOrder();
	}

}
