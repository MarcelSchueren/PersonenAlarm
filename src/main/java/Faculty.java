public class Faculty {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(generateFaculty(number));
    }

    //generate faculty via for-loop

    public static int generateFaculty(int number) {
        if (number < 0) {
            System.out.println("Number has to be a positive Integer");
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    //generate faculty via while-loop

//    public static int generateFaculty(int number) {
//        int result = 1;
//        int counter = 1;
//        while (counter <= number) {
//            result *= counter;
//            counter++;
//        }
//        return result;
//    }

    //generate faculty via recursion

//    public static int generateFaculty(int number) {
//        if (number < 2) {
//            return 1;
//        }
//        return generateFaculty(number - 1) * number;
//    }
}
