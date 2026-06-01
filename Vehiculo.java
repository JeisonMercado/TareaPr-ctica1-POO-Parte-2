/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebavehiculo;

/**
 *
 * @author jeiso
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    
    
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Genérico";
    }
    
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
   
    public Vehiculo() {
        this.placa = "F2310";
        this.marca = "AUDI";
        this.modelo = "RS6";
    }
    
    public double calcularMantenimiento(int km) {
        return km * 0.05; 
    }
    
    
    public double calcularMantenimiento(int km, int tipoServicio) {
        double costoBase = km * 0.05;
        if (tipoServicio == 2) {
            return costoBase + 100.0; 
        }
        return costoBase;
        
    }
    
    public double calcularMantenimiento(int km, int tipoServicio, double descuento) {
        double total = calcularMantenimiento(km, tipoServicio);
        return total - descuento;
    }
        
}
