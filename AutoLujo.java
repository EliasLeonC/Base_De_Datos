public class AutoLujo extends Automovil {
    private double impuestoAdicional;

    public AutoLujo(String marca, String modelo, int anio, double precioBase, double impuestoAdicional) {
        super(marca, modelo, anio, precioBase);
        this.impuestoAdicional = impuestoAdicional;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + impuestoAdicional;
    }
}