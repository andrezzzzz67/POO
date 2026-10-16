import java.util.Scanner;//importa la clase Scanner

public class ejercicioDos { //marca cual es la clase principal de todo el codigo
    public static void main(String[] args) { //es el metodo main
        Scanner scanner = new Scanner(System.in); //crea un objeto Scanner

        System.out.print("Introduce un número entero positivo: "); //imprime lo que esta entre comillas
        int x = scanner.nextInt(); //Lee el numero x ingresado cuando se ejecute el codigo 

        int y = 0; // da valor a la variable entera y que es = 0

        while (x > 0) { //inicia un ciclo que se repetira mientras que x sea mayor que 0
            y += x;//dentro de este ciclo suma x y Y
            x--; //le resta uno a x
        }//cierra el while

        System.out.println("El valor final calculado es: " + y); //imprime lo que esta entre comillas mas el resultado de y
        scanner.close();//cierra el scanner
    }//cierra  el metodo main
}//cierra la clase

//en general todo el codigo suma todos los numeros enteros desde el valor ingresado hasta uno