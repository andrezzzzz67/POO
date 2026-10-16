public class cicloForContinue {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                System.out.println("Folio 7 marcado como excepción.");


                System.out.println("-----Registro omitido por la regla de seguridad------");
                continue;
            }

            System.out.println("Procesando registro: " + i);
        }

        System.out.println("Proceso finalizado con éxito.");
        System.out.println("------------------");
    }

}