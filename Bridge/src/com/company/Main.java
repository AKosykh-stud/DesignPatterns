package com.company;

public class Main {

    public static void main(String[] args) {

        var tv = new TV();

        var remoteControl = new RemoteControl(tv);

        for (int i = 0; i < 5; i++) {
            remoteControl.IncreaseVolume();
        }

        System.out.println("Volume: " + tv.GetVolume());

        for (int i = 0; i < 2; i++) {
            remoteControl.DecreaseVolume();
        }

        System.out.println("Volume: " + tv.GetVolume());
    }
}
