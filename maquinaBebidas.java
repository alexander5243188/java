import java.util.Scanner;

public class maquinaBebidas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Elegi una opción de las siguientes");
        System.out.println("1: Cafe");
        System.out.println("2: Vino");
        System.out.println("3: Gaseosa");
        System.out.println("4: Jugo");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Cafe! buenisima elección");            
                break;
            case 2:
            System.out.println("Vino!, ten cuidado si manejas");            
                break;
            case 3:
            System.out.println("Gaseosa! ten mucho cuidado con el azucar");            
                break;
            case 4:
            System.out.println("Jugo!, muy bueno para la salud");            
                break;
            default:
            System.out.println("Opción no valida");
            
                break;
        }
        if (opcion >=1 && opcion <= 4) {
            System.out.println("Disfruta de tu bebida");            
        } else {
            System.out.println("** Fin del programa **");
        }
        leer.close();
        
    }
}
