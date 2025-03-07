package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase recoge metodos de una libreria
 * @author David Lázaro
 * @version 7.3.2025
 *
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista de libros disponibles
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * Constructor de la biblioteca vacio
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }


    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Constructor de la biblioteca con un libro concreto
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método
    /**
     * Devuelve la lista de los libros de la biblioteca
     * @return lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Busca el libro con un título determinado
     * @param titulo
     * @return (@code true) si el titulo se ha localizado o (@code false) si el titulo NO se ha localizado
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    /**
     * @deprecated Este metodo ha quedado obsoleto
     * Se recomienda usar (@link {@link #encuentraLibrosPorAutor(String)}) en su lugar
     * @param autor
     * @return
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Busca todos los libros de un autor determinado
     * @since V2.0
     * Sustituye al metodo  ({@link #encuentaLibroPorAutor(String)}) en su lugar
     * @param autor
     * @return (@code true) si el autor se ha localizado o (@code false) si el autor NO se ha localizado
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;

        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
