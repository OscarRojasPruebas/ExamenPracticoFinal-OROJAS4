import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {
        String nombres = "Antony|Fredy|Julian|Marcos";
        List<String> listaNombres = new ArrayList<>(Arrays.asList(nombres.split("\\|")));

        System.out.println("Los nombres en la lista son:");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }
}
