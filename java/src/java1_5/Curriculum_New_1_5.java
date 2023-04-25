package java1_5;

public class Curriculum_New_1_5 {

    public static void main(String[] args) {
    	
        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  ローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』

        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載
    	 String StringName;
    	 StringName = "山田太郎";
    	 System.out.println("初めまして" + StringName + "です");
    	 
    	 int intNum;
    	 intNum = 18;
    	 System.out.println("年齢は" + intNum + "歳です");
    	 
    	 double doubleHeight;
    	 doubleHeight = 170.5d;
    	 System.out.println("身長は" +  doubleHeight + "cmです");
    	 
    	 double doubleWeight;
    	 doubleWeight = 62.2d;
    	 System.out.println("体重は" + doubleWeight + "kgです");
    	 
    	 String StringFood;
    	 StringFood = "寿司";
    	 System.out.println("好きな食べ物は" + StringFood + "です");
        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること
    	//BMI 体重[kg]÷身長[m]÷身長[m]
    	/**
    	     *  「BMIの計算」
    	     *  BMI = 体重(Kg) × (身長(m))2
    	*/
    	// Math.pow Mathクラスのpowメソッドは累乗(べき乗)の計算 
    	// 累乗(べき乗)の結果 = Math.pow(　基数, 指数);
        // Q2を下記に記載
    	 double bmi1 = doubleWeight / ((doubleHeight / 100) * (doubleHeight / 100));
    	 System.out.println("BMIは" + String.format("%.1f", bmi1) + "です\n");
    	 
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です
    	
        // Q3を下記に記載
    	 
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
    	 
    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
    	 
     }

}

