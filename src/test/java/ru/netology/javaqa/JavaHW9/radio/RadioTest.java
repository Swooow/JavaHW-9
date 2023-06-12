package ru.netology.javaqa.JavaHW9.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();
        station.currentRadioStation = 106.6;

        double expected = 106.6;
        double actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 25;

        double expected = 25;
        double actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
