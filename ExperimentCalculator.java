import java.util.Scanner;
// code ni ruel baka sabihin ni mark copy paste 🙄 
public class ExperimentCalculator {
    public static void main(String[] args) {
        Scanner nochance = new Scanner(System.in);
        
        System.out.print("Please Input your First Number :D : ");
        double awaw = nochance.nextDouble();

        System.out.print("Please Input your Second Number :D : ");
        double aw = nochance.nextDouble();

        double sum = awaw + aw;
        double difference = awaw - aw;
        double product = awaw * aw;
        double quotient = awaw / aw;
        double modulo = awaw % aw;

        System.out.println("Sum po: " + sum);
        System.out.println("Difference po: " + difference);
        System.out.println("Product po: " + product);
       
            if ( aw != 0) {
                System.out.println("Quotient is: " + quotient);
            }
            else {
                System.out.println("QUOTIENT ERROR!!!");
            }


            if ( aw != 0) {
                System.out.println("Remainder is: " + modulo);
            }
            else {
                System.out.println("REMAINDER ERROR!!!");
            }
        

        System.out.println("");
        System.out.println("experiment #2 :D");
    }
}