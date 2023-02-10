public class Cocinero {
    
    public Plato getInstance(int tipo){
        Plato plato = new Plato();

        switch (tipo) {
            case 1:
                plato = new Hamburguesa();
                break;

            case 2:
                plato = new Fideos();
                break;

            case 3:
                plato = new Pizza();
                break;

            case 4:
                plato = new Pastel();
                break;

            case 5:
                plato = new Sandwich();
                break;

            case 6:
                plato = new ArrozFrito();
                break;
        
            default:
                break;
        }
        return plato;
    }
}
