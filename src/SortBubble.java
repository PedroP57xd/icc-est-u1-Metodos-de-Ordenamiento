public class SortBubble {

    public SortBubble() {
    }

    public void sortAscendente(int[] numeros) {
        int preguntas = 0;
        int cambios = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                preguntas++;
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    cambios++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("     Preguntas: " + preguntas);
        System.out.println("     Cambios:   " + cambios);
    }

    public void sortDescendente(int[] numeros) {
        int preguntas = 0;
        int cambios = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                preguntas++;
                if (numeros[j] < numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    cambios++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("     Preguntas: " + preguntas);
        System.out.println("     Cambios:   " + cambios);
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
