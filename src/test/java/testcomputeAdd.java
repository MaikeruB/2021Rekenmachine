import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testcomputeAdd {

    @Test
    void testcomputeAdd(){
        //Arrange
        int expectedResult = 4;
        JavaFXApp App = new JavaFXApp();

        //Act
        int actualResult = App.computeAdd(3,1);

        //Assert
        assertEquals(expectedResult,actualResult);

    }
}
