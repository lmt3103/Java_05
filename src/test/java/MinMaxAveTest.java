import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve_HappyPath(){
        //AAA
        //arrange
        int[] array = new  int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {3, 7, 5};

        //act
        int[] actualResult = new MinMaxAve().MinMaxAve(array,a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAveEqualsAandB_HappyPath(){
        //AAA
        //arrange
        int[] array = new  int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 2;
        int[] expectedResult = {3, 3, 3};

        //act
        int[] actualResult = new MinMaxAve().MinMaxAve(array,a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAveNull_HappyPath(){
        //AAA
        //arrange
        int[] array = new  int[]{0, 0, 0, 4, 5, 6, 7, 8};
        int a = 0;
        int b = 2;
        int[] expectedResult = {0, 0, 0};

        //act
        int[] actualResult = new MinMaxAve().MinMaxAve(array,a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAveNeg_Negative(){
        //AAA
        //arrange
        int[] array = new  int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = -2;
        int b = 6;
        int[] expectedResult = {};

        //act
        int[] actualResult = new MinMaxAve().MinMaxAve(array,a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAveLessCount_Negative(){
        //AAA
        //arrange
        int[] array = new  int[]{1};
        int a = 2;
        int b = 6;
        int[] expectedResult = {};

        //act
        int[] actualResult = new MinMaxAve().MinMaxAve(array,a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
