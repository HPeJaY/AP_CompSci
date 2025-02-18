
/**
 * A program to calculate and count the quantity of prime numbers 
 * between a given range.
 *
 * @author Jay Wang
 * @version 11-24-2021
 */
import java.util.Scanner;
public class PrimeNumberTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program to find prime number within a range.");
        System.out.println("*********************************************");
        
        boolean userQuit = false;
        
        while(!userQuit)
        {
            System.out.println();
            System.out.println("Enter (S) to Start; (Q) to Quit");
            String userAns = input.next();
            boolean userWantStart = userAns.equalsIgnoreCase("S");
            boolean userWantQuit = userAns.equalsIgnoreCase("Q");
            
            if(userWantStart)
            {
                System.out.println("Please enter a lower limit value: ");
                int lowerVal = input.nextInt();
                
                System.out.println("Please enter a upper limit value: ");
                int upperVal = input.nextInt();
                
                PrimeNumber test1 = new PrimeNumber(lowerVal, upperVal);
                System.out.print("Your Prime Numbers: ");
                test1.printPrimeNum(lowerVal, upperVal);
                System.out.println();
            }
            else if(userWantQuit)
            {
                System.out.println();
                System.out.println("Thank You for Using this Program!");
                userQuit = true;
            }
        }
    }
}
