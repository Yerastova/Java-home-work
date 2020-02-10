package module2;

import java.util.Arrays;

public class HomeWork6 {
    public static double arithmeticMeanOfArray (int [] array) {
        double arithmeticSum = 0;
        for (int i = 0; i < array.length; i++){
            arithmeticSum = arithmeticSum + array[i];
        }
        return arithmeticSum/array.length;
    }

    public static double medianOfArray (int [] array) {
        Arrays.sort(array);
        double median;
        int size = array.length;
        if (array.length % 2 == 0){
            double value1 = array[size/2];
            double value2 = array[size/2 -1];
            median = (value1 + value2)/2;
            return median;
        } else {
            return array[array.length/2];
        }

    }

    public static int modeOfArray (int [] array){

        int [] countIteration = new int[array.length];
        for (  int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    countIteration[i]++;
                }
            }
        }

        int maxIteration = 0;
        for (int i = 0; i < array.length; i++){
            if (countIteration[i] >= maxIteration) {
                maxIteration = i;
            }
        }
        return  array[maxIteration];
    }

    public static double standardDeviationOfArray(int[] array){

        double sumOfTheDifferences = 0;
        double arithmeticMean = arithmeticMeanOfArray(array);

        for (int i = 0; i < array.length; i++) {
            sumOfTheDifferences = sumOfTheDifferences + Math.pow((array[i] - arithmeticMean), 2);
        }
        return Math.sqrt(sumOfTheDifferences/(array.length -1));
    }

    public static void main (String [] args) {
        int [] array = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};

        int [] array2 = {1, 2, 3};

        System.out.println(arithmeticMeanOfArray(array));

        System.out.println(medianOfArray(array));

        System.out.println(modeOfArray(array2));
        System.out.println(standardDeviationOfArray(array2));

    }

}
