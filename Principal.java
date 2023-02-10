import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero();

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Bienvenidos al Restaurante"); 
            System.out.println("");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}