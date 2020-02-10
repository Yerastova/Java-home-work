package module2;

public class HomeWork1 {
    public static void main (String [] args) {
        long from = 0;
        long to = 50000;

        for (long i = from; i <= to; i++){
            boolean isSimple = false;
            double numberSqrt = Math.sqrt(i);
            for (long j = 2; j <= numberSqrt; j++){
                if (i% j != 0){
                    isSimple = true;

                }else {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println("i = " + i );
            }
        }
    }
}
