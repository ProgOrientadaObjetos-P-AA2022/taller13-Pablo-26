/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class VentasTVs {
    
    private ArrayList<Televisor> tvs;
    private double totalPrecio;
    private double tvCaro;
    private String marcas;
    
    public void establecerListaTelevisores(ArrayList<Televisor> t){
        tvs = t;
    }
    
    public void establecerPrecioTotal(){
        totalPrecio = 0;
        for (int i = 0; i < tvs.size(); i++) {
            totalPrecio += tvs.get(i).obtenerPrecio();
        }
    }
    
    public void establecerTelevisorMasCaro(){
        tvCaro = 0;
        for(int i = 0; i < tvs.size(); i++) {
            if(tvs.get(i).obtenerPrecio() > tvCaro){
                tvCaro = tvs.get(i).obtenerPrecio();
            }
        }
    }
    
    public void establecerListaMarcasVendidas(){
        marcas = "";
        for (int i = 0; i < tvs.size(); i++) {
            marcas = String.format("%s-%s\n", marcas, tvs.get(i).obtenerMarca());
        }
    }
    
    public ArrayList<Televisor> obtenerListaTelevisores(){
        return tvs;
    }
    
    public double obtenerPrecioTotal(){
        return totalPrecio;
    }
    
    public double obtenerTelevisorMasCaro(){
        return tvCaro;
    }
    
    public String obtenerListaMarcasVendidas(){
        return marcas;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Total precio TVs: %.2f\n"
                + "TV mas caro: %.2f\n"
                + "Marcas mas vendidas:\n%s\n",
                obtenerPrecioTotal(),
                obtenerTelevisorMasCaro(),
                obtenerListaMarcasVendidas());
        return cadena;
    }
}
