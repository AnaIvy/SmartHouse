package ru.netology.javaqa;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume >= 10) {
            currentVolume = 10;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStation() {
        if (currentStation != 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume - 1;
        }
    }
}

