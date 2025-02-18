
/**
 * Purpose: Using math class methods to calculate the hypotenuse of two right 
 * triangles.
 *
 * @author Jay Wang
 * @version 7-2-2021
 */
public class PyTheorem
{
    public static void main(String[]args)
    {
    //Pythagorean Theorem: a^2 + b^2 = c^2
    
    //Delcare for Triangle #1
    int triNum = 0;
    int tri1RandNumA = (int)(Math.random() * 17) + 5;
    int tri1RandNumB = (int)(Math.random() * 17) + 5;
    double tri1Hypotenuse = Math.sqrt(Math.pow(tri1RandNumA, 2) + Math.pow(tri1RandNumB, 2));
    
    //Delcare for Triangle #2
    int tri2RandNumC = (int)(Math.random() * 17) + 5;
    int tri2RandNumD = (int)(Math.random() * 17) + 5;
    double tri2Hypotenuse = Math.sqrt(Math.pow(tri2RandNumC, 2) + Math.pow(tri2RandNumD, 2));
    
    //Calculate Triangle #1
    triNum++;
    System.out.print("Triangle " + triNum);
    System.out.print("\tSide 1: " + tri1RandNumA);
    System.out.print("\tSide 2: " + tri1RandNumB);
    System.out.println("\tHypotenuse:" + tri1Hypotenuse);
    
    //Calculate Triangle #2
    triNum++;
    System.out.print("Triangle " + triNum);
    System.out.print("\tSide 1: " + tri2RandNumC);
    System.out.print("\tSide 2: " + tri2RandNumD);
    System.out.println("\tHypotenuse:" + tri2Hypotenuse);
    
    
    
    }//end of main method
}// end of class
