public class Alarm {
    public static void main(String[] args) {
        int personen = 40;
        System.out.println(giveAlert(personen));
    }

    public static String giveAlert(int personen) {
        if (personen > 30) {
            return "Zu viele Personen";
        } else if (personen == 30) {
            return "Genau 30 Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
