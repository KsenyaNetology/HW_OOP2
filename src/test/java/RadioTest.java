import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.increaseVolume();

        int expected = 9;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldReductionVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.reductionVolume();

        int expected = 9;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }


    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        int expected = 100;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(999);

        rad.increaseVolume();

        int expected = 100;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int expected = 0;
        int actuale = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void shouldSetCurrentVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.reductionVolume();

        int expected = 0;
        int actuale = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }


    @Test
    public void shouldSetNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        rad.nextRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        rad.prevRadioStation();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetNextRadioStationMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}