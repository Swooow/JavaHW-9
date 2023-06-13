package ru.netology.javaqa.JavaHW9.radio;

public class Radio {

    public int currentRadioStation;         // от 0 до 9
    public int currentVolume;               // от 0 до 100

    /*========================================РАДИОСТАНЦИЯ========================================*/

    public void setMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setMaxRadioStation() {
        currentRadioStation = 9;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
        } else setMinRadioStation();
        if (currentRadioStation > 9) {
            setMinRadioStation();
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 9) {
            setMinRadioStation();
            return;
        }
        if (currentRadioStation >= 0) {
            currentRadioStation = currentRadioStation - 1;
        } else setMinRadioStation();
        if (currentRadioStation < 0) {
            setMaxRadioStation();
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    /*============================================ЗВУК============================================*/

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 0) {
            setMinVolume();
            return;
        }
        if (currentVolume <= 100) {
            currentVolume = currentVolume + 1;
        } else setMinVolume();
        if (currentVolume > 100) {
            setMaxVolume();
        }
    }

    public void reduceVolume() {
        if (currentVolume > 100) {
            setMinVolume();
            return;
        }
        if (currentVolume >= 0) {
            currentVolume = currentVolume - 1;
        } else setMinVolume();
        if (currentVolume < 0) {
            setMinVolume();
        }
    }
}