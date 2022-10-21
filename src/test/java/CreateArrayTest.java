import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CreateArrayTest {

    // 1 Task
    @Test
    public void testCreateArrayPosit_HappyPath(){
        //Arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedRezult = {1, 2, 3, 4, 5};

        //Act
        int[] actualRezult = new CreateArray().createIntArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCreateArrayNegat_HappyPath(){
        //Arrange
        int a = -1;
        int b = -2;
        int c = -3;
        int d = 4;
        int e = -5;
        int[] expectedRezult = {-1, -2, -3, 4, -5};

        //Act
        int[] actualRezult = new CreateArray().createIntArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCreateArrayNull_HappyPath(){
        //Arrange
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int[] expectedRezult = {0, 0, 0, 0, 0};

        //Act
        int[] actualRezult = new CreateArray().createIntArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    // 2 Task
    @Test
    public void testCreateArrayDoublePosit_HappyPath(){
        //Arrange
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double[] expectedRezult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //Act
        double[] actualRezult = new CreateArray().createDoubleArray(a,b,c,d,e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCreateArrayDoubleNegativ_HappyPath(){
        //Arrange
        double a = -1.1;
        double b = 2.5;
        double c = -3.7;
        double d = -4.0;
        double e = -5.5;
        double[] expectedRezult = {-1.1, 2.5, -3.7, -4.0, -5.5};

        //Act
        double[] actualRezult = new CreateArray().createDoubleArray(a,b,c,d,e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCreateArrayDoubleNull_HappyPath(){
        //Arrange
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double[] expectedRezult = {0, 0, 0, 0, 0};

        //Act
        double[] actualRezult = new CreateArray().createDoubleArray(a,b,c,d,e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    // 3 Task
    @Test
    public void testCreateArrayStringPosit_HappyPath(){
        //Arrange
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedRezult = {"It", "was", "an", "apple", "pie"};

        //Act
        String[] actualRezult = new CreateArray().createStringArray(a,b,c,d,e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }

    @Test
    public void testCreateArrayStringNull_HappyPath(){
        //Arrange
        String a = null;
        String b = "";
        String c = null;
        String d = "";
        String e = "";
        String[] expectedRezult = {null, "", null, "", ""};

        //Act
        String[] actualRezult = new CreateArray().createStringArray(a,b,c,d,e);

        //Assert
        Assert.assertEquals(actualRezult, expectedRezult);
    }


}
