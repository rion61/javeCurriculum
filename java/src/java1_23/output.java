package java1_23;

public class output {

	public static void main(String[] args) {
		capsule cap = new capsule();
		cap.setAnimal("ライオン");
		cap.setHeight(2.1);
		cap.setVelocity(80);
		
		System.out.println("動物名 : " + cap.getAnimal());
		System.out.println("体長：" +  cap.getHeight() + "m");
		System.out.println("速度：" + cap.getVelocity() + "km/h");
	}
}