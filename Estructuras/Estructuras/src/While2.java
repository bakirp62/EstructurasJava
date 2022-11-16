import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 1;
        while (valor != 0) {
            System.out.println("-------------------------------------------\nPara Salir del programa debe de poner un valor igual a 0.\n\nDigite un valor");
            valor = entrada.nextInt();
            double porsentaje = valor * 0.19;
            System.out.println("El 19% de " + valor + "es:  " + porsentaje);
        }
        entrada.close();
    }

}
