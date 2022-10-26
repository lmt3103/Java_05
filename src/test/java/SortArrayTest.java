import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test
    public void testSortArrayPosit_HappyPath() {
        //AAA
        //arrange
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSortArrayNegat_HappyPath() {
        //AAA
        //arrange
        int[] array = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {-12, -3, -2, 4, 4, 5, 7, 9, 12};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSortArray_Negative() {
        //AAA
        //arrange
        int[] array = new int[]{};
        int[] expectedResult = {};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
