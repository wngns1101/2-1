package week13;

public class VolumeEx {
	public static void main(String[] args) {
		Radio radio = new Radio();
		TV tv = new TV();
		
		radio.volumeUp(3);
		radio.volumeDown(5);
		tv.volumeUp(6);
		tv.volumeDown(4);
		System.out.println("-----------------------");
		
		Volume[] vol = new Volume[3];
		vol[0] = radio;
		vol[1] = tv;
		vol[2] = new Speaker();
		
		for (int i = 0; i<3; i++) {
			vol[i].volumeUp(3);
			vol[i].setMute(true);
		}
	}
}
