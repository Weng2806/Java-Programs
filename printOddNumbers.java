import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        
        System.out.println("Please enter First Number: ");
        firstNumber = hello.nextInt();
       
        System.out.println("Please enter Second Number: ");
        secondNumber = hello.nextInt();
        
        System.out.print("Odd number between is: ");
        
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 != 0) {
               System.out.print(i + " ");

            }    
        }
    }
}
/* Pamaran, Ruel Jr. P. */
