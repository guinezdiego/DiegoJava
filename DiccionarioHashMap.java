import java.util.HashMap;

public class DiccionarioHashMap {

    public static String getCapital(HashMap<String, String> capitals, String country) {
        if (capitals.get(country) != null) {
            return capitals.get(country);
        } else {
            return "Not found";
        }
    }

    public static int keyChecker(HashMap<String, Integer> randomValues, String[] keys) {
        int number = 0;
        
        for (int i = 0; i < keys.length; i++) {
            if (randomValues.containsKey(keys[i])) {
            number += 1;
            }
        }

        return number;
    }

    public static void updateInventory(HashMap<String, Integer> inventory, String productName, int quantityToAdd) {
        if (inventory.containsKey(productName)) {
            inventory.put(productName, inventory.get(productName) + quantityToAdd);
        } else {
            inventory.put(productName, quantityToAdd);
        }
    }

    public static HashMap<String, Integer> modifyMap(HashMap<String, Integer> data, String key, int newValue) {
        if (data.containsKey(key) && data.get(key) == newValue) {
            data.replace(key, newValue + 1);
        } else if (data.containsKey(key) && data.get(key) != newValue) {
            data.remove(key);
        } else {
            data.put(key, newValue);
        }

        return data;
    }

    public static HashMap<String, Integer> processHashMap(HashMap<String, Integer> data, String[] operations) {
        for (int i = 0; i < operations.length; i++) {
            String[] partes = operations[i].split(" ");
            String comando = partes[0];
            
            if (comando.equals("GET")) {
                if (data.containsKey(partes[1])) {
                    System.out.println(data.get(partes[1]));
                } else {
                    System.out.println("Not found");
                }
            } else if (comando.equals("CHECK")) {
                if (data.containsKey(partes[1])) {
                    System.out.println("Exists");
                } else {
                    System.out.println("Not found");
                }
            } else {
                int value = Integer.parseInt(partes[2]);

                if (data.containsKey(partes[1]) && data.get(partes[1]) == value) {
                    data.replace(partes[1], value + 1);
                } else if (data.containsKey(partes[1]) && data.get(partes[1]) != value) {
                    data.remove(partes[1]);
                } else {
                    data.put(partes[1], value);
                }
            }
        }
        return data;
    }
    public static void main(String[] args) {
        // Un HashMap es una estructura de datos que almacena pares clave-valor
        // Te permite recuperar rapidamente un valor mediante su clave asociada

        // Para crear un HashMap en Java usamos:
        // HashMap<KeyType, ValueType> mapName = new HashMap<>();

        // HashMap<String, Integer> population = new HashMap<>();

        // Para añadir valores al HashMap, utiliza el metodo .put()

        // population.put("USA", 12323123);
        // population.put("Chile", 271000);

        // En un HashMap, cada clave esta asociada a un valor. Para acceder a un valor
        // Usamos el metodo get() y proporcionas la clave
        // Si la clave no existe, el metodo get devuelve null

        // HashMap<String, Integer> ages = new HashMap<>();

        // ages.put("Alice", 30);
        // ages.put("Bob", 25);

        // Integer edadAlice = ages.get("Alice");
        // Integer edadCharlie = ages.get("Charlie");

        // System.out.println(edadAlice);
        // System.out.println(edadCharlie);

        
        // HashMap<String, String> capitales = new HashMap<>();
        // capitales.put("Peru", "Lima");
        // capitales.put("Argentina", "Buenos aires");

        // System.out.println(getCapital(capitales, "Chile"));


        // El metodo containsKey(key) comprueba si existe una clave especifica
        // Devuelve true o false

        // System.out.println(capitales.containsKey("Brasil"));

        // Los HashMap tambien admiten la eliminacion y actualizacion de entradas
        // Mediante los metodos put(), remove() y replace()

        // HashMap<String, String> usuarios = new HashMap<>();
        // usuarios.put("alice", "Admin");
        // usuarios.put("bob", "User");

        // // Para eliminar una clave
        // usuarios.remove("bob");
        // System.out.println(usuarios);

        // // Para actualizar una clave
        // usuarios.replace("alice", "Guest");
        // System.out.println(usuarios);


        // HashMap proporciona muchos metodos utiles para operaciones comunes
        // isEmpty() verifica si el HashMap esta vacio, devuelve true o false
        // size() devuelve la cantidad de clave-valr en el HashMap
        // clear() elimina todos los mapeos del HashMap

        HashMap<String, Integer> scores = new HashMap<>();

        System.out.println(scores.isEmpty());

        scores.put("Coddy", 100);
        System.out.println(scores.isEmpty());

        System.out.println(scores.size());

        scores.clear();
        System.out.println(scores.isEmpty()); 
    }

}