package com.company;

public class RemoteControl implements IRemoteControl {

    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void DecreaseVolume() {
        var volume = device.GetVolume() - 1;

        device.SetVolume(volume);
    }

    public void IncreaseVolume() {
        var volume = device.GetVolume() + 1;
        device.SetVolume(volume);
    }
}
