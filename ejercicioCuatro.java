import java.util.Scanner;//importa la clase scanner

public class ejercicioCuatro { //marca cual es la clase de todo el codigo
    public static void main(String[] args) { // metodo main
        Scanner scanner = new Scanner(System.in); // crea un objeto Scanner

        System.out.print("Escribe una frase o palabra en minúsculas: "); // imprime lo que esta entre comillas
        String texto = scanner.nextLine().toLowerCase(); // lee el texto que se mete al ejecutar el codigo

        int contador = 0; // crea el contador y lo pone en 0

        for (int i = 0; i < texto.length(); i++) { //inicia el ciclo para recorrer carcarter por carcater en el texto ingresado
            char letra = texto.charAt(i); //toma el carcater que esta en la posicion i

            switch (letra) { //abre el swith (letra) para ver diferentes caso
                case 'a': //caso 1
                case 'e'://caso 2
                case 'i'://caso 3
                case 'o'://caso 4
                case 'u'://caso 5
                    contador++; // si coincide con cualquiera de los casos, al contador se le suma +1
                    break; //rompe el switch
            }//cierra el switch
        }//cierra el for

        System.out.println("El total de elementos clave encontrados es: " + contador); //imprime lo que hay entre comillas mas el resultado del contador
        scanner.close();//cierra el scanner
    }//cierra el main
}//cierra la clase