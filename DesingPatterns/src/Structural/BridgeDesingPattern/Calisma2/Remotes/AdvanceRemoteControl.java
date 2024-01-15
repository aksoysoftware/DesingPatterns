package BridgeDesingPattern2.Remotes;

import BridgeDesingPattern2.Devices.Device;

public class AdvanceRemoteControl extends BasicRemote {
	
	public AdvanceRemoteControl(Device device) {
		super.device=device;
	}
	
	public void mute() {
		System.out.println("Remote: Mute");
		device.setVolume(0);
	}

}
