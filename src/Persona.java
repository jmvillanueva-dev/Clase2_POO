public class Persona {
    String nombre;
    String genero;
    String email;
    int edad;
    float estatura;

    //Constructor
    public Persona(String nombre, String genero, String email, int edad, float estatura) {
        this.nombre = nombre;
        this.genero = genero;
        this.email = email;
        this.edad = edad;
        this.estatura = estatura;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    //Metodo imprimir persona
    public void imprimir_persona(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Genero: "+getGenero());
        System.out.println("E-mail: "+getEmail());
        System.out.println("Edad: "+getEdad());
        System.out.println("Estatura: "+getEstatura());
        System.out.println("-----------------------------------");
    }
}
