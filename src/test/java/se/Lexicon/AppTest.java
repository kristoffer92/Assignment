package se.Lexicon;

import org.junit.Assert;
import org.junit.Test;

//Arrange, //Act, //Assert
public class AppTest
{
    @Test //Dividing by Zero (Division)
    public void test_Division(){
        int numOne = 5; int numTwo = 0;
        int result = App.makeDivision(numOne, numTwo);
        Assert.assertEquals(0, result);
    }
    @Test//Testing Addition
    public void test_makeAddition(){
        int numOne = 3; int numTwo = 5;
        int result = App.makeAddition(numOne, numTwo);
        Assert.assertEquals(8, result);
    }
    @Test//Testing Subtraction
    public void test_makeSubtraction(){
        int numOne = 5; int numTwo = 2;
        int result = App.makeSubtraction(numOne, numTwo);
        Assert.assertEquals(3, result);
    }
    @Test//Testing Division
    public void test_makeDivision(){
        int numOne = 10; int numTwo = 2;
        int result = App.makeDivision(numOne, numTwo);
        Assert.assertEquals(5, result);
    }
    @Test//Testing Multiplication
    public void test_Multiplication(){
        int numOne = 5; int numTwo = 2;
        int result = App.makeMultiplication(numOne, numTwo);
        Assert.assertEquals(10, result);
    }
    @Test//Testing Modulus
    public void test_Modulus(){
        int numOne = 12; int numTwo = 5;
        int result = App.makeModulus(numOne, numTwo);
        Assert.assertEquals(2, result);
    }
    @Test//Testing makeAdd
    public void test_makeAdd(){

    }

}
