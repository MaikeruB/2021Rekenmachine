import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDivide {
    @Test
    public void TestDivision() {
        // arrange
        int expectedResult = 5;
        JavaFXApp app = new JavaFXApp();

        // act
        int actualResult = app.computeDivide(25, 5);    

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
