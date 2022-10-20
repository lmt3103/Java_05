import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    //1. Positive testing Happy path
    //    if (number % 2 != 0)
    //    return "Odd";

    @Test
    public void testNechetnoeNumber_HappyPath(){

        //AAA
        //arrange
        int number = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Positive testing Happy path
    //    if (number % 2 == 0)
    //    return "Even";

    @Test
    public void testNumberNull_HappyPath(){

        //AAA
        //arrange
        int number = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Positive testing Happy path
    //    if (number % 2 == 0)
    //    return "Even";

    @Test
    public void testChetnoeNumber_HappyPath(){

        //AAA
        //arrange
        int number = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
