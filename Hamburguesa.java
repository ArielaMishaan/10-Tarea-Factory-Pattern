public class Hamburguesa extends Plato{
    private int queso;
    private boolean dobleCarne;
    private boolean combo;

    public Hamburguesa() {
        super();
        queso = 2;
        dobleCarne = true;
        combo = true;
    }

    public Hamburguesa(String nombre, float precio, int queso, boolean dobleCarne, boolean combo) {
        super(nombre, precio);
        this.queso = queso;
        this.dobleCarne = dobleCarne;
        this.combo = combo;
    }

    public int isQueso() {
        return this.queso;
    }

    public int getQueso() {
        return this.queso;
    }

    public void setQueso(int queso) {
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