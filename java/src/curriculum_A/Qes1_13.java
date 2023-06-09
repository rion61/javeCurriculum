package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// 1
		byte byteNum; // バイト型
		short shortNum; // 短整数型
		int intNum; // 整数型
		long longNum; // 長整数型
		float floatNum; // 単精度浮動小数点数型
		double doubleNum; // 倍精度浮動小数点数型
		char charNum; // 文字型
		String StringNum; // 文字列型
		boolean booleanNum; // ブーリアン型
		
		
		// 2
		byteNum = 0;
		shortNum = 0;
		intNum = 0;
		longNum = 0L; // Lは大文字で書いた方が良い
		floatNum = 0.0f;
		doubleNum = 0.0d;
		charNum = '\u0000';
		StringNum = null; // 文字列
		booleanNum = false;
		

		// 3
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
		
		// 4
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
		// 5
		int num = 20; 
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		System.out.println();
		// 6
		String StringName;
		StringName = "山田太郎";
		System.out.println("初めまして" + StringName + "です");

		int intAge;
		intAge = 18;
		System.out.println("年齢は" + intAge + "歳です");

		double doubleHeight;
		doubleHeight = 170.5d;
		System.out.println("身長は" +  doubleHeight + "cmです");

		double doubleWeight;
		doubleWeight = 62.2d;
		System.out.println("体重は" + doubleWeight + "kgです");

		String StringFood;
		StringFood = "寿司";
		System.out.println("好きな食べ物は" + StringFood + "です");
		System.out.println();
		
		// 7
		double bmi1 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
		System.out.println("BMIは" + String.format("%.1f", bmi1) + "です\n");
		System.out.println();

		// 8
		StringName = "鈴木一郎";
		System.out.println("初めまして" + StringName + "です");

		intNum = 24;
		System.out.println("年齢は" + intNum + "歳です");

		doubleHeight = 168.5d;
		System.out.println("身長は" +  doubleHeight + "cmです");

		doubleWeight = 64.2d;
		System.out.println("体重は" + doubleWeight + "kgです");

		StringFood = "オムライス";
		System.out.println("好きな食べ物は" + StringFood + "です");

		double bmi2 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
		System.out.println(String.format("BMIは%.1fです", bmi2));
		System.out.println();
		
		// 9
		StringName = "鈴木一郎";
		System.out.println("初めまして" + StringName + "です");

		intNum += 24;
		System.out.println("年齢は" + intNum + "歳です");

		doubleHeight += 168.5d;
		System.out.println("身長は" +  doubleHeight + "cmです");

		doubleWeight += 64.2d;
		System.out.println("体重は" + doubleWeight + "kgです");

		StringFood = "オムライス";
		System.out.println("好きな食べ物は" + StringFood + "です");

		double bmi3 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
		System.out.println(String.format("BMIは%.2fです", bmi3));
		System.out.println();
		
		// 10
		intNum = 24;
		String age = (intNum <= 25) ? "true" : "false";
		System.out.println(age);
		
		// 11
		String stringNum = Integer.valueOf(intNum).toString();
		
		doubleHeight = 168.5d;
		String stringHeight = Double.valueOf(doubleHeight).toString();
		
		doubleWeight = 64.2d;
		String stringWeight = Double.valueOf(doubleWeight).toString();
		
		System.out.println(stringNum + stringHeight + stringWeight);
		
		// 12
		int integralValue = Integer.parseInt(stringNum);
		System.out.println(integralValue);
		
		double doubleValue2 = Double.parseDouble(stringHeight);
		int intValue2 = (int) doubleValue2;
		System.out.println(intValue2);
		
		// 13
		String ageHeight = (integralValue <= 25 || intValue2 <= 160) ? "true" : "false";
		System.out.println(ageHeight);
	}
}