public class Decisiones {
    public static void main(String[] args) {
        int edad1 = 20;
        String status1 = "Niño";

        // la condicion debe estar dentro de ()
        if (edad1 >= 18) {
            status1 = "Adulto"; // todo el codigo debe estar dentro de {}
        }
        ++edad1;
        System.out.println(status1);
        System.out.println(edad1);

        // if, else if y else
        int edad = 68;
        String status = "Nada";

        if (edad < 18) {
            status = "Joven";
        } else if (edad >= 18 && edad <= 65) {
            status = "Adulto";

        } else {
            status = "Viejo";
        }

        System.out.println(status);

        int dia = 3;
        String nombreDia = " ";

        // switch funciona para verificar distintos casos
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
        }

        System.out.println(nombreDia);

        // Operador ternario, es como un if-else
        int edad2 = 20;
        String mensaje = (edad2 >= 18) ? "Adulto" : "Joven";
        System.out.println(mensaje);

        // Puedes anidar operadores ternearios para manejar mas condiciones
        int puntuacion = 75;
        String nota = (puntuacion >= 90) ? "A" : (puntuacion >= 80) ? "B" : (puntuacion >= 70) ? "C" : "F";
        System.out.println(nota);

        // Podemos anidar sentencias if-else una dentro de otra
        int edad3 = 17;
        boolean tieneLicencia = false;

        if (edad3 >= 18) {
            if (tieneLicencia) {
                System.out.println("You can drive");
            } else {
                System.out.println("Get a license first");
            }
        } else {
            System.out.println("Too young to drive");
        }
    }
}
