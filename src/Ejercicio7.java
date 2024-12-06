import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        int suma = 0, contador = 0;

        do {
            System.out.print("- Ingrese una nota, para terminar ingrese (-1): ");
            nota = scanner.nextInt();

            if (nota != -1) {
                suma += nota;
                contador++;
            }
        } while (nota != -1);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("==================================================");
            System.out.println("- El promedio de las notas es: " + promedio);
            System.out.println("==================================================");
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
