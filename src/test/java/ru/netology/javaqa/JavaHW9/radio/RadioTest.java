package ru.netology.javaqa.JavaHW9.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    /*========================================РАДИОСТАНЦИЯ========================================*/
    /*-------------------------------------------СЕТТЕР-------------------------------------------*/

    @Test // тест сеттера с параметром >9 (значения до 0 и после 9 не принимаются, оставляем 0)
    public void shouldNotSetRadioStationOver9() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест сеттера с параметром <0 (значения до 0 и после 9 не принимаются, оставляем 0)
    public void shouldNotSetRadioStationLessThan0() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // тест сеттера с параметром 5
    public void shouldSetRadioStation5() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    /*--------------------------------------------------------------------------------------------*/

    @Test // станция = -1 [+1] (значение <0 триггерит setMinRadioStation = 0)
    public void shouldNotSetRadioStationMinus1Next() {
        Radio station = new Radio();
        station.currentRadioStation = -1;
        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = -1 [-1] (значение <0 триггерит setMinRadioStation = 0)
    public void shouldNotSetRadioStationMinus2() {
        Radio station = new Radio();
        station.currentRadioStation = -1;
        station.prevRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 0 [+1]
    public void shouldSetRadioStation1() {
        Radio station = new Radio();
        station.currentRadioStation = 0;
        station.nextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 0 [-1] (значение <0 триггерит setMaxRadioStation = 9)
    public void shouldNotSetRadioStationMinus1() {
        Radio station = new Radio();
        station.currentRadioStation = 0;
        station.prevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 1 [+1]
    public void shouldSetRadioStation2() {
        Radio station = new Radio();
        station.currentRadioStation = 1;
        station.nextRadioStation();

        int expected = 2;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 1 [-1]
    public void shouldSetRadioStation0() {
        Radio station = new Radio();
        station.currentRadioStation = 1;
        station.prevRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 8 [+1]
    public void shouldSetRadioStation9() {
        Radio station = new Radio();
        station.currentRadioStation = 8;
        station.nextRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 8 [-1]
    public void shouldSetRadioStation7() {
        Radio station = new Radio();
        station.currentRadioStation = 8;
        station.prevRadioStation();

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 9 [+1] (значение >9 триггерит setMinRadioStation = 0)
    public void shouldNotSetRadioStation10() {
        Radio station = new Radio();
        station.currentRadioStation = 9;
        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 9 [-1]
    public void shouldSetRadioStation8() {
        Radio station = new Radio();
        station.currentRadioStation = 9;
        station.prevRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 10 [+1] (значение >9 триггерит setMinRadioStation = 0)
    public void shouldNotSetRadioStation10Plus1() {
        Radio station = new Radio();
        station.currentRadioStation = 10;
        station.nextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // станция = 10 [-1]
    public void shouldNotSetRadioStation9() {
        Radio station = new Radio();
        station.currentRadioStation = 10;
        station.prevRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    /*============================================ЗВУК============================================*/

    @Test // звук = -1 [+1] (значение <0 триггерит setMinVolume = 0)
    public void shouldNotSetMinVolume0() {
        Radio volume = new Radio();
        volume.currentVolume = -1;
        volume.increaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = -1 [-1] (значение <0 триггерит setMinVolume = 0)
    public void shouldNotSetVolumeMinus2() {
        Radio volume = new Radio();
        volume.currentVolume = -1;
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 0 [+1]
    public void shouldSetVolume1() {
        Radio volume = new Radio();
        volume.currentVolume = 0;
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 0 [-1] (значение <0 триггерит setMinVolume = 0)
    public void shouldNotSetVolumeMinus1() {
        Radio volume = new Radio();
        volume.currentVolume = 0;
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 1 [+1]
    public void shouldSetVolume2() {
        Radio volume = new Radio();
        volume.currentVolume = 1;
        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 1 [-1]
    public void shouldSetVolume0() {
        Radio volume = new Radio();
        volume.currentVolume = 1;
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 99 [+1]
    public void shouldSetVolume100() {
        Radio volume = new Radio();
        volume.currentVolume = 99;
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 99 [-1]
    public void shouldSetVolume98() {
        Radio volume = new Radio();
        volume.currentVolume = 99;
        volume.reduceVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 100 [+1] (значение >100 триггерит setMaxVolume = 100)
    public void shouldNotSetVolume101() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 100 [-1]
    public void shouldSetVolume99() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.reduceVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 101 [+1] (значение >100 триггерит setMinVolume = 0)
    public void shouldNotSetVolume102() {
        Radio volume = new Radio();
        volume.currentVolume = 101;
        volume.increaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // звук = 101 [-1] (значение >100 триггерит setMinVolume = 0)
    public void shouldNotSetVolume100() {
        Radio volume = new Radio();
        volume.currentVolume = 101;
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
