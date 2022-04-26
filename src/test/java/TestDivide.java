import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDivide {
    @Test
    public void TestDivision() {
        // arrange
        int expectedResult = 5;
       DivideComputation com = new DivideComputation();
        // act
        int actualResult = com.compute(25, 5);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
