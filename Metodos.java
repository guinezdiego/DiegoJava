public class Metodos {
    // Para crear un metodo en Java, utilizamos: 
    public static void saludo() {
        System.out.println("Welcome to Coddy");
    }

    public static void sumar() {
        int suma = 0;
        for (int i = 0; i < 1001; i++) {
            suma += i;
        }
        System.out.println("La suma total es: " + suma);
    }

    // Las variables enumeradas en la declaracion de un metodo se llaman parametros
    // Los valores que proporcionas cuando llamas al metodo se llaman argumentos

    public static void esPar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " Es par");
        } else {
            System.out.println(num + " Es impar");
        }
    }

    public static int retorno() {
        return 100;
    }

    public static double masGrande(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else if (n1 == n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void iterar() {
        int iteraciones = 3;
        double num1 = 45;
        double num2 = 43;

        for (int i = 0; i < iteraciones; i++) {
            if (num1 < 2 || num2 < 2) {
                break;
            } else {
                double resultado1 = masGrande(num1, num2);
                double resultado2 = resultado1 / 2;

                if (resultado1 == num1) {
                    num1 = resultado2;
                } else {
                    num2 = resultado2;
                }

                System.out.println(resultado2);
            }
        }
    }

    // La sobrecarga de metodos te permite definir multiples metodos con el mismo nombre
    // Pero con diferentes parametros
    // Reglas clave para la sobrecarga de metodos:
    // 1.- Deben tener el mismo nombre
    // 2.- Deben tener parametros diferentes

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Los metodos void no devuelven ningun valor
    // Se utiliza cuando quieres imprimir salidas
    // Modificar estados de objetos o ejercutar una secuencia de instrucciones
    

        public static void main(String[] args) {
        saludo();

        sumar();

        for (int i = 15; i < 34; i++) {
            esPar(i);
        }

        int numero = retorno();
        System.out.println(numero);

        iterar();
    }
}