import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double totalSuma;

        System.out.println("ingrese los valores");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        numero3 = entrada.nextDouble();

        totalSuma = (numero1 + numero2 + numero3) * 2;
        System.out.println("El resultado es: " + totalSuma);
        entrada.close();
    }

}
