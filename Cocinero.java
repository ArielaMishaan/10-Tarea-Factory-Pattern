public class Cocinero {
    
    public Plato getInstance(int tipo){
        Plato plato = new Plato();

        switch (tipo) {
            case 1:
                plato = new Hamburguesa("Quesoburguesa", (float) 45.6, true, false, true);;
                break;

            case 2:
                plato = new Fideos("Fideos carboonara", 1000, true, false, true);
                break;

            case 3:
                plato = new Pizza("Pizza italiana", (float) 57.8, "carne", false, false);;
                break;

            case 4:
                plato = new Pastel("Selva negra", 600, "chocolate con cajeta y espumillas", true);
                break;

            case 5:
                plato = new Sandwich("Pan con frijol especialidad de la casa", (float) 25.09, "integral", true );
                break;

            case 6:
                plato = new ArrozFrito("Arroz chino frito con brócoli", (float) 2000.04, true, true);
                break;
        
            default:
                break;
        }
        return plato;
    }
}
