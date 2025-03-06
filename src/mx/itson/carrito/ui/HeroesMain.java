/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;
import mx.itson.carrito.entidades.*;
import java.util.Scanner;



/**
 *
 * @author alelo
 */
public class HeroesMain {
    
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        Villano villano = new Villano();
        Heroe alexis = new Heroe();
        
        alexis.setNombre("Alexis"); 
        alexis.setVida(101);
        alexis.setAtaque(15);
        
        villano.setNombre("Villano");
        villano.setVida(150);
        villano.setAtaque(10);
        

        while (villano.getVida() > 0 && alexis.getVida() > 0){
            alexis.atacar(villano);
            scanner.nextLine();
        }
        
        System.out.println("El combate ha terminado");
        
    }
    
}
