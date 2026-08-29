
public class OperacionesString {

    public static void analizarTexto(String texto) {
        int largo = texto.length();
        char letra = texto.charAt(4);
        String sub = texto.substring(7);
        String sub2 = texto.substring(3, 6);
        boolean ends = texto.endsWith(".");
        String mayus = texto.toUpperCase();

        System.out.println(largo);
        System.out.println(letra);
        System.out.println(sub);
        System.out.println(sub2);
        System.out.println(ends);
        System.out.println(mayus);
    }

    public static void revisarLargo(String usuario) {
        int largo = usuario.length();
        System.out.println("Username length: " + largo);

        if (largo >= 6) {
            System.out.println("Long enough: true");
        } else {
            System.out.println("Long enough: false");
        }
    }

    public static void checkStart(String text) {
        boolean starts = text.startsWith("user_");
        boolean starts2 = text.startsWith("admin_");

        System.out.println("Starts with user_: " + starts);
        System.out.println("Starts with admin_: " + starts2);
    }

    public static void modifUsername(String texto) {
        String primeros5 = texto.substring(0, 4);
        String mayus = primeros5.toUpperCase();

        System.out.println("First 5 chars: " + primeros5);
        System.out.println("Uppercase: " + mayus); 
    }

    public static String formatCourseInfo(String wuaja) {
        String[] arr = wuaja.split(":");
        return "Course Code: " + arr[0] +
        "\nCourse Name: " + arr[1] +
        "\nDays: " + arr[2] +
        "\nTime: " + arr[3];
    }

    public static String createCourseList(String[] wipig) {
        String text = String.join(", ", wipig);
        return "Available Courses: " + text;
    }

    public static String formatSchedule(String LS) {
        String[] sepa = LS.split(",");
        String days = String.join(" | ", sepa);
        return days;
    }

    public static void main(String[] args) {
        // String mensaje = "Hola, mundo!";

        // // Metodos de cadenas
        // // length() devuelve el numero de caracteres en la cadena
        // int largo = mensaje.length();
        // System.out.println(largo);

        // // charAt(int index) devuelve el caracter en el indice especificado
        // char primerChar = mensaje.charAt(0);
        // System.out.println(primerChar);

        // // substring(int inicio, int final) devuelve una subcadena desde el inicio (inclusive) hasta el final (exclusivo)
        // String sub = mensaje.substring(7);
        // System.out.println(sub);
        // String sub2 = mensaje.substring(7, 11 );
        // System.out.println(sub2);

        // // startsWith(String prefijo) comprueba si la cadena empieza con ese prefijo
        // boolean starts = mensaje.startsWith("Hola ,");
        // System.out.println(starts);

        // // endsWith(String sufijo) comprueba si la cadena termina con ese sufijo
        // boolean ends = mensaje.endsWith("o!");
        // System.out.println(ends);

        // // toUpperCase() convierte la cadena a mayusculas
        // String mayuscula = mensaje.toUpperCase();
        // System.out.println(mayuscula);

        // // toLowerCase() convierte la cadena a minusculas
        // String minuscula = mensaje.toLowerCase();
        // System.out.println(minuscula);

        // // indexOf(String str) devuelve el indice de la primera aparicion de str o -1 si no se encuentra
        // int index = mensaje.indexOf("mundo");
        // System.out.println(index);

        // .split() divide una cadena en un array de subcadenas basandose en un delimitador
        // Dividir por espacios en blanco
        // String text = "manzana platano cereza";
        // String[] frutas = text.split(" ");
        // System.out.println(Arrays.toString(frutas));

        // Dividir con un delimitador especifico
        // String data = "jhon,25,new york";
        // String[] dataArr = data.split(",");
        // System.out.println(Arrays.toString(dataArr));

        // String.join() combina los elementos de una iterable en una sola cadena
        // Union basica
        // String[] palabras = {"Hola", "Mundo", "Java"};
        // String texto = String.join(" ", palabras);
        // System.out.println(texto);

        // Unir con un separador
        // String[] frutas = {"pera", "uva", "sandia"};
        // String linea = String.join("_", frutas);
        // System.out.println(linea);

        //analizarTexto(mensaje);
        
        // En Java, String.format() es un metodo para crear cadenas con formato
        // Sintaxis: String formattedString = String.format("Texto con variables", arg1, arg2, ...)
        // %s inserta una cadena
        // %d inserta un entero
        // %f inserta un flotante
        // %b inserta un valor booleano
        // %c inserta un caracter
        // %n inserta un caracter de nueva linea
        // %.2f inserta un flotante con sus 2 decimales

        // String name = "Alice";
        // int age = 30;
        // double price = 19.99;

        // String formato = String.format("Name: %s, Age: %d, Price: %.2f", name, age, price);
        // System.out.println(formato);

        String str1 = "hola";
        String str2 = "hola";
        String str3 = "HOLA";
        String str4 = "mundo";

        // .equals() compara una cadena con otra. Devuelve true si son IGUALES y false si no lo son
        boolean eq1 = str1.equals(str2);
        System.out.println(eq1);
        // .equalsIgnoreCase() lo mismo pero ignora las mayusculas
        boolean eq2 = str1.equalsIgnoreCase(str3);
        System.out.println(eq2);
        // .compareTo() compara dos cadenas segun sus valores Unicode. Devuelve 0 si son iguales
        int cmp1 = str1.compareTo(str2);
        System.out.println(cmp1);
        // .compareToIgnoreCase() Ignora las mayusculas
        int cmp2 = str1.compareToIgnoreCase(str4);
        System.out.println(cmp2);
    }
}
