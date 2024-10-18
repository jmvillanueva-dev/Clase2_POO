public class Videojuegos {
    //atributos
    String nombre;
    String categoria;
    String desarrolladores;
    String plataforma;
    int lanzamiento;
    //Constructor
    public Videojuegos(String nombre,String categoria, String desarrolladores, String plataforma, int lanzamiento) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.desarrolladores = desarrolladores;
        this.plataforma = plataforma;
        this.lanzamiento = lanzamiento;
    }
    //getters
    public String getNombre() {return nombre;}
    public String getCategoria() {return categoria;}
    public String getDesarrolladores() {return desarrolladores;}
    public String getPlataforma() {return plataforma;}
    public int getLanzamiento() {return lanzamiento;}
    //setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCategoria(String categoria) {this.categoria = categoria;}
    public void setDesarrolladores(String desarrolladores) {this.desarrolladores = desarrolladores;}
    public void setPlataforma(String plataforma) {this.plataforma = plataforma;}
    public void setLanzamiento(int lanzamiento) {this.lanzamiento = lanzamiento;}
    //Metodo imprimir videojuegos
    public void imprimir_videojuegos(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Desarrolladores: "+getDesarrolladores());
        System.out.println("Plataforma: "+getPlataforma());
        System.out.println("Anio: "+getLanzamiento());
        System.out.println("-----------------------------------");
    }
}


