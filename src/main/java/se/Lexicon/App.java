package se.Lexicon;

import java.util.Scanner;
public class App<Public>
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args ) {
        int operator = -1;
        boolean loop = true;
        int[] numbersOne = {8,4,7};
        int sumOne = makeAddition(numbersOne);
        System.out.println("The total sum: "+sumOne);
        int[] numbersTwo = {4,2,3};
        int sumTwo = makeSubtraction(numbersTwo);
        System.out.println("The total sum: "+sumTwo);

        while(loop) {
            boolean gotResult = true;
            int result = 0;
            System.out.println("Calculator");
            System.out.println("Make an option:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Quit");
            operator = scanner.nextInt();
            switch (operator) {
                case 1:
                    result = makeAddition(getNumber("first"), getNumber("second"));
                    break;
                case 2:
                    result = makeSubtraction(getNumber("first"), getNumber("second"));
                    break;
                case 3:
                    result = makeMultiplication(getNumber("first"), getNumber("second"));
                    break;
                case 4:
                    result = makeDivision(getNumber("first"), getNumber("second"));
                    break;
                case 5:
                    result = makeModulus(getNumber("first"), getNumber("second"));
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    gotResult = false;
                    System.out.println("Error");
            }//End of Switch
            if (gotResult && loop) {
                System.out.println("Your result\n " + result); }
        }//End of While
    }//End of Main
    public static int getNumber(String Name){
        System.out.println("Enter " + Name + " number ");
        return scanner.nextInt(); }
    public static int makeAddition(int numOne, int numTwo){
        return numOne+numTwo; }
    public static int makeSubtraction(int numOne, int numTwo){
        return numOne-numTwo; }
    public static int makeDivision(int numOne, int numTwo){
        if(numTwo==0){
            System.out.println("You can't divide by Zero");
            return 0; }
        else {
            return numOne / numTwo; }
        }//End of makeDivision
    public static int makeMultiplication(int numOne, int numTwo){
        return numOne*numTwo; }
    public static int makeModulus(int numOne, int numTwo){
        return numOne%numTwo;
    }
    public static int makeAddition(int[] numbersOne){
        int sumOne = 0;
        for(int numB : numbersOne)
        {
            sumOne = sumOne + numB;
        }
        return sumOne;
    }
    public static int makeSubtraction(int[] numbersTwo){
        int sumTwo = 0;
        for(int numB : numbersTwo)
        {
            sumTwo = sumTwo - numB;
        }
        return sumTwo;
    }
}//End of App