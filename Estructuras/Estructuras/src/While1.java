import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sueldo = 1;
        short HorasEstra;
        int sueldoTotal;
        
        while (sueldo != 0) {

            System.out.println("Ingrese su sueldo");
            sueldo = entrada.nextInt();
            System.out.println("Ingrese las horas estra laborados");
            HorasEstra = entrada.nextShort();
            sueldoTotal = (HorasEstra * 3000) + sueldo;
            System.out.println("su sueldo total es de: " + sueldoTotal+ "\n Para salir debe de poner en el sueldo el numero 0");

           
        }
        entrada.close();
    }

}
