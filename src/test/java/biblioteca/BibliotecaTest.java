package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro1;
    Libro libro2;
    Libro libro3;
    Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        libro1 = new Libro("Como hacer un examen", "Luis", 2025);
        libro2 = new Libro("Como recuperar un examen", "Luis", 2024);
        libro3 = new Libro("Cómo aprobar EEDD", "David", 2025);
        biblioteca = new Biblioteca();
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1) , "Se ha añadido el libro");
        assertTrue(biblioteca.getLibros().contains(libro1), "El libro ya existe");
        assertEquals(1, biblioteca.getLibros().size(), "El test deberia devolver 1");
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro2);
        assertTrue(biblioteca.eliminarLibro(libro2), "El libro debería ser eliminado");
    }

    @Test
    void getLibros() {
    }

    /**
     * Test 01: buscar libro existente y comprobar que lo localiza.
      */
    @Test
    void encuentraLibroPorTitulo_Existente() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        //biblioteca.agregarLibro(libro3);

        assertEquals(libro1, biblioteca.encuentraLibroPorTitulo("Como hacer un examen"));
        assertEquals(libro2, biblioteca.encuentraLibroPorTitulo("Como recuperar un examen"));
    }

    /**
     * Test 02: buscar libro NO existente y comprobar que no lo localiza.
     */
    @Test
    void encuentraLibroPorTitulo_NoExistente() {
        assertNull(biblioteca.encuentraLibroPorTitulo("Este libro no existe"), "El libro buscado no tiene el titulo");
    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor_Existente() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);


        assertEquals(libro1, biblioteca.encuentraLibrosPorAutor("Luis"));

    }

    @Test
    void encuentraLibrosPorAutor_NoExistente() {
        assertNull(biblioteca.encuentraLibrosPorAutor("Drago"), "El libro buscado no tiene el titulo");
    }
}