package Movilidad;

public class Auto {
    String  marca;
    String modelo;
    String color;
    float kilometraje;
    boolean nuevo;
    //Constructor
    public Auto(String marca, String modelo, String color, float kilometraje, boolean nuevo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.nuevo = nuevo;
    }
    //Getters y Setters
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    // Metodo imprimir auto
    public void imprimir_auto(){
        System.out.println("-----------------------------------");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Kilometraje: "+getKilometraje());
        System.out.println("Nuevo: "+isNuevo());
        System.out.println("-----------------------------------");
    }
}

