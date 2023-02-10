public class Pizza extends Plato{

    private String topping;
    private boolean orillaQueso;
    private boolean delgada;

    public Pizza() {
        super();
        topping = "carne";
        orillaQueso = true;
        delgada = true;
    }

    public Pizza(String nombre, float d, String topping, boolean orillaQueso, boolean delgada) {
        super(nombre, d);
        this.topping = topping;
        this.orillaQueso = orillaQueso;
        this.delgada = delgada;
    }

    public String getTopping() {
        return this.topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isOrillaQueso() {
        return this.orillaQueso;
    }

    public boolean getOrillaQueso() {
        return this.orillaQueso;
    }

    public void setOrillaQueso(boolean orillaQueso) {
        this.orillaQueso = orillaQueso;
    }

    public boolean isDelgada() {
        return this.delgada;
    }

    public boolean getDelgada() {
        return this.delgada;
    }

    public void setDelgada(boolean delgada) {
        this.delgada = delgada;
    }


    @Override
    public String toString() {
        return super.toString() +
            "Topping='" + getTopping() + "\n" +
            "OrillaQueso='" + isOrillaQueso() + "\n" +
            "Delgada='" + isDelgada() + "\n";
    }

    
}