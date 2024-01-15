package BridgeDesingPattern2;

import BridgeDesingPattern2.Devices.Device;
import BridgeDesingPattern2.Devices.Radio;
import BridgeDesingPattern2.Devices.TV;
import BridgeDesingPattern2.Remotes.AdvanceRemoteControl;
import BridgeDesingPattern2.Remotes.BasicRemote;

public class Client {
	public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvanceRemoteControl advancedRemote = new AdvanceRemoteControl(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
