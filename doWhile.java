public class doWhile {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Sirviendo tazas de café para los invitados:");
        System.out.println("----------------------");

        int taza = 1;

        do {
            System.out.println("Sirviendo taza número: " + taza);
            taza++;
        } while (taza <= 3);


        System.out.println("Café listo");
        System.out.println("----------------------");
    }

}