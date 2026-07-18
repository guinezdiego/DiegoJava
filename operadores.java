public class operadores {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b; // contiene 8

        double x = 3.3;
        double y = 4.1;
        double z = x + y; // contiene 7.4

        double resultado = 5.2 % 2.0; // el resultado es 1.2
        double resultado2 = 7.8 % 3.5; // el resultado es 0.8

        // operadores incremento y decremento
        int count = 5;
        count++; // ahora count es 6

        int value = 10;
        value--; // ahora value es 9

        // pre-incremento y pre-decremento
        int j = 5;
        int k = ++j; // x se incrementa en 1, luego y se vuelve 6

        // incremento y decremento postfijo
        int n = 5;
        int m = n++; // y se convierte primero en 5, luego x se vuelve 6

        // atajos aritmeticos
        int d = 5;
        d += 3; // d contiene 8
        int e = 15;
        e -= 10; // e contiene 5

        // operadores de comparacion
        int var1 = 13;
        int var2 = 12;
        boolean var3 = var1 != var2;

        int wi = 10;
        int pi = 20;
        boolean result = wi > pi;

        // comparar cadenas
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Hello";
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);

        // comparar sin considerar mayusculas y minusculas
        boolean result3 = str3.equalsIgnoreCase(str2);
        
    }
}
