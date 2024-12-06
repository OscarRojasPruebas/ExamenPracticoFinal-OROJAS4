public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Oscar", 30, 1.70);

        System.out.println("Datos de la persona:");
        persona1.imprimirDatos();

    }
}

