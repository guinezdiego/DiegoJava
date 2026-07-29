// public class Bucles {
//     public static void main(String[] args) {
//         // El bulce for tiene la siguiente sintaxis:
//         // for (Iniciar; condicion; actualizar) {
//         //     codigo
//         //}

//         // for (int num = 0; num <= 5; num++) {
//         //     System.out.println(num);
//         // }
        
//         // Sumemos todos los numeros del 1 al 100
//         // int sumaTotal = 0;
//         // for (int num = 1; num <= 100; num++) {
//         //     sumaTotal += num;
//         // }
//         // System.out.println("La suma total es: " + sumaTotal);

//         // Los bucles while nos permite seguir iterando mientras se cumpla una condicion
//         // int edad = 16;

//         // while (edad <= 18) {
//         //     if (edad < 18) {
//         //         System.out.println("Eres un niño");
//         //     } else {
//         //         System.out.println("Eres un adulto");
//         //     }
//         //     edad++;
//         // }

//         // El bucle do-while es similar al while pero con una diferencia clave
//         // El bloque de codigo se ejecuta almenos una vez antes de que se verifique la condicion
//         // int count = 0;
//         // do {
//         //     System.out.println("Count: " + count);
//         //     count++;
//         // } while (count < 5);

//         // La instruccion break detiene el bucle inmediatamente
//         // Por ejemplo
//         // for (int i = 0; i < 10; i++) {
//         //     if (i == 6) {
//         //         break;
//         //     }

//         //     System.out.println(i);
//         // }

//         // La declaracion continue detiene la iteracion actual y continua con la siguiente
//         // for (int i = 3; i < 9; i++) {
//         //     if (i == 5) {
//         //         continue;
//         //     }
//         //     System.out.println(i);
//         // }

//         // for (int i = 1; i <= 20; i++) {
//         //     if (i == 4 || i == 13 || i == 17) {
//         //         System.out.println("Skipping unlucky number: " + i);
//         //         continue;
//         //     }
//         //     System.out.println("Item #" + i + ": Get this item!");
//         // }

//         // Cuenta regresiva
//         // for (int i = 10; i >= 0; i--) {
//         //     System.out.println(i);
//         // }

//         // Puedes usar multiples variables en el bucle for
//         // for (int i = 0, j = 10; i <= 10; i++, j--) {
//         //     System.out.println("i = " + i + ", j = " + j);
//         // }

//         // Un bucle anidado es simplemente un bucle dentro de otro bucle
//         // El bucle interno completara todas sus iteraciones por cada iteracion del bucle externo
//         // for (int x = 0; x <= 2; x++) {
//         //     for (int y = 0; y <= 2; y++) {
//         //         System.out.println(x + " " + y);
//         //     }
//         // }

//         // int ancho = 4;
//         // int largo = 6;

//         // for (int x = 0; x < largo; x++) {
//         //     for (int y = 0; y < ancho; y++) {
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }

//         // for (int x = 1; x <= 5; x++) {
//         //     for (int y = 1; y <= 5; x++) {
//         //         int producto = x * y;

//         //         if (y == 5) {
//         //             System.out.print(producto);
//         //         } else {
//         //             if (producto < 10) {
//         //                 System.out.print(producto + "  ");
//         //             } else {
//         //                 System.out.print(producto + " ");
//         //             }
//         //         }
//         //     }
//         //     System.out.println();
//         // }

//         // Un bucle infinito es un bucle que nunca se detiene porque su condicion siempre se evalua true
//         // Estos tipos de bucles estan asociados con bucles while y do-while
//         // while (true) {
//         //     System.out.println("Esto sera para siempre");
//         // }

//         // Otra forma de crear un bucle infinito es omitiendo la condicion en un for
//         for (;;) {
//             System.out.println("Esto tambien es eterno");
//         }
        
//     }
// }
