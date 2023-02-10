/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Ejercicio Factory
 * 30-01-2023
 * Clase Sandwich: crea un plato para el menu, clase hija (herencia)
 */
public class Sandwich extends Plato {
    private String pan;
    private boolean combo;

    public Sandwich(){
        super();
        pan = "";
        combo = false;
    }

    public Sandwich(String nombre, float d, String pan, boolean combo){
        super(nombre, d);
        this.pan = pan;
        this.combo = combo;
    }


    
    /** 
     * @return String
     */
    public String getPan() {
        return this.pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
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
            "Pan: " + getPan() + "\n" +
            "Combo: " + isCombo() + "\n";
    }


}
