import java.util.Scanner;//importa la clase scanner

public class ejercicioTres { //marca cual es la clase principal del codigo
    public static void main(String[] args) { //metodo main
        Scanner sc = new Scanner(System.in); //llama a un scanner con el nombre sc

        System.out.print("Escribe una palabra o texto corto: "); //imprime lo que esta entre comillas
        String texto = sc.nextLine(); //lee el texto completo que se introduce

        String resultado = ""; // es una cadena de texto vacia

        for (int i = texto.length() - 1; i >= 0; i--) { //inicia un ciclo que corre desde el ultimo carcter hasta el primero
            resultado += texto.charAt(i);//señala el carcter en la posicion i y lo conecta con el resultado
        }

        System.out.println("Texto transformado: " + resultado); //imprime lo que esta entre comillas mas el resultado
        sc.close();//cierra el scanner
    }// cierra el main
}//cierra la clase

//El codigo en general invierte una cadena de texto ingresada cuandos ejecuta el codigo es decir imprime una palabra al reves
// Andres = serdnA