import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final var mapPersonas = Map.of(
                "Adriana", 53,
                "Rodrigo", 32,
                "Jimena", 74,
                "Nayigia", 53,
                "Nayelli", 24,
                "Ligia", 78,
                "Ligeli", 51
        );

        System.out.printf("El map de personas es: %s%n", mapPersonas);

        final var edadNayigia = mapPersonas.get("Nayigia");
        final var edadLigeli = mapPersonas.get("Ligeli");
        System.out.printf("La suma de las edades es : %s%n", edadLigeli + edadNayigia);
    }
}
