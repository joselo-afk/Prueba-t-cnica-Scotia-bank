import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaEnlazadaTest {

    private ListaEnlazada lista;

    @BeforeEach
    public void setUp() {
        lista = new ListaEnlazada(); // Inicializa la lista antes de cada prueba
    }

    @Test
    public void testAgregar() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        // Verifica si los valores se agregaron correctamente
        assertTrue(lista.buscar(10));
        assertTrue(lista.buscar(20));
        assertTrue(lista.buscar(30));
    }

    @Test
    public void testEliminar() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.eliminar(20);

        // Verifica si el valor 20 fue eliminado
        assertFalse(lista.buscar(20));

        // Verifica si los otros valores siguen presentes
        assertTrue(lista.buscar(10));
        assertTrue(lista.buscar(30));
    }

    @Test
    public void testBuscar() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        // Verifica si los valores existen en la lista
        assertTrue(lista.buscar(10));
        assertTrue(lista.buscar(20));
        assertTrue(lista.buscar(30));

        // Verifica un valor que no existe
        assertFalse(lista.buscar(40));
    }

    @Test
    public void testObtener() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(10);
        lista.agregar(30);

        // Verifica las posiciones del valor 10
        assertEquals("0, 2", lista.obtener(10));

        // Verifica una posición única para el valor 20
        assertEquals("1", lista.obtener(20));

        // Verifica para un valor no existente
        assertEquals("Valor no encontrado", lista.obtener(40));
    }

    @Test
    public void testImprimir() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        //Verifica que el resultado generado no sea una lista vacia
        assertDoesNotThrow(() -> lista.imprimir());
    }
}
        
