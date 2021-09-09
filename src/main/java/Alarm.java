public class Alarm {
    public static void main(String[] args) {
        int personen = 40;
        System.out.println(giveAlert(personen, "gelb"));
    }

    public static String giveAlert(int personen, String alarmLevel) {
        int maxPersonen;

        switch (alarmLevel) {
            case "rot":
                maxPersonen = 0;
                break;
            case "gelb":
                maxPersonen = 30;
                break;
            case "grün":
                maxPersonen = 60;
                break;
            default:
                maxPersonen = 0;
                System.out.println("Could not match alarmlevel");
                break;
        }

        if (personen > maxPersonen) {
            return "Zu viele Personen";
        } else if (personen == maxPersonen) {
            return "Maximale Personenzahl erreicht";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
