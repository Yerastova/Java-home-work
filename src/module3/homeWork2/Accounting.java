package module3.homeWork2;

public class Accounting {
    public double pay (double numberOfWorkingHours, double perHourPayment){
        if (numberOfWorkingHours < 0 || perHourPayment < 0){
            System.out.println("Number of working hours and payment per hour can not be less than 0. Please enter valid values");
            return -1;
        } else {
            return numberOfWorkingHours * perHourPayment;
        }
    }
}
