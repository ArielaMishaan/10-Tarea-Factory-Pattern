public class Pastel extends Plato{

    private String sabor;
    private boolean gluten;

    public Pastel(){
        super();
        sabor = "";
        gluten = false;
    }

    public Pastel(String nombre, float precio, String sabor, boolean gluten) { 
        super(nombre, precio);
        this.sabor = sabor;
        this.gluten = gluten;
    }


    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean getGluten() {
        return this.gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }


    @Override
    public String toString() {
        return super.toString() +
            "Sabor: " + getSabor() + "\n" +
            "Gluten: " + getGluten() + "\n";
    }
}
 