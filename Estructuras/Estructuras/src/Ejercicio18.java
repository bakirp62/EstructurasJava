import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner (System.in);
        int base;
        int altura;
        double area;

        System.out.println("Ingrese la base del triangulo: ");
        base = entrada.nextInt();
        System.out.println("Ingrese la ultura del triangulo: ");
        altura = entrada.nextInt();

        area = (base * altura) / 2;
        System.out.println("El area total del triangulo es: " + area);
        entrada.close();
    }

}
