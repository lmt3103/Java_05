import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testPositive_HappyPath() {
        //Arrange
        int number = 555;
        boolean expectedRezult = true;

        //Act
        boolean actualRezult = new IsPositiveNumber().IsPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testNegative_HappyPath() {
        //Arrange
        int number = -555;
        boolean expectedRezult = false;

        //Act
        boolean actualRezult = new IsPositiveNumber().IsPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testNull_HappyPath() {
        //Arrange
        int number = 0;
        boolean expectedRezult = true;

        //Act
        boolean actualRezult = new IsPositiveNumber().IsPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }


}
