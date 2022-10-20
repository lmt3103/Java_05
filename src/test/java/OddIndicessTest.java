import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicessTest {

    // Positive testing Happy path
    //    Input = {-45, 590, 234, 985, 12, 68}
    //    Expected Result =  {590, 985, 68}
   @Test
   public void testNechetnoeNumber_HappyPath(){
       //AAA
       //arrange
       int[] array = new int[]{-45, 590, 234, 985, 12, 68};
       int[] expectedResult = {590, 985, 68};

       //act
       int[] actualResult = new OddIndicess().OddIndices(array);

       //Assert
       Assert.assertEquals(actualResult, expectedResult);
   }

    // Positive testing Happy path
    //    Input = {-45}
    //    Expected Result =  {}
    @Test
    public void testNechetnoeNumberOneCount_HappyPath(){
        //AAA
        //arrange
        int[] array = new int[]{-45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndicess().OddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    // Negative
    //    Input = {}
    //    Expected Result =  {}
    @Test
    public void testNechetnoeNumberNull_Negative(){
        //AAA
        //arrange
        int[] array = new int[]{};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndicess().OddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }




}
