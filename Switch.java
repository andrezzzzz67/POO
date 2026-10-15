public class Switch {

    public static void main(String[] args) {

        int dia = 5;

        switch (dia) {
            case 1: // aqui dice: cuando dia sea igual a 1
                System.out.println("Lunes");
                break;

            case 2: // aqui dice: si dia no es 1 pero es 2
                System.out.println("Martes");
                break;

            case 3: // si dia no es 1 ni 2 pero es 3
                System.out.println("Miércoles");
                break;

            default: // es cualquier otro caso
                System.out.println("Día no válido");


        }
        System.out.println("\n-----------\n");

        int mes = 2;

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;

            default:
                System.out.println("Mes no válido");
        }

    }
}