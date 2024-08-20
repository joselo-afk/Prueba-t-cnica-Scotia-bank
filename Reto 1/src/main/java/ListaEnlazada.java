
public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para eliminar el primer nodo que contiene el valor dado
    public void eliminar(int valor) {
        if (cabeza == null) return;

        if (cabeza.valor == valor) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.valor != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    // Método para buscar si un valor está en la lista
    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Método para obtener la(s) posición(es) de un valor en la lista
    public String obtener(int valor) {
        Nodo actual = cabeza;
        int posicion = 0;
        StringBuilder posiciones = new StringBuilder();

        while (actual != null) {
            if (actual.valor == valor) {
                if (posiciones.length() > 0) {
                    posiciones.append(", ");
                }
                posiciones.append(posicion);
            }
            actual = actual.siguiente;
            posicion++;
        }

        return posiciones.length() > 0 ? posiciones.toString() : "Valor no encontrado";
    }

    // Método para imprimir todos los valores de la lista
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
