package java1_7;

public class DateTypeChange {
	public static void main(String[] args) {
		
//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
		int i = 3;
//		②double型変数 d に i を代入する。
		double d = i;
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		System.out.println(d);
//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。。
		double pi = 3.14;
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		System.out.println(pi * 3);
		
//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		//　integerを宣言
		int integer;
		
		// (int)pi => double型からpiをint型にする方法
		// piを型変換することによってintegerに代入できた
		integer = (int)pi;
		// integerを出力
		System.out.println(integer);
		
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
//		　double型の変数をコンソールに出力して下さい。
		
		// double型の変数aを定義し、「2 + 6.0」を代入
		// double doubleNumを定義して2 + 6.0を代入
		double a = 2 + 6.0;
		// doubleNumwoを出力
		System.out.println(a);
		
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
//		　int型の変数をコンソールに出力して下さい。
		// intNumを宣言
		int intNum;
		// (int)a => double型からaをintにする方法
		intNum = (int)a;
		// intNumを出力
		System.out.println(intNum);
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
//		　String型の変数をコンソールに出力して下さい。
		// stringNumを宣言
		String stringNum;
		// int型をString型に変える方法
		stringNum = String.valueOf(intNum);
		// stringNumを出力
		System.out.println(stringNum);
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//		　int型の変数をコンソールに出力して下さい。
		// String型をint型に変換してintNumに代入
		intNum = Integer.parseInt(stringNum);
		// intNumを宣言
		System.out.println(intNum);
	}
}
