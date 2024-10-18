public class Instrumento_musical {
    String nombre;
    String tipo;
    float precio;
    int anio;
    int numero_serie;
    //Constructor
    public Instrumento_musical(String nombre, String tipo, float precio, int anio, int numero_serie) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.anio = anio;
        this.numero_serie = numero_serie;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }
    //Metodo imprimir instrumento
    public void imprimir_instrumento(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Numero de serie: "+getNumero_serie());
        System.out.println("Anio "+getAnio());
        System.out.println("Costo. "+getPrecio());
        System.out.println("-----------------------------------");
    }
}
