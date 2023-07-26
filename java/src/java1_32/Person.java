package java1_32;

class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		// 名前
		this.name = name;
		// 年齢
		this.age = age;
		// 身長
		this.height = height;
		// 体重
		this.weight = weight;
		// 人数の合計
		count++;
	}

	public double bmi(){
		// bmi式
		double bmi = weight / (height * height);
		return bmi;
		
	}

	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		
	}
	
	 static void printCount(){
		System.out.println("合計" + count + "人です");
		
	}
}