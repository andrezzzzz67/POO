import java.util.Scanner;//importa la clase Scanner

public class ejeDiez {//marca cual es la clase de todo el codigo
    public static void main(String[] args) {// metodo main
        Scanner sc = new Scanner(System.in); //crea un scanner llamados sc

        System.out.print("Introduce un valor numérico de temperatura: "); //imprime lo que esta entre comillas
        double temp = sc.nextDouble(); // lee el valor que se agrega al ejecutar el codigo

        System.out.println("Selecciona una opción (1 o 2):");//imprime lo que esta entre comillas
        System.out.println("1. Transformación Tipo X");//imprime lo que esta entre comillas
        System.out.println("2. Transformación Tipo Y");//imprime lo que esta entre comillas
        int opcion = sc.nextInt(); // lee la opcion elegida por el usuario

        double resultado = 0;//le da valor a la varibale resultado

        switch (opcion) { //abre switch para evaluar casos
            case 1: //caso 1
                resultado = (temp * 9 / 5) + 32; //si es el caso 1 aplica la formula y guarda el valor en resulta
                System.out.println("Resultado de la transformación: " + resultado + " Unidades_F");//imprime lo que esta entre comillas con los resultados obtenidos
                break;//rompre el break
            case 2://caso 2
                resultado = (temp - 32) * 5 / 9; //si es el caso 2 aplica la formula y guarda el valor en resultado
                System.out.println("Resultado de la transformación: " + resultado + " Unidades_C"); //imprime lo que esta entre comillas con los resultados obtenidos
                break;//rompe el switch
            default: //lo que pasa si no obtiene un resultado reconocido por el codigo
                System.out.println("Error: Opción no registrada en el sistema."); //imprime lo que esta entre comillas
        }//cierra el switch

        sc.close();//cierra el scanner
    }//cierra el main
}//cierr la clase

// el codigo es un conversor de unidades de temperatura