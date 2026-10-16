import java.util.Scanner;//importa la clase scanner

public class ejeNueve {//marca cual es la clase de todo el codigo
    public static void main(String[] args) { // metodo main
        Scanner s = new Scanner(System.in); //crea un scanner llamado S

        System.out.print("Piensa en un número límite máximo: "); //imprime lo que esta entre comillas
        int limite = s.nextInt(); // lee el valor entero que se ingresa al ejecutar el codigo

        System.out.println("Generando 5 números especiales bajo el límite..."); //imprime lo que esta entre comillas
        for (int i = 0; i < 5; i++) {// incia un ciclo que se repetira 5 vecs
            int resultado = (int) (Math.random() * limite) + 1; //genera un valor aleatorio
            System.out.println("Número [" + (i + 1) + "]: " + resultado);//imprime cada uno de los valores aleatorios generaods
        }//cierra el for

        s.close();//cierra el scanner
    }//cierra el main
}//cierra el clase
//genera una serie de numeros aleatorios (5) dentro de un rango establecido por el usuario








