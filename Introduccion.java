public class Introduccion {
    public static void main(String[] args) {
        System.out.println("Hola Java");
        System.out.println("Esto sera divertido");
        System.out.println("Este es mi primer programa de Java");

        // Tipos de datos
        int cantidad = 10;
        double decimal = 6.7;
        System.out.println("cantidad: " + cantidad);
        System.out.println("decimal: " + decimal);

        String palabra = "Pan con mayo";
        System.out.println(palabra);

        boolean hay_pan = true;
        boolean hay_tomate = false;
        System.out.println(hay_pan);
        System.out.println(hay_tomate);

        // Caracteres, utilizan comilla simple
        char simbolo = '$';
        char exclamacion = '!';
        System.out.println(simbolo);
        System.out.println(exclamacion);

        // Constantes
        final int valor_max = 100;
        final String palabra2 = "Esto no se puede cambiar";
        System.out.println(valor_max);
        System.out.println(palabra2);

        // Conversion int a double
        int num = 5;
        double punto = num; // Se convierte automaticamente en 5.0
        System.out.println(punto);

        // Con calculo
        int x = 7;
        double result = x / 2.0; // El resultado es 3.5
        System.out.println(result);

        // Conversion double a int
        double deci = 9.7;
        int number = (int) deci; // Se convierte en 9
        System.out.println(number);

        // Con calculo
        double precio = 19.99;
        int redondearPrecio = (int) precio;
        System.out.println(redondearPrecio);

        // Convertir int, double y boolean a String
        int number1 = 789;
        double number2 = 789;
        boolean esValido = true;

        String text1 = String.valueOf(number1);
        String text2 = String.valueOf(number2);
        String text3 = String.valueOf(esValido);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);

        // Convertir String a int, double y boolean
        String numeroTexto = "123";
        int number3 = Integer.parseInt(numeroTexto); // Se convierte en 123
        System.out.println(number3);

        String textoDecimal = "45.67";
        double decimal1 = Double.parseDouble(textoDecimal);
        System.out.println(decimal1);

        String textoBool = "false";
        boolean esReal = Boolean.parseBoolean(textoBool);
        System.out.println(esReal);
    }
}

// Si se puede

