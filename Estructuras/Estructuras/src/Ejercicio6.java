import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String args[]) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int sueldo;
        short HorasEstra;
        int Total;
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextInt();
        System.out.println("Ingrese las horas estra laborados");
        HorasEstra = entrada.nextShort();
        Total = (HorasEstra * 3000) + sueldo;
        System.out.println("su sueldo total es de: " + Total);        entrada.close();
    }

}
