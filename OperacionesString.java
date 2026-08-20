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

    public static void main(String[] args) {
        String mensaje = "Hola, mundo!";

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

        analizarTexto(mensaje);
    }
}
