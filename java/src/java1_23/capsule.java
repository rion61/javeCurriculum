package java1_23;

public class capsule {
	//		下記がコンソールに出力されるように作成してください
	//	 	※thisとsetterとgetterとフィールドを使ってください
	//	 	
	//	  	動物名：ライオン
	//		体長：2.1m
	//		速度：80km/h
	private String animal;
	private double height;
	private int velocity;
	/**
	 * @return animal
	 */
	public String getAnimal() {
		return animal;
	}
	/**
	 * @param animal セットする animal
	 */
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	/**
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height セットする height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return velocity
	 */
	public int getVelocity() {
		return velocity;
	}
	/**
	 * @param velocity セットする velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

//	public capsule(String name, double money, int velocity) {
//		this.animal = "ライオン";
//		this.height = 2.1;
//		this.velocity = 80;
//	}


}
