import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ArrayLoopTest {
    @ParameterizedTest
    @CsvSource({
            "0, 'Student 0'",
            "1, 'Student 1'",
            "99, 'Student 99'",
    })

    public void checkArrayLoop(int position, String expected) {
        //When
        String actual = ArrayLoop.getElementOutOfArray(position);
        //Then
        assertEquals(expected, actual);
    }
}