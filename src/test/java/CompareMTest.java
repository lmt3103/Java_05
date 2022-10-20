import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareMTest {

    @Test
    public void testMultiple7and9_HappyPath() {
        //Arrange
        int m = 63;
        String expectedRezult = "Good Number";

        //Act
        String actualRezult = new CompareM().CompareM(m);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testMultiple9andNot7_HappyPath() {
        //Arrange
        int m = 27;
        String expectedRezult = "Bad Number";

        //Act
        String actualRezult = new CompareM().CompareM(m);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testMultiple11and9_HappyPath() {
        //Arrange
        int m = 99;
        String expectedRezult = "Bad Number";

        //Act
        String actualRezult = new CompareM().CompareM(m);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testMultiple11and7_HappyPath() {
        //Arrange
        int m = 77;
        String expectedRezult = "-1";

        //Act
        String actualRezult = new CompareM().CompareM(m);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testAnyNumber_HappyPath() {
        //Arrange
        int m = 157;
        String expectedRezult = "-1";

        //Act
        String actualRezult = new CompareM().CompareM(m);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }


}
