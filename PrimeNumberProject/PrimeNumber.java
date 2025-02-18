
/**
 * A program to calculate and count the quantity of prime numbers 
 * between a given range.
 *
 * @author Jay Wang
 * @version 11-24-2021
 */
public class PrimeNumber
{
    private int lowerLimit;
    private int upperLimit;
    
    public PrimeNumber(int x, int y)
    {
        this.lowerLimit = x;
        this.upperLimit = y;
    }
    
    public static void printPrimeNum(int min, int max)
    {
        int counter = 0;
        for(int i = min; i <= max; i++)
        {
            boolean prime = true;
            for(int n = 2; n < i; n++) //is it divisible by any number other than 1
            {
                if(i%n == 0) 
                {
                    prime = false;
                }
            }
            if(prime)
            {
                counter++; //used to find number of primes
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Number of Primes: " + counter);
    }
    
}
