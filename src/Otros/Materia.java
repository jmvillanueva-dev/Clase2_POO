package Otros;

public class Materia {
    String nombre;
    String codigo;
    int creditos;
    int aula;
    boolean presencial;
    //Constructor
    public Materia(String nombre, String codigo, int creditos, int aula, boolean presencial) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.aula = aula;
        this.presencial = presencial;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }
    //Metodo imprimir materia
    public void imprimir_materia(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Creditos: "+getCreditos());
        System.out.println("Aula: "+getAula());
        System.out.println("Presencia: "+isPresencial());
        System.out.println("-----------------------------------");
    }
}
