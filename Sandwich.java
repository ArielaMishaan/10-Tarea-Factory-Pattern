public class Sandwich extends Plato {
    private String pan;
    private boolean combo;

    public Sandwich(){
        super();
        pan = "";
        combo = false;
    }

    public Sandwich(String nombre, float precio, String pan, boolean combo){
        super(nombre, precio);
        this.pan = pan;
        this.combo = combo;
    }


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
            " pan='" + getPan() + "'" +
            ", combo='" + isCombo() + "'" +
            "}";
    }


}