import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String args[]) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int sueldo;
        short HorasEstra;
        int sueldoTotal;
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextInt();
        System.out.println("Ingrese las horas estra laborados");
        HorasEstra= entrada.nextShort();
        sueldoTotal = (HorasEstra * 3000) + sueldo;
        System.out.println("su sueldo total es de: " + sueldoTotal);
        entrada.close();
    }

}
