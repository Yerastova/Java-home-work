package module2;

public class HomeWork7 {
    static int temporaryVariable;

    public static int [] sortArrayInAscending (int [] arrayForSorting) {


        for ( int i = 0; i < arrayForSorting.length; i++){
            for (int j = arrayForSorting.length - 1; j > i; j--) {
                if (arrayForSorting[j-1] > arrayForSorting [j]) {
                    temporaryVariable = arrayForSorting[j-1];
                    arrayForSorting[j-1] = arrayForSorting[j];
                    arrayForSorting[j] = temporaryVariable;
                }
            }
        }
        return arrayForSorting;
    }

    public static int [] sortArrayInDescending (int [] arrayForSorting) {
        for ( int i = 0; i < arrayForSorting.length; i++){
            for (int j = arrayForSorting.length - 1; j > i; j--) {
                if (arrayForSorting[j-1] < arrayForSorting [j]) {
                    temporaryVariable = arrayForSorting[j-1];
                    arrayForSorting[j-1] = arrayForSorting[j];
                    arrayForSorting[j] = temporaryVariable;
                }
            }
        }
        return arrayForSorting;
    }

    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main (String [] args) {
        int [] array = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};

        sortArrayInAscending(array);
        printArray(array);
        System.out.println("-----------------------------");

        sortArrayInDescending(array);
        printArray(array);

    }
}
