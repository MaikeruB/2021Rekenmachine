import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFXAppTest {
    @Test
    public void TestDivision() {

        int expectedResult = 25;
        JavaFXApp app = new JavaFXApp();

        int actualResult = app.computeMultiply(5, 5);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}