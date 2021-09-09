import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacultyParamTest {
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
    })

    public void checkFaculty(int input, int expected) {
        //When
        int actual = Faculty.generateFaculty(input);
        //Then
        assertEquals(expected, actual);
    }
}
