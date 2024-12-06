import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("              SELECCIÓN CUENTAS                   ");
        System.out.println("==================================================");
        System.out.println("-          1: Cuenta Corriente                   -");
        System.out.println("-          2: Cuenta de Ahorro                   -");
        System.out.println("-          3: Cuenta Nómina                      -");
        System.out.println("==================================================");
        System.out.println("Seleccione el tipo cuenta según el número:");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("=====================================================");
                System.out.println("Has seleccionado una Cuenta Corriente.");
                System.out.println("Características: Ideal para transacciones frecuentes.");
                System.out.println("=====================================================");
                break;

            case 2:
                System.out.println("==================================================");
                System.out.println("Has seleccionado una Cuenta de Ahorro.");
                System.out.println("Características: Ideal para ahorrar con intereses.");
                System.out.println("==================================================");
                break;

            case 3:
                System.out.println("=======================================================");
                System.out.println("Has seleccionado una Cuenta Nómina.");
                System.out.println("Características: Diseñada para recibir pagos de nómina.");
                System.out.println("=======================================================");
                break;

            default:
                System.out.println("Opción no válida. Por favor, seleccione un número exitente entre las opciones");
        }
    }
}
