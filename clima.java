public class clima {
    public static void main(String[] args) {
        // nivel 1 - facil
        // presentacion personal
        System.out.println("Hola, mi nombre es Diego.");
        System.out.println("Estoy aprendiendo Java.");

        // variables numericas
        int edad = 20;
        double altura = 1.70;
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        // tipos de datos
        int num = 12;
        double decimal = 3.14;
        String texto = "Hola Java";
        boolean wipig = true;
        char simbolo = '$';
        System.out.println(num);
        System.out.println(decimal);
        System.out.println(texto);
        System.out.println(wipig);
        System.out.println(simbolo);

        // nivel 2 facil/medio
        // operaciones matematicas
        int a = 18;
        int b = 6;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        // incrementos
        int puntos = 50;
        puntos++;
        puntos++;
        puntos--;
        System.out.println(puntos);

        // conversiones
        double precio = 89.99;
        int newPrice = (int) precio;
        System.out.println(newPrice);

        // Nivel 3 - Medio
        // Conversiones entre String y numeros
        String numero = "250";
        int numero67 = Integer.parseInt(numero);
        System.out.println(numero67 + 100);

        // Comparaciones
        int nota1 = 65;
        int nota2 = 70;
        boolean bool1 = nota1 > nota2;
        boolean bool2 = nota1 < nota2;
        boolean bool3 = nota1 == nota2;
        boolean bool4 = nota1 != nota2;
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);

        // Comparar cadenas
        String usuario = "Diego";
        String usuario2 = "diego";
        boolean comp = usuario.equals(usuario2);
        boolean comp1 = usuario2.equalsIgnoreCase(usuario);
        System.out.println(comp);
        System.out.println(comp1);

        // Nivel 4 - Medio/Dificil
        // Operadores logicos
        boolean tieneCarnet = true;
        boolean tieneAuto = false;
        boolean result = tieneCarnet && tieneAuto;
        boolean result2 = tieneCarnet || tieneAuto;
        boolean result3 = !(tieneCarnet || tieneAuto);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        // Mini ficha de un videojuego
        String nombre = "Tatsumi";
        int vida = 100;
        double ataque = 136.7;
        boolean tieneEspada = true;
        char rango = 'S';
        System.out.println("=== PERSONAJE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Tiene espada: " + tieneEspada);
        System.out.println("Rango: " + rango);

    }
}
