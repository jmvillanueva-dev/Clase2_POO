public class Series {
    String nombre;
    String genero;
    String plataforma;
    int numero_episodios;
    int anio;
    //Constructor
    public Series(String nombre, String genero, String plataforma, int numero_episodios, int anio) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.numero_episodios = numero_episodios;
        this.anio = anio;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNumero_episodios() {
        return numero_episodios;
    }

    public void setNumero_episodios(int numero_episodios) {
        this.numero_episodios = numero_episodios;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //Metodo imprimir serie
    public void imprimir_serie(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("Estreno: "+getAnio());
        System.out.println("Plataforma "+getPlataforma());
        System.out.println("Episodios: "+getNumero_episodios());
        System.out.println("-----------------------------------");
    }
}