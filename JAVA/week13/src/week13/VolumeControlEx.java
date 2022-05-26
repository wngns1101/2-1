package week13;

public class VolumeControlEx {
	public static void main(String[] args) {
		Volume vol = new Volume() {
			
			@Override
			public void volumeUp(int level) {
				System.out.println("익명 객체 볼륨을 올립니다: " + level);
				
			}
			
			@Override
			public void volumeDown(int level) {
				System.out.println("익명 객체 볼륨을 내립니다:" + level);
				
			}
		};
		
		vol.volumeUp(3);
		vol.volumeDown(2);
	}
}
