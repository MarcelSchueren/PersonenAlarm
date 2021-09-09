import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void giveAlertTestOnePersonRed() {
        //GIVE
        int a = 1;
        String alarmLevel = "rot";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void giveAlertTestOnePersonYellow() {
        //GIVE
        int a = 1;
        String alarmLevel = "gelb";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void giveAlertTestOnePersonGreen() {
        //GIVE
        int a = 1;
        String alarmLevel = "grün";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }


    @Test
    public void giveAlertTestThirtyOnePersonsRed() {
        //GIVE
        int a = 31;
        String alarmLevel = "rot";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void giveAlertTestThirtyOnePersonsYellow() {
        //GIVE
        int a = 31;
        String alarmLevel = "gelb";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void giveAlertTestThirtyOnePersonsGreen() {
        //GIVE
        int a = 31;
        String alarmLevel = "grün";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void giveAlertTestSixtyOnePersonsRed() {
        //GIVE
        int a = 61;
        String alarmLevel = "rot";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void giveAlertTestSixtyOnePersonsYellow() {
        //GIVE
        int a = 61;
        String alarmLevel = "gelb";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void giveAlertTestSixtyOnePersonsGreen() {
        //GIVE
        int a = 61;
        String alarmLevel = "grün";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void giveAlertTestZeroPersonsRed() {
        //GIVE
        int a = 0;
        String alarmLevel = "rot";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl erreicht", result);
    }

    @Test
    public void giveAlertThirtyPersonsYellow() {
        //GIVE
        int a = 30;
        String alarmLevel = "gelb";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl erreicht", result);
    }

    @Test
    public void giveAlertTestSixtyPersonsGreen() {
        //GIVE
        int a = 60;
        String alarmLevel = "grün";

        //WHEN
        String result = Alarm.giveAlert(a, alarmLevel);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl erreicht", result);
    }

}