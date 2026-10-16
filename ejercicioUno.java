

    import java.util.Scanner;// importa la clase Scanner

    public class ejercicioUno { //dice cual es la clase principal de todo el codigo
        public static void main(String[] args) {// es el metodo main por asi decirlo donde empieza el programa
            Scanner s = new Scanner(System.in); //crea el objeto llamado "s"

            System.out.print("Ingresa un número entero: "); //Imprime lo que esta entre comillas
            int a = s.nextInt(); //lee el numero a entero (int) que se introduce al ejecutar el codigo

            System.out.print("Ingresa otro número entero: ");// imprime lo que esta entre comillas
            int b = s.nextInt(); //lee el numero b entero que se introduce al ejecutar el codigo

            if (a >= 18) { //abre la condicional que si a es mayor a 18...
                if (b >= 80) { //si se cumple que a es mayor que 18, evalua si b es mayor que 80
                    System.out.println("Resultado: STATUS_A"); //imprime lo que esta entre comillas
                } else { //define que pasa si no se cumple que b es mayor que 80
                    System.out.println("Resultado: STATUS_B"); //imprime lo que esta entre comillas
                }//cierra el bloque del if
            } else {//decide la alternativa del primer if
                System.out.println("Resultado: STATUS_C");//imprime lo que esta entre comillas
            }//cierra el bloque del else

            s.close();//cierra el scanner
        }//cierra el metodo main
    }//cierra la clase

    //clasifica los numers solicitados
