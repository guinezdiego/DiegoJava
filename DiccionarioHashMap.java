import java.util.HashMap;

public class DiccionarioHashMap {
    public static void main(String[] args) {
        // Un HashMap es una estructura de datos que almacena pares clave-valor
        // Te permite recuperar rapidamente un valor mediante su clave asociada

        // Para crear un HashMap en Java usamos:
        // HashMap<KeyType, ValueType> mapName = new HashMap<>();

        HashMap<String, Integer> population = new HashMap<>();

        // Para añadir valores al HashMap, utiliza el metodo .put()

        population.put("USA", 12323123);
        population.put("Chile", 271000);

        // En un HashMap, cada clave esta asociada a un valor. Para acceder a un valor
        // Usamos el metodo get() y proporcionas la clave
        // Si la clave no existe, el metodo get devuelve null

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 30);
        ages.put("Bob", 25);

        Integer edadAlice = ages.get("Alice");
        Integer edadCharlie = ages.get("Charlie");

        System.out.println(edadAlice);
        System.out.println(edadCharlie);

    }

}