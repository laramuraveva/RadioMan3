package ru.netology;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio () {

    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() { //увеличение звука
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() { //уменьшение звука
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void previousStation() { //переключение на предыдущую станцию
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextStation() { //переключение станции на следующую
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
}
