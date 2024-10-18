package Otros;

public class Zapato {
    String marca;
    String color;
    String tipo;
    int talla;
    float precios;
    //Constructor
    public Zapato(String marca, String color, String tipo, int talla, float precios) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.talla = talla;
        this.precios = precios;
    }
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public float getPrecios() {
        return precios;
    }

    public void setPrecios(float precios) {
        this.precios = precios;
    }
    //Metodo imprimir zapato
    public void imprimir_zapato(){
        System.out.println("-----------------------------------");
        System.out.println("Marca: "+getMarca());
        System.out.println("Color: "+getColor());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Talla: "+getTalla());
        System.out.println("Precio: "+getPrecios());
        System.out.println("-----------------------------------");
    }
}
