package com.lesson.command;

/*
-> Akıllı bir evdeki çeşitli elektronik cihazlar için uzaktan kumanda sistemi tasarlamada görevlendirildiniz

Cihazlar; TV, stereo ve potansiyel farklı cihazlar
Amaç; her cihaz için cihazları açma/kapama ayarları yapma,
kanalları değiştirme veya daha farklı komutları işleyebilen esnek bir uzaktan kumanda oluşturmaktır.

önce ilgili nesneleri sonra ilgili nesnelerin komutlarını en son da uzaktan kumandaya ekliyoruz.
 */
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        Command adjustVolumeCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelCommand = new ChangeClassCommand(tv);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();

        // Change channel
        // Turn off TV
    }
}
