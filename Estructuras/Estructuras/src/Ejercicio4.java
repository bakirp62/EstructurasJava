import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        System.out.println("Digite un valor");
        valor = entrada.nextInt();
        double porsentaje = valor* 1.19 - valor;
        System.out.println("El 19% de " + valor + "es:  " + porsentaje);
        entrada.close();
    }

}
