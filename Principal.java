import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero();
        Menu menu = new Menu();

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("\n\n °°°°°°°°°°°°°°°°°° Bienvenidos al Restaurante °°°°°°°°°°°°°°°°°°"); 
            System.out.println("\nAquí está el menú: \n");

            System.out.println(menu.imprimirMenu());

            System.out.println("\nEscoja un plato: ");
            int plato = teclado.nextInt();

            switch (plato) {
                case 1:
                    System.out.println("\nDisfrute su " + cocinero.getInstance(1).getNombre()+"!\n");
                    break;

                case 2:
                    System.out.println("\n¡Disfrute su " + cocinero.getInstance(2).getNombre() +"!\n");
                    break;

                case 3:
                    System.out.println("\n¡Disfrute su " + cocinero.getInstance(3).getNombre()+"!\n");
                    break;

                case 4:
                    System.out.println("\n¡Disfrute su " + cocinero.getInstance(4).getNombre()+"!\n");
                    break;

                case 5:
                    System.out.println("\n¡Disfrute su " + cocinero.getInstance(5).getNombre()+"!\n");
                    break;

                case 6:
                    System.out.println("\n¡Disfrute su " + cocinero.getInstance(6).getNombre()+"!\n");
                    break;
            
                default:
                    break;
            }
            

        } catch (Exception e) {
            teclado.nextLine();
            System.out.println("Ingresó algo inválido.");
            //TODO: handle exception
        }
    }
}