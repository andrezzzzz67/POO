import java.util.Scanner;//importa la clase scanner

public class ejeOnce {//marca cual es la clase de todo el codigo
    public static void main(String[] args) { //es el metodo main
        Scanner sc = new Scanner(System.in);// crea un scanner llamado sc

        System.out.print("Ingresa la longitud del lado A: ");//imprime lo que esta entre comillas
        double a = sc.nextDouble();// lee el numero que se agrega y lo relaciona con la variabel a

        System.out.print("Ingresa la longitud del lado B: "); //imprime lo que esta entre comillas
        double b = sc.nextDouble();// lee el numero que se agrega y lo relaciona con la variable b

        System.out.print("Ingresa la longitud del lado C: "); //imprime lo que esta entre comillas
        double c = sc.nextDouble();// lee el numero que se agrega y lo relaciona con la variable c

        if ((a + b > c) && (a + c > b) && (b + c > a)) { //evalua la si las longitudes pueden formar un triangulo
            System.out.println("Resultado del análisis: ESTRUCTURA_VÁLIDA"); //si se cumple la condicion imprime lo que esta entre comillas
        } else { // define el bloque alternativo en caso de que la condicion no se cumpla
            System.out.println("Resultado del análisis: ESTRUCTURA_INVÁLIDA");//imprime lo que esta entre comillas
        }//cierra el if

        sc.close();//cierra el scabner
    }//cierra el main
}// cierra la clase

//el codigo lo que hace es comprobar si tres longitudes que nosotros damos pueden formar un triangulo





