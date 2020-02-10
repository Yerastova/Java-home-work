package module2;

public class HomeWork3 {


    public static void main (String [] args){
        int year;
        int chinesYear;
        int colorOfTheYear;
        year = 2020;
        chinesYear = year %12;
        colorOfTheYear = year % 10;

        String chinesZodiacs = "";
        String chinesColorOfTheYear = "";

        switch (chinesYear){
            case 0: chinesZodiacs = "Monkey ";
            break;
            case 1: chinesZodiacs = "Rooster ";
            break;
            case 2: chinesZodiacs = "Dog ";
            break;
            case 3: chinesZodiacs = "Pig ";
            break;
            case 4: chinesZodiacs = "Rat ";
            break;
            case 5: chinesZodiacs = "Ox ";
            break;
            case 6: chinesZodiacs = "Tiger ";
            break;
            case 7: chinesZodiacs = "Rabbit ";
            break;
            case 8: chinesZodiacs = "Dragon ";
            break;
            case 9: chinesZodiacs = "Snake ";
            break;
            case 10: chinesZodiacs = "Horse ";
            break;
            case 11: chinesZodiacs = "Goat ";
            break;
        }


        if (colorOfTheYear == 0 || colorOfTheYear == 1){
            chinesColorOfTheYear = "White ";
        } else if (colorOfTheYear == 2 || colorOfTheYear == 3){
            chinesColorOfTheYear = "Blue ";
        } else if (colorOfTheYear == 4 || colorOfTheYear == 5){
            chinesColorOfTheYear = "Green ";
        } else if (colorOfTheYear == 6 || colorOfTheYear == 7){
            chinesColorOfTheYear = "Red ";
        } else if (colorOfTheYear == 8 || colorOfTheYear == 9){
            chinesColorOfTheYear = "Yellow ";
        } else {

        }

        System.out.println("A " + chinesColorOfTheYear + chinesZodiacs + "year for " + year);

    }
}
