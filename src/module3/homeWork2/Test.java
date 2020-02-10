package module3.homeWork2;

public class Test {
    public static void main (String [] args){
        Accounting accounting = new Accounting();

        double workingHours = 11;
        double payPerHour = 1.8;

        System.out.println(accounting.pay(workingHours, payPerHour));
    }
}
