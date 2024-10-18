import Movilidad.Auto;
import Movilidad.Transporte;
import Musica.Cancion;
import Musica.Instrumento_musical;
import Otros.*;
import TV.Pelicula;
import TV.Series;

public class Main {
        public static void main(String[] args) {
            System.out.println("Clase2 - Programación Orientada a Objetos!\n");

            // Objetos de la clase libros:
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

            // Objetos de la clase Videogame:
            Videojuegos videogame1= new Videojuegos("Call of Duty: Black Ops 5","accion","Activision","PS5",2024);
            Videojuegos videogame2= new Videojuegos("God of War: Ragnarok","Action-Adventure","PC","Santa-Lucia",2020);
            System.out.println("\n>> VIDEOJUEGOS");
            videogame1.imprimir_videojuegos();
            videogame2.imprimir_videojuegos();

            // Objetos de la calse Musica.Cancion:
            Cancion cancion1 = new Cancion("Led Zepellin","D'yer Maker","House of Molly","Rock and Roll",5);
            Cancion cancion2 = new Cancion("Freddie Mercury","I was Born to love you","Mr. Bad guy","Rock",4);
            System.out.println("\n>> CANCIONES");
            cancion1.imprimir_cancion();
            cancion2.imprimir_cancion();
            System.out.println();

            // Objetos de la clase TV.Series
            Series serie1 = new Series("Game of Thrones","Crimen-drama","HBO",62,2010);
            Series serie2 = new Series("Better Call Saul","Drama-historico","Netflix",36,2013);
            System.out.println("\n>> SERIES");
            serie1.imprimir_serie();
            serie2.imprimir_serie();

            // Objetos de la clase Otros.Persona:
            Persona persona1 = new Persona("Jhonny Villanueva","masculino","jhonny.villanueva@epn.edu.ec",28,1.68f);
            Persona persona2 = new Persona("Andrew Zambrano","masculino","andrew.zambrano@epn.edu.ec",20,1.68f);
            System.out.println("\n >>PERSONAS");
            persona1.imprimir_persona();
            persona2.imprimir_persona();

            // Objetos de la clase MOVILIDAD.Auto:
            Auto auto1 = new Auto("Toyota","sedan","rojo",201.43f,true);
            Auto auto2 = new Auto("Chevrolet","sedan","negro",302.49f,false);
            System.out.println(">> AUTOS");
            auto1.imprimir_auto();
            auto2.imprimir_auto();

            // Objetos de la clase MOVILIDAD.Transporte:
            Transporte transporte1 = new Transporte("automovil","Toyota",5,13256,2);
            Transporte transporte2 = new Transporte("avion","Boeing",162,702352,300);
            System.out.println(">> TRANSPORTES");
            transporte1.imprimir_transporte();
            transporte2.imprimir_transporte();

            // Objetos de la clase Otros.Materia:
            Materia materia1 = new Materia("Redes de Computadores","TDS2782",5,28,true);
            Materia materia2 = new Materia("Analsis de Datos","TDS9728",3,12,false);
            System.out.println("\n>> MATERIAS");
            materia1.imprimir_materia();
            materia2.imprimir_materia();

            // Class Zapateria
            Zapato zapato1 = new Zapato("Nike","blanco/rojo","running",40,150);
            Zapato zapato2 = new Zapato("Allen Edmonds","negro","formales",38,180);
            System.out.println("\n>> CALZADO");
            zapato1.imprimir_zapato();
            zapato2.imprimir_zapato();
            System.out.println();

            // Class InstrumentoMusical
            Instrumento_musical intrumento1 = new Instrumento_musical("Piano","acustica",250,2017,1726382);
            Instrumento_musical intrumento2 = new Instrumento_musical("Bajo","electrico",2150,2022,927352);
            System.out.println("\n>> INSTRUMENTOS");
            intrumento1.imprimir_instrumento();
            intrumento2.imprimir_instrumento();

            // Class TV.Pelicula
            Pelicula pelicula1 = new Pelicula("El Padrino","Drama, crimen","Coppola F.",1972,5);
            Pelicula pelicula2 = new Pelicula("Scarface","Drama, crimen","Brian De Palma",1983,4.8f);
            System.out.println("\n>> PELICULAS");
            pelicula1.imprimir_pelicula();
            pelicula2.imprimir_pelicula();
            System.out.println();
        }
}
