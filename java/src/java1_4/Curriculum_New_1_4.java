package java1_4;

public class Curriculum_New_1_4 {

     public static void main(String[] args) {
    	 
	     // Q1 下記9個をローカル変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
	     //   	・文字型・文字列型
	     //	 	・ブーリアン型 
    	 byte byteNum; // バイト型
    	 short shortNum; // 短整数型
    	 int intNum; // 整数型
    	 long longNum; // 長整数型
    	 float floatNum; // 単精度浮動小数点数型
    	 double doubleNum; // 倍精度浮動小数点数型
    	 char charNum; // 文字型
    	 String StringNum; // 文字列型
    	 boolean booleanNum; // ブーリアン型
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
    	 byteNum = 0;
    	 shortNum = 0;
    	 intNum = 0;
    	 longNum = 0L; // Lは大文字で書いた方が良い
    	 floatNum = 0.0f;
    	 doubleNum = 0.0d;
    	 charNum = '\u0000';
    	 StringNum = null; // 文字列
    	 booleanNum = false;
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	
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
	    	 
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
    	 System.out.println(intNum + shortNum + byteNum);
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
    	 
    	// Q5 
    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
 		int num = 20;
 		int num1 = 23;
 		System.out.println("ハローJAVA" + (num + num1));
 		 
     }

}