import java.util.Scanner; //importa la clase scanner

public class ejeSiete { // marca la clase de todo el codigo
    public static void main(String[] args) { //metodo main
        Scanner scanner = new Scanner(System.in); //crea un objeto scanner

        System.out.print("Introduce un año cualquiera (ej. 2024): "); //imprime lo que esta entre comillas
        int n = scanner.nextInt(); // Lee el valor que se ingresa en int = n

        boolean bandera = false; // crea un boolean con el resultado incial de falso

        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) { // evalua si el año agregado es bisisesto
            bandera = true; // si el valor cumple con lo dicho cambia de F a T
        }//cierra le if

        if (bandera) { // evalua si bandera es verdadero
            System.out.println("El año " + n + " tiene la propiedad: TIPO_A"); //imprime el año mas el valor de N mas
            //tiene la propiedad: TIPO_A
        } else {//define que pasa en otro caso
            System.out.println("El año " + n + " tiene la propiedad: TIPO_B");// imprime el año mas el valor de N mas
            //tiene la propiedad: TIPO_B
        }//cierra el else

        scanner.close();//cierra el scanner
    }//cierra el scanner
}//cierra la clase

//el codigo en general comprueba si un año es bisiesto o no