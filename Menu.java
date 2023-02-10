public class Menu {
    private Pizza pizza = new Pizza();
    private Hamburguesa hamburguesa = new Hamburguesa();
    private Fideos fideos = new Fideos();
    private Pastel pastel = new Pastel();
    private ArrozFrito arrozFrito = new ArrozFrito();
    private Sandwich sandwich = new Sandwich();

    public String imprimirMenu(){
        String cadena = pizza.toString() + "/n" +
        hamburguesa.toString() + "/n" +
        fideos.toString() + "/n" + 
        pastel.toString() + "/n" +
        arrozFrito.toString() + "/n" +
        sandwich.toString();
        return cadena;
    }



    
}
