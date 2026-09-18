package alquiler;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCosto(int dias) {
        return (getTarifaBase() + 10) * dias;
    }
}
