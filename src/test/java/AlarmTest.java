import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void giveAlertTestOnePerson() {
        //GIVE
        int a = 1;

        //WHEN
        String result = Alarm.giveAlert(a);

        //THEN
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void giveAlertTestThirtyPersons() {
        //GIVE
        int a = 30;

        //WHEN
        String result = Alarm.giveAlert(a);

        //THEN
        Assertions.assertEquals("Genau 30 Personen", result);
    }

    @Test
    public void giveAlertTestFiftyPersons() {
        //GIVE
        int a = 50;

        //WHEN
        String result = Alarm.giveAlert(a);

        //THEN
        Assertions.assertEquals("Zu viele Personen", result);
    }
}