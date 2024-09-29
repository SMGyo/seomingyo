package chap06;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	int gas;
	//생성자
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	int getSpeed() {//speed값 리턴
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:"+ gas + ")");
				return;
			}
		}
	}
	
	void run2() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}

}//end class
