package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() { //увеличение звука
        if (currentVolume < 10) {
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
            currentStation = 9;
        }
    }

    public void nextStation() { //переключение станции на следующую
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
}
