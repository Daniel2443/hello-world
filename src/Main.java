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
		
		
		bt.insert(5);
		bt.insert(2);
		bt.insert(7);
		bt.insert(9);
		bt.insert(3);
		bt.insert(1);
		bt.inOrder();
		bt.postOrder();
		bt.preOrder();
		System.out.println();
		bt.diff();
		BinaryTree vb = new BinaryTree();
		System.out.println();
		vb.insert(4);
		vb.insert(7);
		vb.insert(3);
		vb.insert(8);
		vb.insert(10);
		vb.insert(5);
		vb.insert(6);
		vb.inOrder();
		vb.postOrder();
		vb.preOrder();
		System.out.println();
		BinaryTree c = fn.mezclar(bt, vb);
		System.out.println();
		c.inOrder();
		c.postOrder();
		c.preOrder();
		System.out.println();
		c.diff();
		System.out.println();
		c.eliminar(5);
		System.out.println("Dice que se elimino el 6 pero es porque copia ese valor en el nodo que contenia \n"
				+ "el 5 y luego elimina el nodo hoja con el valor 6");
		c.inOrder();
		System.out.println();
		c.eliminar(1);
		c.eliminar(8);
		c.inOrder();
		System.out.println();
		c.eliminar(5);
		
		
		

	}

}
