package baseLibros;

public class AdminLibros {

    public static void main(String[] args) {

        Libros libro1 = new Libros("Cien años de soledad","Gabriel Garcia Marquez",496,1967);
        Libros libro2 = new Libros("Don Quijote de la Mancha","Miguel de cervantes",1568,2015);
        Libros libro3 = new Libros("Los Tres Mosqueteros","Alexander Dumas",320,1844);

        System.out.println("\n------>Datos originales\n");

        System.out.println("Datos del libro 1: "+libro1);
        libro1.mostrarDatosLibros();
        System.out.println("\n");
        System.out.println("Datos del libro 2: "+libro2);
        libro1.mostrarDatosLibros();
        System.out.println("\n");
        System.out.println("Datos del libro 3: "+libro3);
        libro1.mostrarDatosLibros();
        System.out.println("\n");

        libro1.setAutor("Pepito Perez");
        libro2.setAutor("Juanito Alcachofa");
        libro3.setAutor("El mosquetero");

        System.out.println("------>Datos Modificados\n");

        System.out.println("Datos del libro 1 modificado: "+libro1);
        libro1.mostrarDatosLibros();
        System.out.println("\n");
        System.out.println("Datos del libro 2 modificado: "+libro2);
        libro2.mostrarDatosLibros();
        System.out.println("\n");
        System.out.println("Datos del libro 3 modificado: "+libro3);
        libro3.mostrarDatosLibros();




    }
}
