public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 10, 0, -5, 5, 15, 2 };
        int[] numeros2 = { 10, 0, -5, 5, 15, 2 };
        int[] numeros3 = { 10, 0, -5, 5, 15, 2 };
        String[] nombres = { "Pedro", "Ana", "Maria", "Luis", "Juan" };

        System.out.println("\n     Metodos de Ordenamiento");

        // BubbleSort Mejorado
        SortBubble sortBubble = new SortBubble();
        System.out.println("Bubble Sort Mejorado");
        System.out.println("\nArray Original:");
        sortBubble.printArray(numeros);
        System.out.println("\n\nOrdenado Ascendentemente:");
        sortBubble.sortAscendente(numeros);
        sortBubble.printArray(numeros);
        System.out.println("\n\nOrdenado Descendentemente:");
        sortBubble.sortDescendente(numeros);
        sortBubble.printArray(numeros);

        // SelectionSort
        System.out.println("\n\nEstudiante: Pedro Panjón\n");
        SortSelection sortSelection = new SortSelection();
        System.out.println("     \nSelection Sort");
        System.out.println("\nArray Original");
        sortSelection.printArray(numeros2);
        System.out.println("\n\nArray Ordenado Ascendentemente");
        sortSelection.selectionSortAsce(numeros2);
        sortSelection.printArray(numeros2);
        System.out.println("\n\nArray Ordenado Descendentemente");
        sortSelection.selectionSortDesce(numeros2);
        sortSelection.printArray(numeros2);

        SortInsercion sortInsercion = new SortInsercion();
        System.out.println("\n\nEstudiante: Pedro Panjón\n");
        System.out.println("\nMetodo Insercion");
        System.out.println("\n\nArreglo Original");
        sortInsercion.printArray(numeros3);
        System.out.println("\n\nArreglo Ordenado Ascendentemente");
        sortInsercion.IncercionSortAsce(numeros3, false);
        sortInsercion.printArray(numeros3);
        System.out.println("\n\nArreglo Ordenado Descendentemente");
        sortInsercion.IncercionSortDesce(numeros3, false);
        sortInsercion.printArray(numeros3);

        System.out.println("\n\nEstudiante: Pedro Panjón\n");
        System.out.println("\nMetodo Insercion CON NOMBRES");
        System.out.println("\n\nArreglo Original");
        sortInsercion.printArray(nombres);
        System.out.println("\n\nArreglo Ordenado Alfabeticamante");
        sortInsercion.IncercionSortNomb(nombres, false);
        sortInsercion.printArray(nombres);

        Persona[] personas = new Persona[] {
                new Persona("Pedro", 30),
                new Persona("Ana", 25),
                new Persona("Aria", 28),
        };
        Persona[] personasBase = personas.clone();

        System.out.println("\n\nEstudiante:Pedro Panjón\n");
        System.out.println("\n\nArray de Personas Original: ");
        sortInsercion.printArrayPersonas(personasBase);

        System.out.println("\nOrden por Edad de las personas");
        sortInsercion.sortByPersonasAge(personas);
        sortInsercion.printArrayPersonas(personas);

        System.out.println("\n\nEstudiante:Pedro Panjón\n");
        System.out.println("\n\nArray de Personas Original: ");
        sortInsercion.printArrayPersonas(personasBase);

        System.out.println("\nOrden por Nombres de las personas");
        sortInsercion.sortByPersonasName(personas);
        sortInsercion.printArrayPersonas(personas);
        System.out.println();
    }

}
