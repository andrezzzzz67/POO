public class forEach {

    public static void main(String[] args) {

        // Declaramos un arreglo con la lista del súper
        String[] productos = {"Manzanas", "Leche", "Pan", "Huevos", "Café"};

        System.out.println("Con For Each");
        System.out.println("----------------------------");
        // El ciclo for-each recorre automáticamente cada producto
        for (String producto : productos) {
            System.out.println("Comprar: " + producto);
        }

        System.out.println("----------------------------");
        System.out.println("Con For tradicional");

        // Recorremos el arreglo utilizando índices
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Comprar: " + productos[i]);
        }

        System.out.println("----------------------------");
        System.out.println("Lista terminada.");
        System.out.println("----------------------------");
    }

}