import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        Scanner escaneo1 = new Scanner(System.in);

        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.print("Ingrese su opcion: ");
        int op = escaneo1.nextInt();

        System.out.print("Ingresa un numero: ");
        int num1 = escaneo1.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = escaneo1.nextInt();
        escaneo1.close();

        switch (op) {
            case 1:
                System.out.println("Suma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resta: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicacion: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division: " + ((double) num1 / num2));
                } else {
                    System.out.println("No se puede dividir por 0");
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
