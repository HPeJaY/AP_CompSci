/**
 * Performs a math trick. 
 * @author Jay Wang
 * @version 7-22-2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {
    
    // Step 1) Creates a random 3-digit number where the first and third digits differ by more than one
    // Hint: use modulus for the last digit and divide by 100 for the first digit.
    public static int getRandomNum() 
    {   String num = "";
        int firstDigit = 0;
        int midDigit = (int)(Math.random() * 10);
        int lastDigit = 0;
        int randomNum = (int)(Math.random() * 9) + 1;
        int threeDigitNum = 0;
        // complete the method
        while (firstDigit == 0 && lastDigit == 0)
        {
            lastDigit = (randomNum % 10);
            firstDigit = (randomNum / 2);
            if ((lastDigit - firstDigit) > 1  || (firstDigit - lastDigit) > 1)
            {
                num = (firstDigit + "" + midDigit + "" + lastDigit);
                threeDigitNum = Integer.parseInt(num);
                firstDigit = 1;
            }
            else 
            {
                firstDigit = 0;
                lastDigit = 0; 
            }
        }
        return threeDigitNum;
    } 

    // Step 2 & 4) reverse the digits of a number
    public static int reverseDigits (int num) {
        int reverseDigits = 0;
        while (num > 0)
        {
        reverseDigits = reverseDigits * 10 + (num % 10);
        num = num / 10;
        }
        // complete the method
        return reverseDigits;
    }
    
    // Step 7) replace characters in a string according to the chart
    public static String replaceLtr(String str)
    {
        String replaceInt = "";
        int c = str.length();
        
        replaceInt = str.replace("0", "Y");
        String replaceInt1 = replaceInt.replace("1", "M");
        String replaceInt2 = replaceInt1.replace("2", "P");
        String replaceInt3 = replaceInt2.replace("3", "L");
        String replaceInt4 = replaceInt3.replace("4", "R");
        String replaceInt5 = replaceInt4.replace("5", "O");
        String replaceInt6 = replaceInt5.replace("6", "F");
        String replaceInt7 = replaceInt6.replace("7", "A");
        String replaceInt8 = replaceInt7.replace("8", "I");
        String replaceInt9 = replaceInt8.replace("9", "B");
        
        // complete the method 
        return replaceInt9;
    }
    
    // Step 8) reverse the letters in a string
    public static String reverseString(String str) {
        String num = "";
        int wordLength = str.length();
        
        for (int i = wordLength -1; i >= 0; i--)
        {
            num += str.charAt(i); //i is the position of the letter as a #
        }
        
        
        // complete the method
        return num;
    }
        
    public static void main(String[] args) 
    { 
        //1.    Generate a random 3-digit number so that the first and third digits differ by more than one.
            int startingNum = getRandomNum();
            System.out.println("1. The starting number: " + startingNum);

        //2.    Now reverse the digits to form a second number.
            int reversedNum = reverseDigits(startingNum);
            System.out.println("2. The reversed number: " + reversedNum);

        //3.    Subtract the smaller number from the larger one.
            int theDifference = 0;
            if (startingNum > reversedNum)
            {
                theDifference = startingNum - reversedNum;
                System.out.println("3. The difference is: " + theDifference);
            }
            else 
            {
                theDifference = reversedNum - startingNum;
                System.out.println("3. The difference is: " + theDifference);
            }

        //4.    Now reverse the digits in the answer you got in step 3 and add it to that number.
            int reversedNum2 = reverseDigits(theDifference);
            int sumOf = reversedNum2 + theDifference;
            System.out.println("4. The reversed number added to difference: " + sumOf);

        //5.    Multiply by one million.
            int numXAMillion = sumOf * 1000000;
            System.out.println("5. Number X one million: " + numXAMillion);

        //6.    Subtract 733,361,573.
            int numSubtracted = numXAMillion - 733361573;
            String convertedNum = String.valueOf(numSubtracted);
            System.out.println("6. Number subtracted and converted to String: " + convertedNum);

        //7.    Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
            String replacedChar = replaceLtr(convertedNum);
            System.out.println("7. Replaced string: " + replacedChar);

        //8.    Now reverse the letters in the string to read your message backward.
            String messageBackward = reverseString(replacedChar);
            System.out.println("8. Reversed string: " + messageBackward);

    } // end main
} // end class
