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
		
		Funciones fn = new Funciones();
		
		
		bt.add(5);
		bt.add(2);
		bt.add(7);
		bt.add(9);
		bt.add(3);
		bt.add(1);
		bt.diffAux();
		BinaryTree vb = new BinaryTree();
		vb.add(4);
		vb.add(7);
		vb.add(3);
		vb.add(8);
		vb.add(10);
		vb.add(5);
		vb.add(6);
		fn.mezclar(bt, vb);
		
		
		

	}

}
