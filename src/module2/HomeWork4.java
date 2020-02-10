package module2;

public class HomeWork4 {
    public static final String[] UNITS = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen" };

    public static final String[] TENS = {
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"};

    public static String convertNumbersToWords(int number) {

        if (number < 20) {
            return UNITS[number];
        } else if (number < 100) {
            if (number % 10 == 0) {
                return TENS[number /10 - 2];
            } else {
                return TENS[number / 10 - 2] + "-" + UNITS[number % 10];
            }
        }else if (number < 1000) {
            if (number % 100 ==0) {
                return UNITS[number / 100] + " hundred";
            } else {
                return UNITS[number / 100] + " hundred " + convertNumbersToWords(number % 100);
            }
        } else if (number <= 10000) {
            if (number % 1000 == 0){
                return UNITS[number / 1000] + " thousand";
            } else {
                return UNITS[number / 1000] + " thousand " + convertNumbersToWords(number % 1000);
            }
        }

        return "Number out of scope";
    }

    public static void main(final String[] args) {


        int numberFrom;
        int numberTo;

        numberFrom = 10;
        numberTo = 150;

        for (int i = numberFrom; i < numberTo +1; i++){
            System.out.println(convertNumbersToWords(i));
        }

        System.out.println("------------------------------");

        numberFrom = 9980;
        numberTo = 10000;

        for (int i = numberFrom; i < numberTo + 1; i++){
            System.out.println(convertNumbersToWords(i));
        }
    }
}
