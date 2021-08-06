package AbstractStudy;
interface PhoneInterface{
	public static final int TIMEOUT = 10000;
	void sendCall(); // 추상 메소드지만 public abstract 생략가능
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
	
}

class SamsungPhone implements PhoneInterface{ 

	@Override
	public void sendCall() { //추상 메소드 구현
		System.out.println("띠리리리리리리링");
	}

	@Override
	public void receiveCall() {//추상 메소드 구현
		System.out.println("전화가 왔습니다.");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}
public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
