import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    // Positive testing Happy path
    //    Input = {0, 1, 2, 3, 4, 5}
    //    Expected Result = 15
    @Test
    public void testSumArrayPosit_HappyPath(){
        //AAA
        //arrange
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().SumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //    Input = {-7, -3}
    //    Expected Result = -10
    @Test
    public void testSumArrayNegat_HappyPath(){
        //AAA
        //arrange
        int[] array = new int[]{-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().SumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Negative
    //    Input = {}
    //    Expected Result = 0
    @Test
    public void testSumArrayNull_Negative(){
        //AAA
        //arrange
        int[] array = new int[]{};
        int expectedResult = 0;

        //act
        int actualResult = new SumArray().SumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
