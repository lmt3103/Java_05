import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

// 5 Task
    @Test
    public void testmultiplуArrayOnNumberPozit_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedRezult = {3, 6, 9, 12, 15};

        //Act
        int[] actualRezult = new ManipulationsWithArrays().ByNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    @Test
    public void testmultiplуArrayOnNumberNegativ_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 2, -3, 4, -5};
        int number = -3;
        int[] expectedRezult = {-3, -6, 9, -12, 15};

        //Act
        int[] actualRezult = new ManipulationsWithArrays().ByNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    @Test
    public void testmultiplуArrayOnNumberNullNum_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 2, 3, 4, 5};
        int number = 0;
        int[] expectedRezult = {0, 0, 0, 0, 0};

        //Act
        int[] actualRezult = new ManipulationsWithArrays().ByNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    @Test
    public void testmultiplуArrayOnNumberNullVArr_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 2, 0, 0, 5};
        int number = 2;
        int[] expectedRezult = {2, 4, 0, 0, 10};

        //Act
        int[] actualRezult = new ManipulationsWithArrays().ByNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }
// Task 6
    @Test
    public void testToDoubleArr_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 2, 3, 4, 5};
        double[] expectedRezult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //Act
        double[] actualRezult = new ManipulationsWithArrays().toDoubleArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    // Task 7
    @Test
    public void testToIntArr_HappyPath() {
        //Arrange
        double[] array = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedRezult = {1, 2, 3, 4, 5};

        //Act
        int[] actualRezult = new ManipulationsWithArrays().toIntArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    // Task 8
    @Test
    public void testToStringArr_HappyPath() {
        //Arrange
        int[] array = new int[]{1, 2, 3, 4, 5};
        String[] expectedRezult = {"1", "2", "3", "4", "5"};

        //Act
        String[] actualRezult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    // Task 9
    @Test
    public void testToStringFromDoubleArr_HappyPath() {
        //Arrange
        double[] array = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedRezult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        //Act
        String[] actualRezult = new ManipulationsWithArrays().toStringArrayFromDouble(array);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);

    }

    // Task 12
    @Test
    public void testValuesGreaterThanNumberAllPosit_Happypath() {
        //Arrange
        int[] array = new int[]{23, 45, 16, 2, 5};
        int number = 1;
        boolean expectedRezult = true;

        //Act
        boolean actualRezult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testValuesGreaterThanNumberAllNegativ_Happypath() {
        //Arrange
        int[] array = new int[]{23, 45, 16, 2, 5};
        int number = 50;
        boolean expectedRezult = false;

        //Act
        boolean actualRezult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }
    @Test
    public void testValuesGreaterThanNumberEquals_Happypath() {
        //Arrange
        int[] array = new int[]{23, 45, 16, 2, 5};
        int number = 45;
        boolean expectedRezult = false;

        //Act
        boolean actualRezult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

}
