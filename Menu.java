/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Ejercicio Factory
 * 30-01-2023
 * Clase Menú: Obtiene todos los platos
 */
public class Menu {
    private Pizza pizza = new Pizza("Pizza italiana", (float) 57.8, "carne", false, false);
    private Hamburguesa hamburguesa = new Hamburguesa("Quesoburguesa", (float) 45.6, true, false, true);
    private Fideos fideos = new Fideos("Fideos carboonara", 1000, true, false, true);
    private Pastel pastel = new Pastel("Selva negra", 600, "chocolate con cajeta y espumillas", true);
    private ArrozFrito arrozFrito = new ArrozFrito("Arroz chino frito con brócoli", (float) 2000.04, true, true);
    private Sandwich sandwich = new Sandwich("Pan con frijol especialidad de la casa", (float) 25.09, "integral", true );

    
    /** 
     * @return String
     */
    public String imprimirMenu(){
        String cadena = "1. " + hamburguesa.toString() + "\n" +
        "2. " + fideos.toString()+ "\n" +
        "3. "  + pizza.toString() + "\n" + 
        "4. "  + pastel.toString() + "\n" +
        "5. "  + sandwich.toString() + "\n" +
        "6. "  + arrozFrito.toString();
        return cadena;
    }



    
}
