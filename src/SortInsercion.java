public class SortInsercion {

    public SortInsercion() {

    }

    public void IncercionSortAsce(int[] numeros, boolean pasos) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int aux = numeros[i];
            int j = i - 1;
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j >= 0 && aux < numeros[j]) {
                if (pasos) {
                    System.out.println("Compara aux: " + aux + ", con numeros[" + j + "]:" + numeros[j]);
                }

                numeros[j + 1] = numeros[j];
                if (pasos) {
                    printArray(numeros);
                }
                j--;
                if (pasos) {
                    System.out.println("mueve numeros[" + (j + 1) + "] a numeros" + (j + 2) + "]");
                }
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Insertar aux: " + aux + ", En la posicion: " + (j + 1));
                System.out.print("Estado Actual");
                printArray(numeros);
            }
        }
    }
    // public void IncercionSort(String[] nombres, boolean pasos) {
    // for (int i = 0; i < nombres.length - 1; i++) {
    // int aux = nombres[i];
    // int j = i-1;
    // if (pasos) {
    // System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
    // }
    // while (j >= 0 && aux < nombres[j]) {
    // if(pasos){
    // System.out.println("Compara aux: "+aux+", con nombres["+j+"]:"+nombres[j]);
    // }

    // nombres[j + 1] = nombres[j];
    // if (pasos) {
    // printArray(nombres);
    // }
    // j--;
    // if (pasos) {
    // System.out.println("mueve nombres["+(j+1)+"] a nombres" +(j+2)+"]");
    // }
    // }
    // nombres[j + 1] = aux;
    // if (pasos) {
    // System.out.println("Insertar aux: "+aux+", En la posicion: " + (j+1));
    // System.out.print("Estado Actual");
    // printArray(nombres);
    // }
    // }
    // }

    public void sortByPersonasAge(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j=i-1;
            Persona aux = personas[i];
            while(j>=0 && aux.getAge()<personas[j].getAge()){
                personas[j+1]=personas[j];
                j--;
            }
            personas[j+1]=aux;
        }
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public void printArrayPersonas(Persona[] personas) {
        System.out.print("[");
        for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i]);
            if (i < personas.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

}