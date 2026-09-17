/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilar;

/**
 *
 * @author EMANUEL
 */
public abstract class Vehiculo {
     private String marca;
    private String modelo;
    private double tarifabase;
    
    public Vehiculo(String marca, String modelo,double tarifabase){
        this.modelo=modelo;
        this.tarifabase=tarifabase;
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTarifabase() {
        return tarifabase;
    }

    public void setTarifabase(double tarifabase) {
        this.tarifabase = tarifabase;
    }
    public abstract double
            calcularcostodealquiler(int dias);
}
 
