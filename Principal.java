import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero();
        Menu menu = new Menu();

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Bienvenidos al Restaurante"); 
            System.out.println("Aquí está el menú: ");

            System.out.println(menu.imprimirMenu());

            System.out.println("\nEscoja un plato: ");
            int plato = teclado.nextInt();

            switch (plato) {
                case 1:
                    cocinero.getInstance(1).toString();
                    break;

                case 2:
                    cocinero.getInstance(2).toString();
                    break;

                case 3:
                    cocinero.getInstance(3).toString();
                    break;

                case 4:
                    cocinero.getInstance(4).toString();
                    break;

                case 5:
                    cocinero.getInstance(5).toString();
                    break;

                case 6:
                    cocinero.getInstance(6).toString();
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