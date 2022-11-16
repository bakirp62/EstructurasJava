import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double porsentaje = 0.10;
        int horas;
        double salario;
        double descuento;
        String hola = "hola";
        hola.

        System.out.println("Ingrese las horas trabajadas: ");
        horas = entrada.nextInt();

        salario = horas * 2000;
        descuento = ((salario * porsentaje) - salario) * -1;

        System.out.println("Su salario seria de: " + descuento);
        entrada.close();
    }

}
