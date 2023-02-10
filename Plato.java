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
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
    
}