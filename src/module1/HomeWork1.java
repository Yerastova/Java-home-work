package module1;

public class HomeWork1 {
    public static void main (String [] args){
        double a = 2;
        double b = 3;
        double c = 1;
        double x1;
        double x2;

        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);


    }
}
