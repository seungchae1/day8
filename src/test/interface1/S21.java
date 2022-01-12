package test.interface1;

public class S21 implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber+ "�� ��ȭ�� �Ǵ�.");
	}

	@Override
	public void receiveCall(String phoneNumber) {
		System.out.println(phoneNumber+ "�� �ɷ��� ��ȭ�� �޴´�.");
	}

	@Override
	public void sendSMS(String phonNumber) {
		System.out.println(phonNumber+ "�� ���ڸ� ������.");

	}

	@Override
	public void receiveSMS(String phonNumber) {
		System.out.println(phonNumber+ "�� �� ���ڸ� �޴´�.");

	}

	@Override
	public String searchMusic(String word) {
		System.out.println("������ �˻��Ѵ�.");
		return word + "_music.mp3";
	}

	@Override
	public void playMusic(String music) {
		System.out.println(music+ "������ ����ȴ�.");
	}

	@Override
	public void stopMusic() {
		System.out.println("������� ������ �����Ѵ�.");
	}

	@Override
	public void installApp(String appName) {
		System.out.println(appName + "���� �ν����Ѵ�.");
	}

	@Override
	public void runApp(String appName) {
		System.out.println(appName + "���� �����Ѵ�.");
	}

}
