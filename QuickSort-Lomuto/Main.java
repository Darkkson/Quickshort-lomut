import java.util.Arrays;

/**
 * Proyecto: Implementación de QuickSort (Esquema de Lomuto In-place)
 * Desarrollador: Ian Zambada Cazares
 * ID: 00000279453
 * Institución: Instituto Tecnológico de Sonora (ITSON)
 */
public class Main {
    
    // Método principal de QuickSort
    static void quickSort(int[] arr, int low, int high) {
        // Caso base: si el índice inferior es mayor o igual al superior, la sublista ya está ordenada
        if (low >= high) return;
        
        // Obtenemos el índice del pivote, el cual ya quedó colocado en su posición definitiva
        int p = partition(arr, low, high);
        
        // TRAZA: Imprimimos el estado del arreglo para visualizar cómo se va ordenando paso a paso
        System.out.println("Partición con pivote '" + arr[p] + "': " + Arrays.toString(arr));
        
        // Llamadas recursivas para ordenar la mitad izquierda y la mitad derecha
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    // Método de partición (Esquema de Lomuto: el último elemento es el pivote)
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Seleccionamos el último elemento como punto de comparación
        int i = low - 1; // Índice que rastrea la posición del último elemento menor al pivote
        
        // Recorremos el segmento actual del arreglo con el puntero j
        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor que el pivote, lo pasamos al lado izquierdo
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // Colocamos el pivote justo después del último elemento menor encontrado
        swap(arr, i + 1, high);
        
        return i + 1; // Retornamos la posición final donde quedó el pivote
    }

    // Método auxiliar para intercambiar las posiciones de dos elementos en memoria
    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        System.out.println("=== Ejecución de QuickSort (Divide y Vencerás) ===");
        System.out.println("Arreglo original: " + Arrays.toString(arr) + "\n");
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nArreglo ordenado: " + Arrays.toString(arr));
        System.out.println("==================================================");
        System.out.println("Desarrollador: Ian Zambada Cazares");
        System.out.println("ID: 00000279453");
    }
}
