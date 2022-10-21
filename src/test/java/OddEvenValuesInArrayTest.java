import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    // Task 10
    @Test
    public void testCountEvenValuesInArrayCount_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 6, 9, 6, 3, 5, 10};
        int expectedRezult = 3;

        //Act
        int actualRezult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCountEvenValuesInArrayCountOnlyOdd_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 5, 7, 3, 3, 5, 11};
        int expectedRezult = 0;

        //Act
        int actualRezult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCountEvenValuesInArrayNull_HappyPath() {
        //Arrange
        int[] array = new int[]{0, 0, 7, 0, 3, 5, 11};
        int expectedRezult = 3;

        //Act
        int actualRezult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }


    // Task 11
    @Test
    public void testCountOddValuesInArrayCount_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 6, 9, 6, 3, 5, 10};
        int expectedRezult = 4;

        //Act
        int actualRezult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCountOddValuesInArrayCountOnlyEv_HappyPath() {
        //Arrange
        int[] array = new int[]{2, 4, 6, 4, 4, 6, 10};
        int expectedRezult = 0;

        //Act
        int actualRezult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }



}
