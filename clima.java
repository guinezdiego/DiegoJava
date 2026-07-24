

public class clima {
    public static void main(String[] args) {
        int age = 16;
        int height = 170;
        boolean hasAdult = false;

        if (age < 12) {
            System.out.println("Sorry, you're too young");
        } else {
            if (height <= 150) {
                System.out.println("Sorry, you're not tall enough");
            } else {
                if (age < 15) {
                    if (hasAdult) {
                        System.out.println("You can ride with adult supervision!");
                    } else {
                        System.out.println("Sorry, you need an adult with you");
                    }
                } else {
                    System.out.println("You can ride by yourself!");
                }
            }
        }
    }
}
