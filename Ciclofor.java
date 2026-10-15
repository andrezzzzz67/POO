public class Ciclofor {

    public static void main(String[] args) {

        // Recorremos los números del 1 al 10
        for (int i = 1; i <= 10; i++) {

            // Mostramos el número actual
            System.out.println("Número: " + i);

            // Si el número es 5, detenemos el ciclo
            if (i == 8) {
                System.out.println("Se encontró el número 8.");
                System.out.println("El ciclo se detendrá con break.");

                // break termina inmediatamente el ciclo
                break;
            }
        }


        System.out.println("Fin del programa.");
        System.out.println("----------------------");

        // Segundo ciclo
        for (int j = 2; j <= 20; j++) {
            System.out.println("Segundo ciclo, número: " + j);

            if (j == 4);{
                System.out.println("Se encontró el número 4.");
                System.out.println("El ciclo se detendrá con break.");
                break;
            }
        }
    }
}
