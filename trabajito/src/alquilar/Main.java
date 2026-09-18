
package alquiler;

import java.util.ArrayList;


public class Main {
    
    
    public static void main(String[] args) {
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        
        Auto auto = new Auto("Toyota", "Corolla", 50);
        Moto moto = new Moto("Yamaha", "MT-03", 30);
        
        vehiculos.add(moto);
        vehiculos.add(auto);
        
        int dias = 5;
        
        for (Vehiculo vehiculo : vehiculos) {

            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Tarifa base: $" + vehiculo.getTarifabase());
            System.out.println("Costo por " + dias + " dias: $"
                    + vehiculo.calcularcostodealquiler(dias));
            System.out.println("-------------------------");
        }
    }
}