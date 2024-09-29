package chap06;

public class CarMain {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		//필드값 변경
		myCar.speed = 60;
		myCar.color = "흰색";
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println("수정된 색깔: " + myCar.color);
		
		//교재p279
		
		myCar.setGas(5);//Car에 있는 setGas 호출
		
		boolean gasState = myCar.isLeftGas();//Car에 있는 isLeftGas호출
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();//Car에 있는 run 호출
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas 주입할 필요 없음");
		}else {
			System.out.println("gas 주입하세요");
		}
		System.out.println("----------교재284p----------");
		myCar.keyTurnOn();
		myCar.run2();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
