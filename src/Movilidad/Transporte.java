package Movilidad;

public class Transporte {
    String tipo;
    String marca;
    int capacidad;
    float kilometraje;
    int costo;
    //Constructor
    public Transporte(String tipo, String marca, int capacidad, float kilometraje, int costo) {
        this.tipo = tipo;
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.costo = costo;
    }
    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    //Metodo imprimir transporte
    public void imprimir_transporte(){
        System.out.println("-----------------------------------");
        System.out.println("Tipo: "+getTipo());
        System.out.println("Marca: "+getMarca());
        System.out.println("Capacidad: "+getCapacidad());
        System.out.println("Kilometraje: "+getKilometraje());
        System.out.println("Costo. "+getCosto());
        System.out.println("-----------------------------------");
    }
}
