import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 1;
        double numero2 = 1;
        double numero3 = 1;
        double totalSuma = 1;

        for (double i = 0.0 ; totalSuma != i;) {
            System.out.println("----------------------------------\nPara salir del programa debe de poner todos los valores en 0. \ningrese los valores: ");
            numero1 = entrada.nextDouble();
            numero2 = entrada.nextDouble();
            numero3 = entrada.nextDouble();
            totalSuma = numero1+ numero2 + numero3;
            System.out.println("El total de la suma de los numeros es: " + totalSuma);

        }
        entrada.close();
    }

}
