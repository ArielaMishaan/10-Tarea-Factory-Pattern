/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Ejercicio Factory
 * 30-01-2023
 * Clase ArrozFrito: crea un plato para el menu, clase hija (herencia)
 */
public class ArrozFrito extends Plato {
    private boolean mixto;
    private boolean verduras;

    public ArrozFrito(){
        super();
        mixto = false;
        verduras = false;
    }

    public ArrozFrito(String nombre, float d, boolean mixto, boolean verduras){
        super(nombre, d);
        this.mixto = mixto;
        this.verduras = verduras;
    }


    
    /** 
     * @return boolean
     */
    public boolean isMixto() {
        return this.mixto;
    }

    
    /** 
     * @return boolean
     */
    public boolean getMixto() {
        return this.mixto;
    }

    
    /** 
     * @param mixto
     */
    public void setMixto(boolean mixto) {
        this.mixto = mixto;
    }

    
    /** 
     * @return boolean
     */
    public boolean isVerduras() {
        return this.verduras;
    }

    
    /** 
     * @return boolean
     */
    public boolean getVerduras() {
        return this.verduras;
    }

    
    /** 
     * @param verduras
     */
    public void setVerduras(boolean verduras) {
        this.verduras = verduras;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() +
            "Mixto: " + isMixto() + "\n" +
            "Verduras: " + isVerduras() + "\n";
    }


}
