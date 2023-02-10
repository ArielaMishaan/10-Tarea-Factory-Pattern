/*
 * Alina Carías (22539), Ignacio Méndez (22613), Ariela Mishaan (22052), Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Ejercicio Factory
 * 30-01-2023
 * Clase Plato: Crea todo los patos, clase madre
 */
public class Plato{

    protected String nombre;
    protected float precio;

    public Plato() {
        nombre = "";
        precio = 0;
    }

    public Plato(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Plato nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Plato precio(float precio) {
        setPrecio(precio);
        return this;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" + "Precio: " + getPrecio() + "\n";
    }
}
    