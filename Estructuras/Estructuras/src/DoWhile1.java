import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int base;
	    int altura;
	    double area;

	    do {
	        System.out.println("\nPara Salir del programa debe de poner un valor igual a 0.\n\nIngrese la base del triangulo: ");
	        base = entrada.nextInt();
	        System.out.println("Ingrese la ultura del triangulo: ");
	        altura = entrada.nextInt();

	        area = (base * altura) / 2;
	        System.out.println("El area total del triangulo es: " + area);
	    } while (base == 0 && altura == 0);

	    entrada.close();
	 }

}
