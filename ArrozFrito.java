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


    public boolean isMixto() {
        return this.mixto;
    }

    public boolean getMixto() {
        return this.mixto;
    }

    public void setMixto(boolean mixto) {
        this.mixto = mixto;
    }

    public boolean isVerduras() {
        return this.verduras;
    }

    public boolean getVerduras() {
        return this.verduras;
    }

    public void setVerduras(boolean verduras) {
        this.verduras = verduras;
    }

    @Override
    public String toString() {
        return super.toString() +
            "Mixto: " + isMixto() + "\n" +
            "Verduras: " + isVerduras() + "\n";
    }


}
