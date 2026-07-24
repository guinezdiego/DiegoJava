public class operadores {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b; // contiene 8
        System.out.println(c);

        double x = 3.3;
        double y = 4.1;
        double z = x + y; // contiene 7.4
        System.out.println(z);

        double resultado = 5.2 % 2.0; // el resultado es 1.2
        double resultado2 = 7.8 % 3.5; // el resultado es 0.8
        System.out.println(resultado);
        System.out.println(resultado2);

        // operadores incremento y decremento
        int count = 5;
        count++; // ahora count es 6
        System.out.println(count);

        int value = 10;
        value--; // ahora value es 9
        System.out.println(value);

        // pre-incremento y pre-decremento
        int j = 5;
        int k = ++j; // x se incrementa en 1, luego y se vuelve 6
        System.out.println(k);

        // incremento y decremento postfijo
        int n = 5;
        int m = n++; // y se convierte primero en 5, luego x se vuelve 6
        System.out.println(m);

        // atajos aritmeticos
        int d = 5;
        d += 3; // d contiene 8
        int e = 15;
        e -= 10; // e contiene 5
        System.out.println(d);
        System.out.println(e);

        // operadores de comparacion
        int var1 = 13;
        int var2 = 12;
        boolean var3 = var1 != var2;
        System.out.println(var3);

        int wi = 10;
        int pi = 20;
        boolean result = wi > pi;
        System.out.println(result);

        // comparar cadenas
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Hello";
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);
        System.out.println(result1);
        System.out.println(result2);

        // comparar sin considerar mayusculas y minusculas
        boolean result3 = str3.equalsIgnoreCase(str2);
        System.out.println(result3);
        
        // operadores &&, || y !
        boolean b1 = (5 > 3) && (1 != 2); // && devuelve true cuando ambos son verdaderos
        boolean b2 = !(5 == 4) || (5 == 6); // || devuelve true cuando alguno sea verdadero
        boolean b3 = !(1 == 4); // si el resultado es true ,'!' lo cambia por false y viceversa
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean isStudent = false;
        boolean isEmployed = false;

        // estas dos expreciones son equivalentes
        boolean result5 = !(isStudent || isEmployed); // true
        boolean result6 = !(isStudent) && !(isEmployed); // true
        System.out.println(result5);
        System.out.println(result6);

        
    }
}
