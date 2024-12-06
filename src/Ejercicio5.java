import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el total de tu compra: ");
        double total = scanner.nextDouble();

        if (total >= 1000) {
            total *= 0.8;
            System.out.println("Se aplica un descuento del 20%.");
        } else if (total >= 500) {
            total *= 0.9;
            System.out.println("Se aplica un descuento del 10%.");
        } else {
            System.out.println("No se aplica ningún descuento.");
        }
        System.out.println("El total a pagar es: " + total);
    }
}

