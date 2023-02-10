public class Fideos extends Plato{
    private boolean salsa;
    private boolean gluten;
    private boolean queso;

    public Fideos() {
        super();
        salsa = true;
        gluten = true;
        queso = true;
    }

    public Fideos(String nombre, float precio, boolean salsa, boolean gluten, boolean queso) {
        super(nombre, precio);
        this.salsa = salsa;
        this.gluten = gluten;
        this.queso = queso;
    }

    public boolean isSalsa() {
        return this.salsa;
    }

    public boolean getSalsa() {
        return this.salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean isGluten() {
        return this.gluten;
    }

    public boolean getGluten() {
        return this.gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public boolean isQueso() {
        return this.queso;
    }

    public boolean getQueso() {
        return this.queso;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    @Override
    public String toString() {
        return super.toString() +
            "Salsa: " + isSalsa() + "\n" +
            "Gluten: " + isGluten() + "\n" +
            "Queso: " + isQueso() + "\n";
    }

}