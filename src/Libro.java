public class Libro {
    // Atributos
    String title;
    String autor;
    String publisher;
    int pages;

    // Métodos
    // Un metodo que debe tener toda clase es el constructor
        //Constructor
    public Libro(String title, String autor, String publisher, int pages) {
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.pages = pages;
    }

    public void printbook(){
        System.out.println("El título del libro es: " + this.title);
        System.out.println("El autor es: " + this.autor);
        System.out.println("La editorial es: " + this.publisher);
        System.out.println("El número de páginas es: " + this.pages);
        System.out.println("----------------------------");
    }

    public int print_bookcover(){
        return this.pages+5;
    }
}

