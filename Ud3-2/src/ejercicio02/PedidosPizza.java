package ejercicio02;

public class PedidosPizza {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("carbonara", "mediana");
		Pizza p2 = new Pizza("funghi", "familiar");
		p1.sirve();
		Pizza p3 = new Pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p1.sirve();
		System.out.println("pedidas: " + Pizza.getPedidas());
		System.out.println("servidas: " + Pizza.getServidas());

	}

}
