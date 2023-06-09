package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// 問1
		// バイト型
		byte byteNum;
		// 短整数型
		short shortNum;
		// 整数型
		int intNum; 
		// 長整数型
		long longNum; 
		// 単精度浮動小数点数型
		float floatNum; 
		// 倍精度浮動小数点数型
		double doubleNum; 
		// 文字型
		char charNum; 
		// 文字列型
		String StringNum; 
		// ブーリアン型
		boolean booleanNum;


		// 問2
		byteNum = 0;
		shortNum = 0;
		intNum = 0;
		longNum = 0L; 
		floatNum = 0.0f;
		doubleNum = 0.0d;
		charNum = '\u0000';
		StringNum = null; 
		booleanNum = false;


		// 問3
		// ・バイト型                 10
		byteNum = 10;
		// ・短整数型                 100
		shortNum = 100;
		// ・整数型                	 1000
		intNum = 1000;
		// ・長整数型                 10000
		longNum = 10000L;
		// ・単精度浮動小数点数型   	 9.5
		floatNum = 9.5f; // fがついてないとエラーが出る
		// ・倍精度浮動小数点数型		 10.5
		doubleNum = 10.5d;
		// ・文字型                   a
		charNum = 'a';
		// ・文字列型              	 ハロー
		StringNum = "ハロー";
		// ・ブーリアン型          	 true
		booleanNum = true;
		System.out.println();


		// 問4
		// 11110
		System.out.println(intNum + shortNum + byteNum + longNum);
		// 20.0
		System.out.println(floatNum + doubleNum);
		// a ハロー true
		System.out.println(charNum + " " + StringNum + " " + booleanNum);
		// 11130.0                    数字を全て足す
		System.out.println(intNum + shortNum + byteNum + floatNum + doubleNum);
		// 10000000000                小数点以外の数字を全てかける
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 0.105                      10.5割る100をする
		System.out.println(doubleNum / 100);
		// -90                        10引く100をする
		System.out.println(byteNum - shortNum);
		System.out.println();


		// 問5
		int num = 20; 
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		System.out.println();


		// 問6
		String StringName;
		// 名前
		StringName = "山田太郎";
		// メッセージ表示
		System.out.println("初めまして" + StringName + "です");

		int intAge;
		// 年齢
		intAge = 18;
		// メッセージ表示
		System.out.println("年齢は" + intAge + "歳です");

		double doubleHeight;
		// 身長
		doubleHeight = 170.5d;
		// メッセージ表示
		System.out.println("身長は" +  doubleHeight + "cmです");

		double doubleWeight;
		// 体重
		doubleWeight = 62.2d;
		// メッセージ表示
		System.out.println("体重は" + doubleWeight + "kgです");

		String StringFood;
		// 食べ物
		StringFood = "寿司";
		// メッセージ表示
		System.out.println("好きな食べ物は" + StringFood + "です");
		// 改行
		System.out.println();


		// 問7
		// BMI
		double bmi1 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
		// メッセージ表示
		System.out.println("BMIは" + String.format("%.1f", bmi1) + "です\n");
		System.out.println();


		// 問8
		// 名前
		StringName = "鈴木一郎";
		// メッセージ表示
		System.out.println("初めまして" + StringName + "です");

		// 年齢
		intNum = 24;
		// メッセージ表示
		System.out.println("年齢は" + intNum + "歳です");

		// 身長
		doubleHeight = 168.5d;
		// メッセージ表示
		System.out.println("身長は" +  doubleHeight + "cmです");

		// 体重
		doubleWeight = 64.2d;
		// メッセージ表示
		System.out.println("体重は" + doubleWeight + "kgです");

		// 食べ物
		StringFood = "オムライス";
		// メッセージ表示
		System.out.println("好きな食べ物は" + StringFood + "です");

		// BMI
		double bmi2 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
		// メッセージ表示
		System.out.println(String.format("BMIは%.1fです", bmi2));
		// 改行
		System.out.println();


		// 問9
		// 上書き
		StringName = "鈴木一郎";
		// メッセージ表示
		System.out.println("初めまして" + StringName + "です");

		intNum += 24;
		// メッセージ表示
		System.out.println("年齢は" + intNum + "歳です");

		doubleHeight += 168.5d;
		// メッセージ表示
		System.out.println("身長は" +  doubleHeight + "cmです");

		doubleWeight += 64.2d;
		// メッセージ表示
		System.out.println("体重は" + doubleWeight + "kgです");

		StringFood = "オムライス";
		// メッセージ表示
		System.out.println("好きな食べ物は" + StringFood + "です");

		// BMI
		double bmi3 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
		// メッセージ表示
		System.out.println(String.format("BMIは%.2fです", bmi3));
		System.out.println();


		// 問10
		// 上書き
		intNum = 24;
		// 条件
		String age = (intNum <= 25) ? "true" : "false";
		// メッセージ表示
		System.out.println(age);


		// 問11
		//型変換
		String stringNum = Integer.valueOf(intNum).toString();

		doubleHeight = 168.5d;
		//型変換
		String stringHeight = Double.valueOf(doubleHeight).toString();

		doubleWeight = 64.2d;
		//型変換
		String stringWeight = Double.valueOf(doubleWeight).toString();
		// メッセージ表示
		System.out.println(stringNum + stringHeight + stringWeight);


		// 問12
		//型変換
		int integralValue = Integer.parseInt(stringNum);
		// メッセージ表示
		System.out.println(integralValue);

		//型変換
		double doubleValue2 = Double.parseDouble(stringHeight);
		int intValue2 = (int) doubleValue2;
		// メッセージ表示
		System.out.println(intValue2);


		// 問13
		// 条件
		String ageHeight = (integralValue <= 25 || intValue2 <= 160) ? "true" : "false";
		// メッセージ表示
		System.out.println(ageHeight);
	}
}