import java.util.Scanner;

public class Sistema_inventario {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        String simbolo = "Q";
        String producto = " ";
        double precio = 0;
        int opcion = 0;
        boolean comprobar = false;

        while (opcion !=4) {

            System.out.println("-----------------------");
            System.out.println("|1. Registrar producto|");
            System.out.println("|2. Registrar precio  |");
            System.out.println("|3. Cambiar precio    |");
            System.out.println("|4. Salir             |");
            System.out.println("----------------------");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: 
                    System.out.println("Escribe el producto");
                     producto = sc.nextLine();

                    if (producto.trim().isEmpty()) {
                    System.out.println("No dejes espacios en blanco");
                    break;
                     }

                    System.out.println("Escribe el precio:");
                    precio = sc.nextDouble();

                    comprobar = true;
                    break;
                
                case 2:
                    System.out.println("El producto es: " + producto);
                    System.out.println("El precio es: " + simbolo + precio);
                    break;

                case 3:
                    System.out.println("Escribe el nuevo precio:");
                    precio = sc.nextDouble();
                    break;
                
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }

        }
    }
}