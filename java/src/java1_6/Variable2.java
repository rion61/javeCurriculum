package java1_6;
//Randomクラスのimport
import java.util.Random;
public class Variable2 {
	public static void main(String[] args) {
//		問１）
//		変数 x を宣言し、「3」を代入して下さい。
//		変数 x に自己代入を使って「20」を掛け算して下さい。
//		その後 x の値をコンソールに表示して下さい。
		
//		int型 変数 x を宣言し、「3」を代入
		int x = 3;
//		変数 x に自己代入を使って「20」を掛け算し出力
		System.out.println(x *= 20);
		
//		問２）
//		以下のプログラムを作成してください。
//		①int 型の変数 i に 100 を代入する。
		int i = 100;
//		②インクリメント演算子を適用して数値を 1 増やす。
		i++;
//		③コンソールに変数 i の値を表示する。
		System.out.println(i);
//		④デクリメント演算子を適用して数値を 1 減らす。
		i--;
//		⑤コンソールに変数 i の値を表示する。
		System.out.println(i);

//		問３）
//		下記の例のような文章をコンソールに出力して下さい。
//		但し、年齢の部分は乱数を使用し実行毎に結果が変わるようにして下さい。
//		※数字は0～100までの間で表示されるようにしてください。
		
//		Random rnd を宣言しRandomクラスのインスタンスを初期化
		Random rnd = new Random();
		System.out.println("あなたの年齢はおそらく" + rnd.nextInt(101) + "歳ですね？");
//		例）
//		あなたの年齢を予想します。
//		あなたの年齢はおそらく〇〇歳ですね？

	}
}

