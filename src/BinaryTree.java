import java.util.ArrayList;

/**
 * 
 * @author luisk
 *
 */
public class BinaryTree {
	private Nodo root;
	private ArrayList<Integer> datos;
	
	public BinaryTree() {
		root = null;
		datos = new ArrayList();
	}

	public void insert(int valor) {
		root = insert(valor,root);
	}

	private Nodo insert(int valor,Nodo actual) {
		if(actual == null) {
			System.out.println("Se inserto el nodo con el valor "+valor);
			return new Nodo(valor);
		}else if(valor<actual.getValor()) {
			actual.linkIzq(insert(valor,actual.getIzq()));
		}else if(valor>actual.getValor()) {
			actual.linkDer(insert(valor,actual.getDer()));
		}else if(actual.getValor() == valor) {
			System.out.println("El valor "+valor+" ya existe");
		}
		return actual;
	}

	public void preOrder() {
		System.out.print("El arbol recorrido en preOrder es: ");
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Nodo node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getValor()+" ");
		preOrder(node.getIzq());
		preOrder(node.getDer());
	}

	public void postOrder() {
		System.out.print("El arbol recorrido en postOrder es: ");
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Nodo node) {
		if (node == null) {
			return;
		}
		postOrder(node.getIzq());
		postOrder(node.getDer());
		System.out.print(node.getValor()+" ");
	}

	public void inOrder() {
		System.out.print("El arbol recorrido en inOrder es: ");
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Nodo node) {
		if (node == null) {
			return;
		}
		inOrder(node.getIzq());
		System.out.print(node.getValor()+" ");
		inOrder(node.getDer());

	}

	public ArrayList<Integer> inOrder2() {
		ArrayList<Integer> b = inOrder2(root);
		return b;
	}

	private ArrayList<Integer> inOrder2(Nodo node) {
		if (node == null) {
			return null;
		}
		inOrder2(node.getIzq());
		datos.add(node.getValor());
		inOrder2(node.getDer());
		return datos;
	}
	
	private int min(Nodo current) {
		if(current.getIzq() == null) {
			return current.getValor();
		}else {
			return min(current.getIzq());
		}
	}
	
	private int max(Nodo current) {
		if(current.getDer() == null) {
			return current.getValor();
		}
		else {
			return max(current.getDer());
		}
	}
	
	public void diff() {
		int a = this.max(root); 
		int b = this.min(root);
		System.out.println("El valor maximo es: "+a);
		System.out.println("El valor minmo es: "+b);
		System.out.println("Y La diferencia es: "+(a-b));
	}
		
	public void eliminar(int valor) {
		root = eliminar(valor,root);
	}
		
	private Nodo eliminar(int valor,Nodo actual) {
		if(actual == null) {
			System.out.println("El valor "+valor+" no existe");
		}else if(valor < actual.getValor()) {
			actual.linkIzq(eliminar(valor,actual.getIzq()));
		}else if(valor > actual.getValor()) {
			actual.linkDer(eliminar(valor,actual.getDer()));
		}else {
			if(actual.getDer() == null && actual.getIzq() == null) {
				System.out.println("Se elimino el valor: "+actual.getValor());
				return null;
			}else if(actual.getDer() == null && actual.getIzq() != null) {
				System.out.println("Se elimino el valor: "+actual.getValor());
				return actual.getIzq();
			}else if(actual.getDer() != null && actual.getIzq() == null) {
				System.out.println("Se elimino el valor: "+actual.getValor());
				return actual.getDer();
			}else {
				System.out.println("Se elimino el valor: "+actual.getValor());
				actual.setValor(min(actual.getDer()));
				actual.linkDer(eliminar(actual.getValor(),actual.getDer()));
			}
		}
		return actual;
	}
	
}
