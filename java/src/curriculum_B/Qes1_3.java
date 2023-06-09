package curriculum_B;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Qes1_3 {
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner name = new Scanner(System.in);

		// 名前を取得
		String line1 = name.nextLine();
		name.close();

		Object nonVal = null;
		// 半角英数字の正規表現を代入
		String regex_AlphaNum = "^[A-Za-z0-9]+$";
		// 正規表現パターンの読み込み
		Pattern p1 = Pattern.compile(regex_AlphaNum);
		// パターンと検査対象文字列の照合
		Matcher m1 = p1.matcher(line1); 

		// line1.length(レングス)配列の長さを取得する
		// line1が10より大きい時
		if (line1.length() > 10) {
			// 10文字より大きい時の出力
			System.out.println("名前を10文字以内にしてください");
			// line1.length(レングス)配列の長さを取得する
			// nullの時はnull判定を指定する 
		}else if (!m1.matches()) { // 照合結果を取得
			System.out.println("半角英数字のみで名前を入力してください");
		}else if (line1.length()  <= 0 && Objects.isNull(nonVal)){
			// nullと0の時の出力	
			System.out.println("名前を入力してください");
		}else {
			// 正常だった時の出力
			System.out.println("ユーザー名" + line1 + "を登録しました\n");
		}

		// 配列を宣言
		String str[] = {"グー","チョキ","パー"};

		// ランダム変数を生成
		Random rum = new Random();

		// 自身の手
		int myHand = 0;
		// 相手の手
		int enemyHand = 0;
		// 勝つまでの回数
		int count = 0;
		// 勝利フラグ
		boolean flag = true;

		// do whileをしよう 
		do {
			// 変数にランダムの0から２を代入
			enemyHand = rum.nextInt(3);
			// str[0]="グー"出力
			System.out.println(line1 + "の手は：" + str[0]);
			// str[enemyHand] = "グー","チョキ","パー" どれかが出力
			System.out.println("相手の手は：" + str[enemyHand] + "\n");

			// String型などの参照型の場合はequalsメソッドで比較
			// str[0]"グー"とenemyHandの"グー"
			if(str[0].equals(str[enemyHand])) {
				// あいこの時の出力
				System.out.println("DRAW あいこ もう一回しましょう");

				// else if 負けた時の処理
				// ("グー"または"パー")かつ("チョキ"または"グー")かつ("パーまたはチョキ")
			}else if((myHand == 0 && enemyHand == 2) || (myHand == 1 && enemyHand == 0) || (myHand == 2 && enemyHand == 1)){

				// 変数に0,1,2のランダムな数字が入る
				switch(enemyHand){

				// case 0 と変数に0代入された
				// 自分がグーに負けた時の出力
				case 0:
					System.out.println("俺の勝ち!\n負けは次につながるチャンスです！\nネバーギブアップ!");
					break;

					// case 1 と変数1が代入された時
					// 自分がチョキに負けた時の出力
				case 1:
					System.out.println("俺の勝ち!\nたかがじゃんけんって、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					break;

					// case 2 と変数2が代入された時
					// 自分がパーに負けた時の出力	
				case 2:
					System.out.println("俺の勝ち!\nなんで負けたか、明日まで考えといてください\nそしたら何かが見えてくるはずです");
				}
			}else {
				// 勝った時の出力
				System.out.println("やるやん\n次は俺にリベンジさせて");
				// do whileを抜けるためにfalseにしている
				flag = false;
			}
			// じゃんけんに勝たなかったら変数にプラス１する
			count++;
		}while (flag);
		// じゃんけんを行った回数を出力
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	}
}