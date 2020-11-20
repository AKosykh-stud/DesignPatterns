package com.company;

public class TV extends Device {

    private int _volume;

    @Override
    int GetVolume() {
        return _volume;
    }

    void SetVolume(int volume) {
        _volume = volume;
    }
}
