import java.util.*;
public class OperacionesRectangulo {

	public static void main (String args[]) {

		Scanner sc=new Scanner(System.in);
		double base=0; double altura=0;
		
		System.out.print("\ningresa una base: ");
		base = sc.nextDouble();
		System.out.print("\ningresa una altura: ");
		altura = sc.nextDouble();


		Rectangulo r1=new Rectangulo();
		System.out.println("Base por defecto: "+r1.getBase());
		System.out.println("Altura por defecto: "+r1.getAltura());
		r1.setBase(base);
		r1.setAltura(altura);

		
		System.out.println("Base despues de set: "+r1.getBase());
		System.out.println("Altura despues de set: "+r1.getAltura());			
		System.out.println("Area: "+r1.calculaArea());
		System.out.println("Perimetro: "+r1.calculaPerimetro());
	}
}
