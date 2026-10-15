public class iff{

    public static void main(String[] args) {

        // Declaramos una variable de tipo entero
        double calificacion = 9.5;

        // Evaluamos la calificación

        if (calificacion >= 90) {
            System.out.println("Sacaste A");

        } else if (calificacion >= 80) {
            System.out.println("Obtuviste B");

        } else if (calificacion <= 70) {

            System.out.println("Aprobaste con C");

        } else {
            System.out.println("Reprobaste");
        }

        // Este mensaje siempre se ejecuta,
        // sin importar cuál condición se haya cumplido.
        System.out.println("Fin del programa.");
if (calificacion <= 8){
    System.out.println("No aplica para beca.");
} else if (calificacion <= 9 ){
    System.out.println("Aplica para beca");
} else if (calificacion <= 10) {
    System.out.println("¡Beca obtenida!");
}else {
    System.out.println("Sin beneficios de beca.");
}
    }
}