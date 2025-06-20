public abstract class Automovil implements Calculable {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;

    public Automovil(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
    public double getPrecioBase() { return precioBase; }

    public abstract double calcularPrecioFinal();
}