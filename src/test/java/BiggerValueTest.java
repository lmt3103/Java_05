import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    // if (a >= b)
    //   return a;
    @Test
    public void testReturnMaxPosit_HappyPath(){
        //Arrange
        int a = 3333;
        int b = 9999;
        int expectedRezult = 9999;

        //Act
        int actualResult = new BiggerValue().BiggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedRezult);
    }

    // if (a >= b)
    //   return a;
    //   else return b;
    @Test
    public void testReturnMaxNegat_HappyPath(){
        //Arrange
        int a = -3333;
        int b = -9999;
        int expectedRezult = -3333;

        //Act
        int actualResult = new BiggerValue().BiggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedRezult);
    }

    @Test
    public void testReturnMaxNegatPosit_HappyPath(){
        //Arrange
        int a = 3333;
        int b = -9999;
        int expectedRezult = 3333;

        //Act
        int actualResult = new BiggerValue().BiggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedRezult);
    }


    @Test
    public void testReturnMaxEquals_HappyPath(){
        //Arrange
        int a = 3333;
        int b = 3333;
        int expectedRezult = 3333;

        //Act
        int actualResult = new BiggerValue().BiggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedRezult);
    }

}
