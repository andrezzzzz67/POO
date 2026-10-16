import java.util.Scanner;//importa la clase scanner

public class ejeOcho {// marca la clase de todo el codigo
    public static void main(String[] args) {// metodo main
        Scanner input = new Scanner(System.in); //crea un scanner llamado input

        System.out.print("Ingresa una cantidad grande de segundos (ej. 5000): "); // imprime lo que esta entre comillas
        int total = input.nextInt(); // lee el valor que se introduce al ejecutar el codigo

        int r1 = total / 3600;//calcula las horas dividiendo el total de segundos entre 3600
        int residuo = total % 3600; //Calcula el sobrante de segundos después de obtener las horas
        int r2 = residuo / 60; //Calcula los minutos dividiendo el residuo anterior entre 60
        int r3 = residuo % 60; //Calcula el residuo final

        System.out.println("Conversión final: " + r1 + "h : " + r2 + "m : " + r3 + "s");
//imprime conversion final: el calor valor de r1, h: el valor de r2 m: el valor de r3 s
        input.close();//cierra el scanner
    }// cierra el main
}//cierra la clase