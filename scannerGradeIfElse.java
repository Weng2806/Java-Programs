import java.util.Scanner;


public class scannerGradeIfElse {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int Grade;


        System.out.println("Please enter your grade pls: ");
        Grade = input.nextInt();
       
        if(Grade >= 90 && Grade <= 100)
        {
            System.out.println("Your Grade is A! :)");
        }
        else if(Grade >= 80 && Grade <= 89)
        {  
            System.out.println("Your Grade is B! :)");
        }


        else if(Grade >= 70 && Grade <= 79)
        {
            System.out.println("Your Grade is C! :)");


        }


        else if(Grade >= 60 && Grade <= 69)
        {
            System.out.println("Your Grade is D! :)");
        }
       
        else if(Grade >= 101)
        {
            System.out.println("Invalid Grade!");
        }


        else if(Grade <= -1)
        {
            System.out.println("Invalid Grade!");
        }


        else
        {
            System.out.println("Your Grade is F. :)");


        }
    }
}



