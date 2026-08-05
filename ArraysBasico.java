import java.util.Arrays;

public class ArraysBasico {
    public static int[] improveGrade(int[] arr, int index) {
        if (arr[index] + 5 > 100) {
            arr[index] = 100;
        } else {
            arr[index] += 5;
        }

        return arr;
    }

    public static int[] replaceFailingGrade(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 60) {
                arr[i] = 60;
            }
        }

        return arr;
    }

    public static int[] addBonusPoints(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }

        return arr;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int total = arr1.length + arr2.length;

        String[] nuevaArray = new String[total];

        System.arraycopy(arr1, 0, nuevaArray, 0, arr1.length);
        System.arraycopy(arr2, 0, nuevaArray, arr1.length, arr2.length);

        Arrays.sort(nuevaArray);

        return nuevaArray;
    }

    public static String[] createSeatingChart(String[] nombres, double[] calificaciones) {
        String[] nuevaArray = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            nuevaArray[i] = nombres[i] + ": " + calificaciones[i];
        }

        Arrays.sort(nuevaArray);

        return nuevaArray;
    }

    public static String[] findTopStudents(double[] notas) {
        String[] estudiantesTop = new String[notas.length];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6.5) {
                estudiantesTop[i] = "A+";
            } else {
                estudiantesTop[i] = "A";
            }
        }
        return estudiantesTop;
    }

    public static boolean isClassEqual(double[] notas1, double[] notas2) {
        return Arrays.equals(notas1, notas2);
    }

    public static double prod(double[] arr) {
        double total = 1;
        for (int i = 0; i < arr.length; i++) {
            total *= arr[i];
        }

        return total;
    }

    public static double[] reverse(double[] arr) {

        double[] reversed = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }

    public static void main(String[] args) {
        // //Ejemplo para crear un array
        // int[] numeros = {1, 2, 3, 4, 5};
        
        // // Para comprobar la longitud del array
        // // Podemos usar el campo ".length"
        // int largo = numeros.length;
        // System.out.println(largo);

        // // Otra forma de crear un array
        // // Es utilizando la palabra clave "new"
        // int[] numeros1 = new int[5]; // Crea un array de 5 enteros, todos iniciados en 0
        // System.out.println(Arrays.toString(numeros1));

        // String[] shoppinList = {"bread", "eggs", "milk", "butter"};
        // System.out.println(Arrays.toString(shoppinList));

        // // Cada array tiene uno o mas elementos
        // // Y cada elemento tiene un indice
        // // Los indices comienzan desde 0 hasta la longitud del array menos 1
        // char[] letras = {'a', 'b', 'c', 'd', 'f', 'g'};
        // System.out.println(letras[0]);

        // Para iterar sobre un array usa .length
        // for (int i = 0; i < letras.length; i++) {
        //     System.out.println(letras[i]);
        // }

        // Para  modificar un elemento especifico en un array
        // Puedes asignarle un nuevo valor usando su indice
        // String[] miArray = {"apple", "banana", "cherry"};
        // miArray[1] = "orange";
        // System.out.println(miArray[0] + ", " + miArray[1] + ", " + miArray[2]);

        // Los arrays estan repletos de muchos metodos
        // Aqui una lista de los metodos basicos
        // 1.- fill(array, value) rellena el array con un valor especifico
        // 2.- toString() convierte el array en una cadena
        // 3.- sort(array) ordena el array en orden ascendente
        // 4.- equals(array1, array2) compara dos arrays para determinar si son iguales

        // int[] numeros2 = new int[5];
        // Arrays.fill(numeros2, 10);
        // System.out.println(Arrays.toString(numeros2));

        // int[] numeros3 = {5, 2, 9, 1, 5, 6};
        // Arrays.sort(numeros3);
        // System.out.println(Arrays.toString(numeros3));

        // System.out.println(Arrays.toString(merge(new String[] {"1", "4", "2"}, new String[] {"2", "5", "9"})));

        // Programa de estudiantes y notas
        String[] nombres = {"Diego", "Daniel", "Fernando", "Alexis", "Matias"};
        double[] notas1 = {6.9, 6.7, 5.2, 3.9, 4.8};
        double[] notas2 = {6.9, 6.7, 5.2, 3.9, 4.8};

        System.out.println(Arrays.toString(createSeatingChart(nombres, notas1)));
        System.out.println(Arrays.toString(findTopStudents(notas1)));
        System.out.println(Arrays.equals(notas1, notas2));
        
        double resultado = prod(notas1);
        System.out.println(resultado);

        
        System.out.println(Arrays.toString(reverse(notas1)));
    }
}
