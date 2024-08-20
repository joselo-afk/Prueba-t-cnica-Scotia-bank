
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar un valor a la lista");
            System.out.println("2. Eliminar un valor de la lista");
            System.out.println("3. Buscar un valor en la lista");
            System.out.println("4. Obtener posiciones de un valor en la lista");
            System.out.println("5. Imprimir la lista");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese un valor para agregar: ");
                        int valorAgregar = scanner.nextInt();
                        lista.agregar(valorAgregar);
                        System.out.println("Valor agregado.");
                        break;
                    case 2:
                        System.out.print("Ingrese un valor para eliminar: ");
                        int valorEliminar = scanner.nextInt();
                        lista.eliminar(valorEliminar);
                        System.out.println("Valor eliminado, si existía.");
                        break;
                    case 3:
                        System.out.print("Ingrese un valor para buscar: ");
                        int valorBuscar = scanner.nextInt();
                        boolean encontrado = lista.buscar(valorBuscar);
                        System.out.println(encontrado ? "Valor encontrado." : "Valor no encontrado.");
                        break;
                    case 4:
                        System.out.print("Ingrese un valor para obtener posiciones: ");
                        int valorObtener = scanner.nextInt();
                        String posiciones = lista.obtener(valorObtener);
                        System.out.println("Posiciones del valor: " + posiciones);
                        break;
                    case 5:
                        System.out.println("Lista actual:");
                        lista.imprimir();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada no válida
            }
        }

        scanner.close();
    }
}
