# QuickSort - Esquema de Lomuto (In-place)

Este repositorio contiene la implementación en **Java** del algoritmo de ordenamiento **QuickSort** utilizando el esquema de partición de Lomuto, optimizado para ejecutarse *In-place* (complejidad espacial O(1)).

## Características del Código
- **Partición Lomuto:** Selecciona el último elemento de la sublista como pivote.
- **In-place:** No crea sub-arreglos nuevos, optimizando el uso de memoria intercambiando índices directamente.
- **Traza de ejecución:** Imprime en consola cada paso de la partición para demostrar cómo se acomodan los elementos.

## Estructura del Código
- `quickSort()`: Función principal recursiva que divide el arreglo.
- `partition()`: Lógica que ubica al pivote en su posición final definitiva.
- `swap()`: Método auxiliar para el intercambio de variables en memoria.

## Ejecución
Para compilar y ejecutar este programa desde la terminal:

```bash
javac Main.java
java Main
```

## Salida Esperada (Ejemplo)
```text
=== Ejecución de QuickSort (Divide y Vencerás) ===
Arreglo original: [10, 7, 8, 9, 1, 5]

Partición con pivote '5': [1, 5, 8, 9, 10, 7]
Partición con pivote '7': [1, 5, 7, 9, 10, 8]
Partición con pivote '8': [1, 5, 7, 8, 10, 9]
Partición con pivote '9': [1, 5, 7, 8, 9, 10]

Arreglo ordenado: [1, 5, 7, 8, 9, 10]
==================================================
Desarrollador: Ian Zambada Cazares
ID: 00000279453
```

---
*Desarrollado para la materia de Estructuras de Datos - Instituto Tecnológico de Sonora (ITSON).*
