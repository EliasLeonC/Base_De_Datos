public class AutoNuevo extends Automovil {
    private double descuento;

    public AutoNuevo(String marca, String modelo, int anio, double precioBase, double descuento) {
        super(marca, modelo, anio, precioBase);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase - descuento;
    }
}