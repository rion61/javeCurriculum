package java1_18;
import java.util.Random;
public class Curriculum_New_1_18 {

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// 問1 ：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		String greeting = "Hello JavaSE ";
		int num = 11;
		hello(greeting,num);

		// 問2 ：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		multiplication(num);

		// 問3 ：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		// 配列作成
		int[] array =  {2,15,6,73,};
		incArray(array);

		// 問４：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		multiplication(3.0,7.2);

		// 問５：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		int arrayRand[] = random(3);

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素
		//の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		double averageValue = average(arrayRand);

		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならば
		//trueそれ以外はfalseを返しコンソールに出力してください
		boolValue(averageValue);
	}


	/*********************************
	 * 問1
	 * 挨拶を表示する処理
	 *********************************/
	private static void hello(String greeting, int namber) {
		// メッセージ表示
		System.out.println(greeting + namber + "\n");

	}


	/*********************************
	 * 問2
	 * 計算する処理
	 *********************************/
	// 問１の数字が引数に入っている
	private static void multiplication(int namber) {
		int total = namber * 2;
		System.out.println(total);
		// 改行
		System.out.println();

	}


	/*********************************
	 * 問3
	 * 繰り返し処理
	 *********************************/
	// 引数の配列
	private static void incArray(int[] array) {
		// 拡張for文値を繰り返し
		for (int i : array) {
			System.out.println(i);

		}
	}


	/*********************************
	 * 問4
	 * 足し算する処理
	 *********************************/
	// 小数を受け取る
	private static void multiplication(double decimal, double decimal2) {
		// メッセージ表示
		System.out.println(decimal + decimal2);
		// 改行
		System.out.println();

	}


	/*********************************
	 * 問5
	 * ランダムな数字を出力する処理
	 *********************************/
	private static int[] random(int intRand) {
		// ランダムの箱
		Random rand = new Random();
		// 配列の数
		int[] arrayRand = new int[intRand];
		// 繰り返し処理
		for (int i = 0; i < arrayRand.length; i++) {
			// ランダムの数字を表示
			System.out.println((arrayRand[i] = rand.nextInt(99) + 1) +((i + 1 == arrayRand.length)? "\n":""));

		}
		// 戻り値
		return arrayRand;

	}


	/*********************************
	 * 問6
	 * 平均の処理
	 *********************************/
	private static double  average(int[] arrayRand) {
		// 配列の値を足していく初期値
		int averageSum = 0;
		// 繰り返し
		for(int i = 0; i < arrayRand.length; i++) {
			// 合計を足していく
			averageSum += arrayRand[i];

		}

		// 平均を受け取る
		double averageAll = averageSum / arrayRand.length;
		// メッセージ表示
		System.out.println(averageAll);
		// 戻り値
		return averageAll;	

	}


	/*********************************
	 * 問7
	 * 条件処理
	 *********************************/
	private static void  boolValue(double averageValue) {
		// メッセージ表示
		System.out.println(50 <= averageValue);
	}
}