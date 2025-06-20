public class Main {
    public static void main(String[] args) {
        Automovil lujo = new AutoLujo("BMW", "Serie 7", 2023, 1200000, 150000);
        Automovil nuevo = new AutoNuevo("Toyota", "Corolla", 2024, 400000, 25000);
        Automovil semi = new AutoSeminuevo("Nissan", "Versa", 2020, 250000, 10000);

        System.out.println("Precio final auto de lujo: $" + lujo.calcularPrecioFinal());
        System.out.println("Precio final auto nuevo: $" + nuevo.calcularPrecioFinal());
        System.out.println("Precio final auto seminuevo: $" + semi.calcularPrecioFinal());
    }
}