import java.util.Scanner;
public class BasicIO {
    public static void main(String[] args) {
        // Metodos System.out mas utilizados
        // System.out.print("Hola"); // No añade un caracter de nueva linea al final
        // System.out.print("Tonoto"); // Por lo que continuara en la misma linea
        // System.out.println("");

        // // Imprime una cadena en la consola seguida de un salto de linea
        // System.out.println("Hola");
        // System.out.println("Tomodachis");

        // Insertar valores en la cadena
        // int age = 30;
        // String name = "Alice";
        // double balance = 1500.75;

        // System.out.printf("Name: %s\n", name); // %s reemplaza cadenas de texto
        // System.out.printf("Age: %d\n", age); // %d reemplaza numeros enteros
        // System.out.printf("Balance: %f\n", balance); // %f reemplaza numero flotante
        // System.out.printf("Balance: %.2f\n", balance); // formatea el numero flotante a dos decimales

        // Una forma mas simple
        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);
        // System.out.println("Balance: " + balance);

        // Entrada de usuario con la clase Scanner
        // Scanner escaner = new Scanner(System.in);
        // System.out.print("Ingresa tu edad: ");
        // int edad = escaner.nextInt();
        // System.out.println("Tu edad es: " + edad);
        // escaner.close();

        // 120 anios
        int count = 120;
        Scanner escaner1 = new Scanner(System.in);
        System.out.print("Ingresesa tu edad: ");
        int edad1 = escaner1.nextInt();
        System.out.println(count - edad1 + " years till 120");
        escaner1.close();
    }
}
