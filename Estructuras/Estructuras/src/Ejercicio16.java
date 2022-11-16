import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio;
        int cantidad;
        double Recibido;
        double totalPagar;
        double totalDevolver;

        System.out.println("Ingrese el precio del artıculo");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de articulos");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese la monto recibido");
        Recibido = entrada.nextDouble();


        totalPagar = precio * cantidad;
        if (totalPagar <= Recibido) {
            totalDevolver = totalPagar - Recibido;
            System.out.println("El total a pagar es de: " + totalPagar + " y se le debe de devolver: " + totalDevolver * -1);
        } else {
            System.out.println("Lo lamentamos el monto recibido es insuficiente, te hace falta dinero.");
        }
        entrada.close();
    }

}
