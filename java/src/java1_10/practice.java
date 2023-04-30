/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
 */
package java1_10;

public class practice {

	public static void main(String[] args) {
		// int i に1を代入
		int i = 1;
		// i <= 10; 10回繰り返す条件式
		//  i = i + 2 => 出力されたiに２を足していく(2回目以降)
		for(i += 2; i < 10;  i = i + 2) {
			// iを出力
			System.out.println(i);
		}
	}

}