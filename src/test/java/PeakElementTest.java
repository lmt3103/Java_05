import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Ignore
    @Test
    public void testPeakElement_HappyPath() {
        //AAA
        //arrange
        int[] array = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23, 0, 0, 0, 0, 0};

        //act
        int[] actualResult = new PeakElement().peakElement(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
