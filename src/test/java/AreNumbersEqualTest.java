import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void testOneGreaterTwo_HappyPath() {
        //Arrange
        int a = 89;
        int b = -89;
        int expectedRuzult = 1;

        //act
        int actualRezult = new AreNumbersEqual().AreNumbersEqual(a, b);

        //Assert
        Assert.assertEquals(actualRezult, expectedRuzult);
    }

    @Test
    public void testOneLessTwo_HappyPath() {
        //Arrange
        int a = -89;
        int b = 89;
        int expectedRuzult = -1;

        //act
        int actualRezult = new AreNumbersEqual().AreNumbersEqual(a, b);

        //Assert
        Assert.assertEquals(actualRezult, expectedRuzult);
    }

    @Test
    public void testEquals_HappyPath() {
        //Arrange
        int a = 89;
        int b = 89;
        int expectedRuzult = 0;

        //act
        int actualRezult = new AreNumbersEqual().AreNumbersEqual(a, b);

        //Assert
        Assert.assertEquals(actualRezult, expectedRuzult);
    }

}
