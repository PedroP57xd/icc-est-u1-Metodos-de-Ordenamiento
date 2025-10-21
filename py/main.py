from sortSelection import SortSelection
def main():
    numeros= [5,2,9,1,5,6]
    print()
    print("Estudiante: Pedro Panjón")
    print()
    print("Original: ", numeros)

    selection=SortSelection()
    selection.sort_ascendente(numeros)
    print("ordenado ascendentemente: " , numeros)
    
    
    selection.sort_descendente(numeros)
    print("ordenado descendentemente: " , numeros)
    print()
    print()



if __name__ =="__main__":
    main()