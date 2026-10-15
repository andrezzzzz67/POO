public class primitivo {
    public static void main(String[] args) {


        String[] vinilos = new String[4];

        vinilos[0] = "Froot";
        vinilos[1] = "Did you know that theres a tunnel under ocean blvd";
        vinilos[2] = "Melodrama";
        vinilos[3] = "Something beautiful";

        System.out.println("vinilo en posición 0: " + vinilos[0]);
        System.out.println("vinilo en posición 1: " + vinilos[1]);
        System.out.println("vinilo en posición 2: " + vinilos[2]);
        System.out.println("vinilo en posición 3: " + vinilos[3]);
        System.out.println("Total de vinilos: " + vinilos.length);


        vinilos[0] = null;
        System.out.println("Revisando stock: ");

        // 4. Recorrer todos los elementos

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i] != null) {
                System.out.println("En posición " + i + " hay: " + vinilos[i]);
            } else {
                System.out.println("En posición " + i + " no hay vinilo (sin stock)");
            }
        }
    }
}
