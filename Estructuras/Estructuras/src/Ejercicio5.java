import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese su anterior sueldo");
        valor = entrada.nextInt();
        double sueldoNuevo = valor * 1.25;
        System.out.println("Su nuevo suelso es: " + sueldoNuevo);
        entrada.close();
    }

}
