public class Ejercicio3 {
    public static void main(String[] args) {
        double a = 10.0, b = 5.0, c = 1.0;

        System.out.println("==================================================");
        System.out.println("- Suma: " + (a + b + c));
        System.out.println("- Resta: " + (a - b - c));
        System.out.println("- Multiplicación: " + (a * b * c));

        try {
            double division = (a + b) / c;
            System.out.println("- División: " + division);
            System.out.println("==================================================");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }
}
