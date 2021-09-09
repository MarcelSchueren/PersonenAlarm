public class ArrayLoop {

    public static String getElementOutOfArray(int position) {
        String[] stringArray = new String[100];

        for (int i = 0; i < 100; i++) {
            stringArray[i] = "Student " + i;
        }
        return stringArray[position];
    }
}

