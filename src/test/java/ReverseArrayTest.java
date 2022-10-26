import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArrayEvCount_HappyPath() {
        //AAA
        //arrange
        int[] array = new int[]{2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReverseArrayOddCount_HappyPath() {
        //AAA
        //arrange
        int[] array = new int[]{2, 7, 3, 10, -55};
        int[] expectedResult = {-55, 10, 3, 7, 2};

        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReverseArrayNull_HappyPath() {
        //AAA
        //arrange
        int[] array = new int[]{0};
        int[] expectedResult = {0};

        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
