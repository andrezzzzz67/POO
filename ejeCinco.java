import java.util.Scanner;//importa la clase scannrr

public class ejeCinco { // marca cual es la clase principal de todo el codigo
    public static void main(String[] args) { // metodo main
        Scanner s = new Scanner(System.in); // crea un Scanner llamado S

        int claveSecreta = 7; // crea un int llamado claveSecreta y lo iguala a 7
        int intento; // declara la variable que que almacenara un valor numerico que se introduzca

        System.out.println("¡Bienvenido al sistema de verificación!"); // imprime lo que esta entre comillas

        do { // inicia un ciclo que hace que todas las intrucciones se ejecuten al menos una vez
            System.out.print("Introduce el código numérico de acceso (del 1 al 10): "); //imprime lo que esta entre comillas
            intento = s.nextInt(); //lee el valor que se ingreso en intento

            if (intento != claveSecreta) { //revisa si el intento es diferentes a la clave secreta
                System.out.println("Acceso denegado. Intenta de nuevo."); // si no coinciden, imprime lo que esta entre comillas
            }//cierra el if

        } while (intento != claveSecreta); // cuerra el ciclo y checa si se debe repetir

        System.out.println("¡Acceso concedido! Código correcto."); //si coinciden, imprime lo que esta entre comillas
        s.close();// cierra el scanner
    }// cierra el main
}//cierra la clase

// ayuda a comparar una contraseña que sea numercia para ver si coincidie con la establicida o no