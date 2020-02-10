package module2;

public class HomeWork2 {
    public static void main (String [] args){
        double a = 1;
        double b = 2;
        double c = 1;

        double discriminant;
        double x1;
        double x2;


        discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            System.out.println("There is no solution");
        } else if (discriminant == 0) {
            x1 = -b/(2*a);
            System.out.println("There is only one root. Root is " + x1);
        }else {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("there are 2 roots. Root 1 = " + x1 + " Root 2  = " + x2);
        }


    }
}
