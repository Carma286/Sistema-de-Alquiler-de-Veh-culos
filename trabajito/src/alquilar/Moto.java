
package alquiler;


public class Moto extends Vehiculo {
    public Moto(String marca,String modelo,double tarifabase){
    super(marca,modelo,tarifabase);
}

    @Override
    public double calcularcostodealquiler(int dias) {
        return (getTarifabase() * dias) + 5;
    }
}