import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Daniel Acuña Mora, Luis Carlos Mora Fonseca, Greivin Salas 
 *
 */
public class Funciones {

	public BinaryTree mezclar(BinaryTree a, BinaryTree b) {
		ArrayList<Integer> x = a.inOrder2();
		ArrayList<Integer> y = b.inOrder2();

		BinaryTree c = new BinaryTree();
		for (int i = 0; i < x.size(); i++) {
			c.insert(x.get(i));

		}
		for (int i = 0; i < y.size(); i++) {
			c.insert(y.get(i));
		}
		c.inOrder();
		return c;
	}
}
