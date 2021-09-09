import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayLoopTest {

    @Test
    void testGenerateStudentNames(){
        //GIVEN
        int numberOfStudents = 3;
        String [] expected = {"Student 1", "Student 2", "Student 3"};

        //WHEN
        String[] actual = ArrayLoop.generateStudentNames(numberOfStudents);

        //THEN
        assertArrayEquals(expected, actual);
    }
}