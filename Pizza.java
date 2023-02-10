/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Ejercicio Factory
 * 30-01-2023
 * Clase Pizza: crea un plato para el menu, clase hija (herencia)
 */
public class Pizza extends Plato{

    private String topping;
    private boolean orillaQueso;
    private boolean delgada;

    public Pizza() {
        super();
        topping = "carne";
        orillaQueso = true;
        delgada = true;
    }

    public Pizza(String nombre, float d, String topping, boolean orillaQueso, boolean delgada) {
        super(nombre, d);
        this.topping = topping;
        this.orillaQueso = orillaQueso;
        this.delgada = delgada;
    }

    
    /** 
     * @return String
     */
    public String getTopping() {
        return this.topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isOrillaQueso() {
        return this.orillaQueso;
    }

    public boolean getOrillaQueso() {
        return this.orillaQueso;
    }

    public void setOrillaQueso(boolean orillaQueso) {
        this.orillaQueso = orillaQueso;
    }

    public boolean isDelgada() {
        return this.delgada;
    }

    public boolean getDelgada() {
        return this.delgada;
    }

    public void setDelgada(boolean delgada) {
        this.delgada = delgada;
    }


    @Override
    public String toString() {
        return super.toString() +
            "Topping='" + getTopping() + "\n" +
            "OrillaQueso='" + isOrillaQueso() + "\n" +
            "Delgada='" + isDelgada() + "\n";
    }

    
}