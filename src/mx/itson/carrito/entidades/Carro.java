package mx.itson.carrito.entidades;

public class Carro {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setMileage(float mileage){
        this.mileage = mileage;
    }
    
    public float getMileage(){
        return mileage;
    }
    
    private String color;
    private int year; 
    private String brand;
    private float mileage;
    
    
    /*
    Calcula el tiempo que tarda el carro en recorrer una distancia
    @param distance: La distancia que va a recorrer
    @param velocidad: Velocidad que viaja el carro
    @return: Tiempo en el que llega el carro
    */
    public double calculateTime(double distance, double speed){
        this.mileage += distance;
        return distance / speed;
    }
    
    
}