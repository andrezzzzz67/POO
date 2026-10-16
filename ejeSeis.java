import java.util.Scanner;//importa la clase scannerr

public class ejeSeis { // marca cual es la clase de todo el codigo
    public static void main(String[] args) {//metodo main
        Scanner sc = new Scanner(System.in);//crea un scanner que se llama sc

        System.out.println("Escribe una frase o un enunciado completo:");//imprime lo que esta entre comillas
        String entrada = sc.nextLine().trim(); //lee el texto introducido al ejecutar el codigo

        if (entrada.isEmpty()) {//ve sila cadena de texto esta vacia
            System.out.println("Resultado numérico: 0"); //imprime lo que esta entrecomillas
        } else { //define que es lo que pasa en caso de que el si tenga caracteres
            String[] bloques = entrada.split("\\s+"); //divide la cadena en subcadenas
            System.out.println("Resultado numérico: " + bloques.length); // imprime los que esta entre comillas +
            //la cantidad de elementos de resultado
        }//cierra el if

        sc.close();// cierra el scanner
    }// cierra el main
}//cierra la clase

//el codigo en general es un contador de palabras