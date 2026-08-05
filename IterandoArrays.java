import java.util.Arrays;

public class IterandoArrays {
    public static void main(String[] args) {
        // La forma mas comun de iterar a traves de un array es usando un bucle for
        String[] frutas = {"Manzana", "Platano", "Naranja"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
        System.out.println("------------------------------");

        String[] palabras = {"Triangulo", "Pizza", "Completo", "Auto", "Cilindro"};

        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 5) {
                contador++;
            }
        }

        String[] newArray = new String[contador];

        int nuevoIndice = 0;

        for (String palabra : palabras) {
            if (palabra.length() > 5) {
                newArray[nuevoIndice] = palabra;
                nuevoIndice++;
            }
        }

        System.out.println(Arrays.toString(newArray));

        // El bucle for-each, propoeciona una forma mas sencilla de iterar
        // A traves de arreglos y colecciones
        int[] numeros = {1, 2, 3, 4, 5};

        for (int num : numeros) {
            System.out.println(num);
        }


        for (String fruta : frutas) {
            System.out.println(fruta.toUpperCase());
        }


        // Aqui hay algunas operaciones comunes con arrays
        // La suma de todos los elementos de un array
        int[] numeros2 = {2, 4, 6, 8, 10};

        int sum = 0;

        for (int num : numeros2) {
            sum += num;
        }

        System.out.println("Suma: " + sum);

        // El promedio de los elementos en un arreglo
        double prom = (double) sum / numeros2.length;

        System.out.println("Promedio: " + prom);

        // Encuenta el elemento maximo y el minimo
        int max = numeros2[0];
        int min = numeros2[0];

        for (int i = 1; i < numeros2.length; i++) {
            if (numeros2[i] > max) {
                max = numeros2[i];
            }

            if (numeros2[i] < min) {
                min = numeros2[i];
            }
        }

        System.out.println("El maximo: " + max);
        System.out.println("El minimo es: " + min);
    }
}
