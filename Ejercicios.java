

public class Ejercicios {
    public static void main(String[] args) {
        // int age = 16;
        // int height = 170;
        // boolean hasAdult = false;

        // if (age < 12) {
        //     System.out.println("Sorry, you're too young");
        // } else {
        //     if (height <= 150) {
        //         System.out.println("Sorry, you're not tall enough");
        //     } else {
        //         if (age < 15) {
        //             if (hasAdult) {
        //                 System.out.println("You can ride with adult supervision!");
        //             } else {
        //                 System.out.println("Sorry, you need an adult with you");
        //             }
        //         } else {
        //             System.out.println("You can ride by yourself!");
        //         }
        //     }
        // }

        String item1 = "T-shirt";
        String item2 = "Jeans";
        String item3 = "Hat";
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.00;

        // Calcular totales
        double subtotal = price1 + price2 + price3;
        double tax = subtotal * 0.08;
        double total = subtotal + tax;

        // Crear recibo
        System.out.println("STORE RECEIPT");
        System.out.println("-------------");
        System.out.printf("%s: $%.2f\n", item1, price1);
        System.out.printf("%s: $%.2f\n", item2, price2);
        System.out.printf("%s: $%.2f\n", item3, price3);
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
