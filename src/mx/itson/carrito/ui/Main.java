/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;
import mx.itson.carrito.entidades.Carro;
import java.util.Scanner;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author alelo
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Carro bmw = new Carro();
        
        bmw.setBrand("BMW");
        bmw.setYear(2016);
        bmw.setColor("Azul");
        bmw.setMileage(0);
        bmw.setTipoMotor(TipoMotor.COMBUSTION);
        
        System.out.print("Ingrese la velocidad a la que va (km/h): ");
        double speed =  scanner.nextDouble();
        System.out.print("\nIngrese la velocidad que quiere recorrer(km/h): ");
        double distance = scanner.nextDouble();
        
        System.out.println(bmw.getMileage());
        double time = bmw.calculateTime(distance, speed);
        System.out.println(bmw.getMileage());
        
        
        
        System.out.printf("El tiempo que le va a tomar es/son %f hora/s", time);
    }
    
}
