import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testcomputeAdd {

    @Test
    void testcomputeAdd(){
        //Arrange
        int expectedResult = 4;
       PlusComputation com = new PlusComputation();

        //Act
        int actualResult = com.compute(3,1);

        //Assert
        assertEquals(expectedResult,actualResult);

    }
}
