import java.util.HashMap;
import java.util.Map;

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

    public static void testHashMapMethods(HashMap<String, Integer> data) {
        if (data.isEmpty()) {
            System.out.println("Is empty: " + true);
        } else {
            System.out.println("Is empty: " + false);
        }

        int num = data.size();
        System.out.println("Size: " + num);

        data.clear();

        if (data.isEmpty()) {
            System.out.println("Is empty after clear: " + true);
        }
    }

    public static void modifyAndResetHashMap(HashMap<String, Integer> data) {
        if (data.isEmpty()) {
            System.out.println("Is empty: " + true);
        } else {
            System.out.println("Is empty: " + false);
        }

        System.out.println("Size: " + data.size());

        if (data.containsKey("Reset")) {
            System.out.println("Size after modification: " + data.size());
        } else {
            data.put("Reset", 0);
            System.out.println("Size after modification: " + data.size());
        }

        data.clear();

        if (data.isEmpty()) {
            System.out.println("Is empty after clear: " + true);
        }
    }

    public static void printInventory(HashMap<String, Integer> inventory) {
        for (String producto : inventory.keySet()) {
            System.out.println("Producto: " + producto + ", cantidad: " + inventory.get(producto));
        }
    }

    public static void printFilteredInventoryKeySet(HashMap<String, Integer> inventory) {
        for (String producto : inventory.keySet()) {
            if (inventory.get(producto) > 20) {
                System.out.println("Producto: " + producto + ", cantidad: " + inventory.get(producto));
            } else {
                System.out.println("No hay productos con una cantidad mayor");
            }
        }
    }

    public static void printInventoryEntrySet(HashMap<String, Integer> inventory) {
        for (Map.Entry<String, Integer> product : inventory.entrySet()) {
            System.out.println("Producto: " + product.getKey() + ", cantidad: " + product.getValue());
        }
    }

    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        String nombre = null;
        int num = 0;

        if (inventory.isEmpty()) {
            System.out.println("No products in inventory");
        } else {
            for (Map.Entry<String, Integer> product : inventory.entrySet()) {
                if (product.getValue() > num) {
                    num = product.getValue();
                    nombre = product.getKey();
                }
            }
            System.out.println("Most Stocked Product: " + nombre + ", Quantity: " + num);
        }
    }

    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        for (String categoria : inventory.keySet()) {
            System.out.println("Categoria: " + categoria);

            HashMap<String, Integer> items = inventory.get(categoria);

            if (items.isEmpty()) {
                System.out.println("  (No hay productos)");
            } else {
                for (String product : items.keySet()) {
                    System.out.println("  Producto: " + product + " , precio: " + items.get(product));
                }
            }
        }
    }

    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("No hay categorias en el inventario.");
        } else {
            for (String categoria : inventory.keySet()) {
                String proCaro = null;
                int masCaro = 0;
                System.out.println("Categoria: " + categoria);

                HashMap<String, Integer> items = inventory.get(categoria);

                if (items.isEmpty()) {
                    System.out.println("  No hay productos disponibles");
                } else {
                    for (String producto : items.keySet()) {
                        if (items.get(producto) > masCaro) {
                            masCaro = items.get(producto);
                            proCaro = producto;
                        }
                    }
                    System.out.println("  El producto mas caro: " + proCaro + ", precio: " + masCaro);
                }
            }
        }
    }

    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operaciones) {
        for (int i = 0; i < operaciones.length; i++) {
            String operacion = operaciones[i];
            String[] op = operacion.split(" ");

            
            if (op[0].equals("ADD")) {
                int cant = Integer.parseInt(op[2]);

                if (warehouse.containsKey(op[1])) {
                    warehouse.replace(op[1], warehouse.get(op[1]) + cant);
                } else {
                    warehouse.put(op[1], cant);
                }
            }

            if (op[0].equals("REMOVE")) {
                int cant = Integer.parseInt(op[2]);

                if (warehouse.get(op[1]) - cant <= 0) {
                    warehouse.remove(op[1]);
                } else {
                    warehouse.replace(op[1], warehouse.get(op[1]) - cant);
                }
            }

            if (op[0].equals("CHECK")) {
                if (warehouse.containsKey(op[1])) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }

            if (op[0].equals("PRINT")) {
                for (String producto : warehouse.keySet()) {
                    System.out.println("Product: " + producto + ", Quantity: " + warehouse.get(producto));
                } 
            }
        }
    }

    public static HashMap<String, Object> processHashMap(HashMap<String, Double> products) {
        String highestProduct = "";
        double highestPrice = 0;
        HashMap<String, Double> filteredProducts = new HashMap<>();
        double totalPrice = 0;

        if (products.isEmpty()) {
            HashMap<String, Object> result = new HashMap<>();
            result.put("Highest", "");
            result.put("Filtered", filteredProducts);
            result.put("Average", 0.0);
            return result;
        }

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String product = entry.getKey();
            double price = entry.getValue();
            totalPrice += price;

            if (price > highestPrice) {
                highestPrice = price;
                highestProduct = product;
            }

            if (price > 50) {
                filteredProducts.put(product, price);
            }
        }

        double averagePrice = totalPrice / products.size();

        HashMap<String, Object> result = new HashMap<>();
        result.put("Highest", highestProduct);
        result.put("Filtered", filteredProducts);
        result.put("Average", averagePrice);

        return result;
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

        // HashMap<String, Integer> scores = new HashMap<>();

        // System.out.println(scores.isEmpty());

        // scores.put("Coddy", 100);
        // System.out.println(scores.isEmpty());

        // System.out.println(scores.size());

        // scores.clear();
        // System.out.println(scores.isEmpty());

        // Iterar con keySet() significa obe¿tener un conjunto de todas las claves de HashMap
        // Y despues usar el metodo get() para obtener los valores correspondientes

        // HashMap<String, Integer> inventory = new HashMap<>();
        // inventory.put("Laptop", 10);
        // inventory.put("Mouse", 50);
        // inventory.put("Keyboard", 30);

        // for (String producto : inventory.keySet()) {
        //     System.out.println("Producto: " + producto + ", cantidad: " + inventory.get(producto));
        // }


        // Iterar con entrySet() significa obtener un conjunto de objetos Map.Entry del HashMap
        // Cada Map.Entry porporciona tanto la clave como su valor, lo que lo hace mas eficiente

        // HashMap<String, Integer> inventory = new HashMap<>();
        // inventory.put("Laptop", 10);
        // inventory.put("Mouse", 50);
        // inventory.put("Keyboard", 30);

        // for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
        //     System.out.println("Product: " + entry.getKey() + ", cantidad: " + entry.getValue());
        // }


        // Un HashMap anidado es un HashMap cuyos valores son, HashMaps
        // Esto nos permite organizar datos complejos jerarquicamente.

        HashMap<String, HashMap<String, Integer>> inventory = new HashMap<>();

        inventory.put("Electronics", new HashMap<>());
        inventory.get("Electronics").put("Laptop", 1200);
        inventory.put("Videojuegos", new HashMap<>());
        inventory.get("Videojuegos").put("Jump Force", 30000);

        for (Map.Entry<String, HashMap<String, Integer>> producto : inventory.entrySet()) {
            System.out.println("Tipo: " + producto.getKey() + ", contiene: " + producto.getValue());
        }
    }
}