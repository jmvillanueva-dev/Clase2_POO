//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            System.out.println("Clase2 - Programación Orientada a Objetos!\n");
            /*
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
            */

            Videogame videogame1 = new Videogame("Call of Duty","Action","PS5","Activison",89.60,2021);
            Videogame videogame2 = new Videogame("God of War: Ragnarok","Action-Adventure","PC","Santa-Lucia",58.99,2020);
            Videogame videogame3 = new Videogame();

            System.out.println("Get & Set a class value");
            System.out.println(videogame1.getName());
            videogame1.setName("Call of Duty: Black Ops");
            System.out.println(videogame1.getName());

            System.out.println(videogame2.getName());
            System.out.println(videogame2.getYear());
            videogame2.setYear(2022);
            System.out.println(videogame2.getYear());

            videogame3.setName("Resident Evil 4");
            videogame3.setCategory("Action");
            videogame3.setConsole("PS5");
            videogame3.setPrice(68.75);
            videogame3.setYear(2021);
            System.out.println(videogame3.getCategory());

            videogame3.printInfo();
        }
}
