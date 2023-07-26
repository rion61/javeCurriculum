package java1_31;

class Person{
	// インスタンスフィールドを定義
	public String sei;
	public String mei;
	public int age;
	public double height;
	public double weight;
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String sei, String mei, int age, double height, double weight){
		// 性
		this.sei = sei;
		// 名
		this.mei = mei;
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

	public  void print() {
		// メッセージ表示
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this. age+ "です");
		System.out.println("BMIは" + String.format("%.1f", bmi()) + "です");
		System.out.println("合計" + count + "人です");

	}

	public String fullName() {
		// フルネームを返す
		return this.sei + this.mei;
	}

	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}