public class Faculty {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(generateFaculty(number));
    }

    public static int generateFaculty(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
