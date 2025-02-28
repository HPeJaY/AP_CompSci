/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Jay Wang
 * @version 06/29/2021
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;        // starting US Dollars
        //Mexico
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        //remaining variables below here
        
        //China
        double yuansSpent = 3542.45;
        double yuanExchangeRate = 6.458835;
        
        //Brazil
        double realsSpent = 8274.84;
        double realExchangeRate = 4.941995;
        
        
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        //Pesos
        double dollarsSpentInMexico = pesosSpent / (double)pesoExchangeRate;      
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        //Yuans
        double dollarsSpentInChina = yuansSpent / (double)yuanExchangeRate;
        double dollarsAfterChina = dollarsAfterMexico - dollarsSpentInChina;
        //Reals
        double dollarsSpentInBrazil = realsSpent / (double)realExchangeRate;
        double dollarsAfterBrazil = dollarsAfterChina - dollarsSpentInBrazil;
        
        // code goes below here:
        //Output for the Currency in each country
        System.out.println("Starting Us dollars: " + startingUsDollars);
        
        //Trip in Mexico
        System.out.println("");
        System.out.println("Mexico:");
        System.out.println(" Pesos spent: " + pesosSpent);
        System.out.println(" US dollars equivalent: " + dollarsSpentInMexico);
        System.out.println(" US dollars remaining: " + dollarsAfterMexico);
        
        //Trip in China
        System.out.println("");
        System.out.println("China:");
        System.out.println(" Yuans spent: " + yuansSpent);
        System.out.println(" US dollars equivalent: " + dollarsSpentInChina);
        System.out.println(" US dollars remaining: " + dollarsAfterChina);
        
        //Trip in Brazil
        System.out.println("");
        System.out.println("Brazil:");
        System.out.println(" Reals spent: " + realsSpent);
        System.out.println(" US dollars equivalent: " + dollarsSpentInBrazil);
        System.out.println(" US dollars remaining: " + dollarsAfterBrazil);
        System.out.println("*********************************************");
        System.out.println("Remaining US dollars: " + dollarsAfterBrazil);
        System.out.println("\n"); //big space




        // Complete the code below for Souvenir Purchases
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                          //cost per item of first souvenir
        int budget1 = 100;                           //budget for first item
        int totalItems1 = budget1 / costItem1;       //how many items can be purchased
        int fundsRemaining1 = budget1 % (totalItems1 * costItem1);  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
         System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                          //cost per item of second souvenir
        int budget2 = 500;                               //budget for second item
        int totalItems2 = (int) (budget2 / costItem2);     //how many items can be purchased
        double fundsRemaining2 = (double) (budget2 % (totalItems2 * costItem2));    //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
