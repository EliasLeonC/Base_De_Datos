public class AutoSeminuevo extends Automovil {
    private double cargoRevision;

    public AutoSeminuevo(String marca, String modelo, int anio, double precioBase, double cargoRevision) {
        super(marca, modelo, anio, precioBase);
        this.cargoRevision = cargoRevision;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + cargoRevision;
    }
}