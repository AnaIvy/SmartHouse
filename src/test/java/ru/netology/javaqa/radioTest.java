package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class radioTest {
    @Test
    public void shouldCreatRadio() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreatRadioVolume() {
        Radio radio = new Radio(100);

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreatRadioIfStationAboveMax() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfStatAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfStatBellowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfStatBellowMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.setNextStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfStatMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfStatBellowMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.setPrevStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfStatMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(111);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBellowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreasVolumeifVolumMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreasVolumeifVolumBellowMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreasVolumeIfVolumMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasVolumeIfVolumMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreasVolumeIfVolumBellowMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolumeIfVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreasVolumeIfVolumAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(120);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}