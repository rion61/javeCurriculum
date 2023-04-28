package java1_9;
import java.util.Random;
public class ConditionalExpression {
	public static void main(String[] args) {
//		問１）
//		boolean型変数 rain を宣言し、今日の天気が雨なら「true」雨でないなら「false」を代入して下さい。
//		もし rain が true ならコンソールに「DVDを見ます。」と false なら「外で遊びます。」と表示して下さい。
		// boolean型にrainを宣言
		boolean rain = false;
		// if()のなかに rain = true or false(条件式が代入されている)
		if (rain) {
		// true の時の出力	
			System.out.println("DVDを見ます。");
		}else {
		// falseの時の出力
			System.out.println("外で遊びます。");
		}
//		問２）
//		String型変数 name に任意の名前を入れて下さい。
		String name = "Mr.ビーン.jr";
//		int型変数 score に「0~100」までの乱数を代入して下さい。
		Random rnd = new Random();
		int score = rnd.nextInt(101) + 1;
//		もし score が 40点以下なら「〇〇さんは□□点です。もう少し頑張りましょう。」、
//		もし score が 40点以上、60点以下なら「〇〇さんは□□点です。もう少しでした。」、
//		もし score が 60点以上、80点以下なら「〇〇さんは□□点です。よくできました。」、
//		もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。
		if (score <= 40) {
			System.out.println(name + "さんは" + score + "点です。もう少し頑張りましょう。");
		}else if (score >= 40 && score <= 60) {
			System.out.println(name + "さんは" + score + "点です。もう少しでした。");
		}else if (score >= 60 && score <= 80) {
			System.out.println(name + "さんは" + score + "点です。よくできました。");
		}else if (score >= 80) {
			System.out.println(name + "さんは" + score + "点です。たいへんよくできました。");
		}
//		問３）
//		①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）
		int isTired = 1;
//		②変数 study を定義し、文字列 "カリキュラム" を代入する。
		String study = "カリキュラム";
//		③もし変数 isTired が 0 であれば「私はとても元気です。」、そうでなければ「私は疲れています。」と表示する。
		if(isTired == 1) {
			System.out.println("私はとても元気です。");
		}else {
			System.out.println("私は疲れています。");
		}
//		※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
//		④もし変数 isTired が 0 であれば、変数 study を利用して「カリキュラムを続けます。」と表示する。
		//三項演算子の書き方：
		//条件式 ? trueの場合の戻り値 : falseの場合の戻り値
		System.out.println(isTired == 0 ? "私はとても元気です。" : study + "を続けます。");
	}
}
