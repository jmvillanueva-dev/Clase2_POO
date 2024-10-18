public class Cancion {
    //Atributos
    String nombre;
    String song;
    String album;
    String genero;
    int duracion;
    //Constructor
    public Cancion(String nombre, String song, String album, String genero, int duracion) {
        this.nombre = nombre;
        this.song = song;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Metodo imprimir cancion
    public void imprimir_cancion(){
        System.out.println("-----------------------------------");
        System.out.println("Artista: "+getNombre());
        System.out.println("Song: "+getSong());
        System.out.println("Albun: "+getAlbum());
        System.out.println("Duracion: "+getDuracion());
        System.out.println("Genero: "+getGenero());
        System.out.println("-----------------------------------");
    }
}
