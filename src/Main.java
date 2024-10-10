//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            // para declarar el objeto
            // para instanciar una clase
            Libro libro1 = new Libro("El Resplandor","Sthephen King","De Bolsillo", 600);
            Libro libro2 = new Libro("El Lobo Estepario","Hermann Hesse", "Lejandria",269);
            Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Sudamericana", 432);
            Libro libro4 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "Planeta", 490);
            Libro libro5 = new Libro("El Silmarillion", "J.R.R. Tolkien", "Booket",448);

            libro1.printbook();
            System.out.println(libro1.print_bookcover());
            libro2.printbook();
            System.out.println(libro2.print_bookcover());
            libro3.printbook();
            System.out.println(libro3.print_bookcover());
            libro4.printbook();
            System.out.println(libro4.print_bookcover());
            libro5.printbook();
            System.out.println(libro5.print_bookcover());



        }
}
