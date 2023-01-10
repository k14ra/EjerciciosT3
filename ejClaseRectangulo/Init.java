package ejClaseRectangulo;

public class Init {

	public static void main(String[] args) {
		//Rectangulo rec = new Rectangulo();
		
		Rectangulo rec = new Rectangulo(7, 5);
		rec.imprimeRectangulo();
		
		System.out.println("Es horizontal? " + rec.isHorizontal());
		System.out.println("Area: " + rec.getArea());
		System.out.println("Perimetro: " + rec.getPerimetro());

	}
}
