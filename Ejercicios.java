import java.util.Scanner;

public class Ejercicios {
    // Parte 1 - Fundamentos
    public static void presentar() {
        System.out.println("====================");
        System.out.println("   MI PROGRAMA JAVA");
        System.out.println("====================");
        System.out.println("Nombre: Diego");
        System.out.println("Lenguaje: Java");
        System.out.println("Nivel: Programador Intermedio");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public static void verificarPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El numero: " + numero + " es par");
        } else {
            System.out.println("El numero: " + numero + " es impar");
        }
    }

    // Parte 2 - Condiciones y bucles
    public static String clasificarEdad(int edad) {
        if (edad >= 1 && edad < 13) {
            return "Niño";
        } else if (edad >= 13 && edad <= 17) {
            return "Adolescente";
        } else if (edad >= 18 && edad <= 64) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    }

    public static void tabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static int sumarHasta(int limite) {
        int suma = 0;

        for (int i = 1; i <= limite; i++) {
            suma += i;
        }

        return suma;
    }

    public static void mostrarNumeros(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Parte 3 - Metodos + logica
    public static double mayor(double a, double b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void calculadora() {
        while (true) {
            Scanner escaneo1 = new Scanner(System.in);

            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");

            System.out.print("Ingrese su opcion: ");
            int op = escaneo1.nextInt();

            System.out.print("Ingrese un numero: ");
            int num1 = escaneo1.nextInt();
            System.out.print("Ingrese otro numero: ");
            int num2 = escaneo1.nextInt();

            switch (op) {
                case 1:
                    System.out.println(sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(restar(num1, num2));
                    break;
                case 3:
                    System.out.println(multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            escaneo1.close();
        }
    }

    // Parte 4 - Desafios
    public static String obtenerNotas(double puntuacion) {
        if (puntuacion >= 90 && puntuacion <= 100) {
            return "A";
        } else if (puntuacion >= 80 && puntuacion <= 89) {
            return "B";
        } else if (puntuacion >= 70 && puntuacion <= 79) {
            return "C";
        } else if (puntuacion >= 60 && puntuacion <= 69) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void consultarSaldo(double monto) {
        System.out.println("El saldo total es: " + monto);
    }

    public static void depositar(double monto, double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No puedes depositar un saldo negativo");
        } else {
            monto += cantidad;
            System.out.println("Su nuevo saldo es de: " + monto);
        }
    }

    public static void retirar(double monto, double cantidad) {
        if (cantidad <= 0 || cantidad > monto) {
            System.out.println("No puedes retirar cantidades negativas ni sobrepasar el saldo");
        } else {
            monto -= cantidad;
            System.out.println("Su saldo actual es de: " + monto);
        }
    }

    public static void cajero() {
        double saldo = 100000;
        

        while (true) {
            Scanner escaneo3 = new Scanner(System.in);

            System.out.println("1.- Consultar saldo");
            System.out.println("2.- Depositar");
            System.out.println("3.- Retirar");
            System.out.println("4.- Salir");

            System.out.print("Ingrese su opcion: ");
            int op = escaneo3.nextInt();
            
            if (op == 4) {
                System.out.println("Saliendo del sistema");
                break;
            }
            switch (op) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    Scanner escaneo = new Scanner(System.in);

                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = escaneo.nextDouble();

                    depositar(saldo, deposito);
                    escaneo.close();
                    break;
                case 3:
                    Scanner escaneo4 = new Scanner(System.in);

                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = escaneo4.nextDouble();

                    retirar(saldo, retiro);
                    escaneo4.close();
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            escaneo3.close();
        }


    }

    public static void menu() {
        System.out.println("1.- Atacar");
        System.out.println("2.- Curarse");
        System.out.println("3.- Mostrar estadisticas");
        System.out.println("4.- Rendirse");
    }

    public static void stats(String j1, String j2, int v1, int v2, int at1, int at2) {
        System.out.println("Vida actual de: " + j1 + " es: " + v1);
        System.out.println("Ataque de: " + j1 + " es: " + at1);
        System.out.println("==============================");
        System.out.println("Vida actual de: " + j2 + " es: " + v2);
        System.out.println("Ataque de: " + j2 + " es: " + at2);
    }

    public static void sistemaCombate() {
        Scanner escaneofinal = new Scanner(System.in);

        String jugador1 = "Hoplita";
        int vida1 = 100;
        int ataque1 = 25;
        int curar = 20;

        String jugador2 = "Wipig";
        int vida2 = 100;
        int ataque2 = 20;

        int turno = 1;

        while (vida1 != 0 && vida2 != 0) {
            if (turno % 2 != 0) {
                menu();

                System.out.print("Ingrese su opcion: ");
                int op = escaneofinal.nextInt();

                if (op == 4) {
                    System.out.println("Te has rendido, mejora tus habilidades");
                    break;
                }

                switch (op) {
                    case 1:
                        System.out.println("El judador: " + jugador1 + " ataca al jugador: " + jugador2);
                        vida2 -= ataque1;
                        turno += 1;
                        System.out.println("Vida actual de: " + jugador2 + " es: " + vida2);
                        break;
                    case 2:
                        if ((vida1 + curar) > 100) {
                            System.out.println("No te puedes curar");
                        } else {
                            vida1 += curar;
                            System.out.println("Te has curado, tu nueva vida es de: " + vida1);
                            turno += 1;
                        }
                        break;
                    case 3:
                        stats(jugador1, jugador2, vida1, vida2, ataque1, ataque2);
                        turno += 1;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            } else {
                System.out.println("El jugador: " + jugador2 + " te ataca!");
                vida1 -= ataque2;
                turno -= 1;
                System.out.println("Tu vida actual es de: " + vida1);
            }
        }
        if (vida1 < 1) {
            System.out.println("El ganador es: " + jugador2);
        } else {
            System.out.println("El ganador es: " + jugador1);
        }
        escaneofinal.close();
    }

    public static void main(String[] args) {
        // presentar();
        // System.out.println("-------------------------");

        // System.out.println(sumar(3, 7));
        // System.out.println(restar(15, 8));
        // System.out.println(multiplicar(5, 5));
        // System.out.println(dividir(20, 2));
        // System.out.println("-------------------------");

        // verificarPar(10);
        // verificarPar(13);
        // verificarPar(18);
        // verificarPar(9);
        // verificarPar(105);
        // System.out.println("-------------------------");

        // System.out.println(clasificarEdad(11));
        // System.out.println(clasificarEdad(20));
        // System.out.println(clasificarEdad(67));
        // System.out.println("-------------------------");

        // tabla(9);
        // System.out.println("-------------------------");

        // System.out.println(sumarHasta(6));
        // System.out.println("-------------------------");

        // mostrarNumeros(3, 21);
        // System.out.println("-------------------------");

        // System.out.println(mayor(10.5, 7.2));
        // System.out.println(mayor(3.4, 8.9));
        // System.out.println(mayor(5.5, 5.5));
        // System.out.println("-------------------------");

        // calculadora();
        // System.out.println("-------------------------");

        // Scanner escaneo2 = new Scanner(System.in);
        // System.out.print("Ingrese su puntuacion: ");
        // double puntos = escaneo2.nextDouble();
        // System.out.println(obtenerNotas(puntos));
        // escaneo2.close();
        // System.out.println("-------------------------");

        // cajero();
        // System.out.println("-------------------------");

        sistemaCombate();
    }
}
