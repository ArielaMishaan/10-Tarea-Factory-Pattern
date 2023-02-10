/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Ejercicio Factory
 * 30-01-2023
 * Clase Hamburguesa: crea un plato para el menu, clase hija (herencia)
 */
public class Hamburguesa extends Plato{
    private boolean queso;
    private boolean dobleCarne;
    private boolean combo;

    public Hamburguesa() {
        super();
        queso = true;
        dobleCarne = true;
        combo = true;
    }

    public Hamburguesa(String nombre, float d, boolean queso, boolean dobleCarne, boolean combo) {
        super(nombre, d);
        this.queso = queso;
        this.dobleCarne = dobleCarne;
        this.combo = combo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isQueso() {
        return this.queso;
    }

    public boolean getQueso() {
        return this.queso;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public boolean isDobleCarne() {
        return this.dobleCarne;
    }

    public boolean getDobleCarne() {
        return this.dobleCarne;
    }

    public void setDobleCarne(boolean dobleCarne) {
        this.dobleCarne = dobleCarne;
    }

    public boolean isCombo() {
        return this.combo;
    }

    public boolean getCombo() {
        return this.combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

    @Override
    public String toString() {
        return super.toString() +
            "Queso: " + isQueso() + "\n" +
            "DobleCarne: " + isDobleCarne() + "\n" +
            "Combo: " + isCombo() + "\n";
    }


}