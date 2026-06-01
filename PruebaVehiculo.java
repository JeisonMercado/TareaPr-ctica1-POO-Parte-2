/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebavehiculo;

/**
 *
 * @author jeiso
 */
public class PruebaVehiculo {

    public static void main(String[] args) {
        
       Vehiculo v1 = new Vehiculo("ABC-123");
        Vehiculo v2 = new Vehiculo("XYZ-789", "Honda", "Civic");
        Vehiculo v3 = new Vehiculo();
        
        System.out.println("Costo 1 (Solo km): $" + v2.calcularMantenimiento(5000));
        System.out.println("Costo 2 (Km + Servicio): $" + v2.calcularMantenimiento(5000, 2));
        System.out.println("Costo 3 (Km + Servicio + Desc): $" + v2.calcularMantenimiento(5000, 2, 50.0));
        
    }
}
