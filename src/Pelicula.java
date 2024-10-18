public class Pelicula {
    //Atributos
    String nombre;
    String genero;
    String director;
    int anio_estreno;
    float calificacion ;

    //Constructor
    public Pelicula(String nombre, String genero,String director,int anio_estreno,float calificacion){
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.anio_estreno = anio_estreno;
        this.calificacion = calificacion;
    }

    //Getters y Setters
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(int anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    //Metodo imprimir pelicula
    public void imprimir_pelicula(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("Director: "+getDirector());
        System.out.println("Estreno "+getAnio_estreno());
        System.out.println("Calificacion: "+getCalificacion());
        System.out.println("-----------------------------------");
    }
}
