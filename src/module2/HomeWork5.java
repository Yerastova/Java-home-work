package module2;


public class HomeWork5 {
    public static void searchIntElement (int [] arr, int elementNeedToFind){
        int i;
        i = 0;
        boolean isElementFound = false;


        while (i < arr.length) {
            if (arr[i] == elementNeedToFind) {
                isElementFound = true;
                break;
            }
            i++;
        }

        if (isElementFound) {
            System.out.println("Element is found. Element = " + arr[i]);
        }else {
            System.out.println("Element not found");
        }
    }

    public static void main (String[] args){
        int [] arr =  {10, 526, 777, 55, 20, 64, 49, 8420, 65, 3};

        int findNumber = 8420;

        searchIntElement(arr, findNumber);

    }
}
