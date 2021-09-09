import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FacultyTest {

    @Test
    public void facultyTest_0_expected1() {
        //GIVE
        int number = 0;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(1, result);
    }

    @Test
    public void facultyTest_1_expected1() {
        //GIVE
        int number = 1;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(1, result);
    }

    @Test
    public void facultyTest_2_expected2() {
        //GIVE
        int number = 2;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(2, result);
    }

    @Test
    public void facultyTest_3_expected6() {
        //GIVE
        int number = 3;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(6, result);
    }

    @Test
    public void facultyTest_4_expected24() {
        //GIVE
        int number = 4;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(24, result);
    }

    @Test
    public void facultyTest_5_expected24() {
        //GIVE
        int number = 5;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(120, result);
    }

    @Test
    public void facultyTest_10_expected3628800() {
        //GIVE
        int number = 10;

        //WHEN
        int result = Faculty.generateFaculty(number);

        //THEN
        Assertions.assertEquals(3628800, result);
    }

}