/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;
import java.util.Random;
/**
 *
 * @author alelo
 */
public class Heroe {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    private String nombre;
    private float vida;
    private int ataque;
    
    
    public void atacar(Heroe objetivo){
        Random random = new Random();
        
        int danioHeroe = random.nextInt(this.getAtaque() - 5, this.getAtaque() + 5);
        int danioObjetivo = random.nextInt(objetivo.getAtaque() - 5, objetivo.getAtaque() + 5);

        
        objetivo.setVida(objetivo.getVida() - danioHeroe);
        this.setVida(this.getVida() - danioObjetivo);
        
        System.out.printf("%s ataco a %s, inflingiendo %d puntos de danio\n", this.getNombre(), objetivo.getNombre(), danioHeroe);
        System.out.printf("%s ataco a %s, inflingiendo %d puntos de danio\n", objetivo.getNombre(), this.getNombre(), danioObjetivo);
        
        System.out.printf("Vida de %s: %.1f\n", this.getNombre(), this.getVida());
        System.out.printf("Vida de %s: %.1f\n", objetivo.getNombre(), objetivo.getVida());
        
    }
    
}
