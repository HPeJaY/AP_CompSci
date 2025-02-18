
/**
 * Purpose: Calculate your average grade using individual test scores and total
 * points.
 * @author Jay Wang
 * @version 6-28-2021
 */
public class GradesV2
{
    public static void main(String[]args)
    {
       //local variables
       int numTests = 0;      //counts number of tests
       int testGrade = 0;     //individual test grade
       int totalPoints = 0;   //total points for all tests
       double average = 0.0;  //average grade
       
       System.out.println("Tests:");
       System.out.println("");

       //Test # 1
       testGrade = 95;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //Test # 2
       testGrade = 73;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //Test # 3
       testGrade = 91;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //Test # 4
       testGrade = 82;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       System.out.println("");
       System.out.println("***************************");
       System.out.println("My Tests:");
       System.out.println("");
       
       //My Test #1
       testGrade = 37;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //My Test #2
       testGrade = 62;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //My Test #3
       testGrade = 40;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //My Test #4
       testGrade = 56;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       //My Test # 5
       testGrade = 78;
       numTests++;
       totalPoints += testGrade;
       average = (double)totalPoints / numTests;
       System.out.print("Test # " + numTests);
       System.out.print("\tTest Grade: " + testGrade);
       System.out.print("\t\tTotal Points: " + totalPoints);
       System.out.println("\tAverage Score: " + average);
       
       
       
       
    }//end of main method
}//end of class
