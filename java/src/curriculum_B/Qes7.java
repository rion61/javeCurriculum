package curriculum_B;
import java.util.Scanner;
public class Qes7 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		// メッセージを表示
		System.out.print("生徒の人数を入力してください (2人以上) : ");

		// 人数を入力
		int personNumber = num.nextInt();
		// 教科の配列の値
		String subjectName[] = {"英語", "数学", "理科","社会"};
		// 各教科点数
		int[][] peopleScore = new int[personNumber][4];
		// 合計値
		int[] subjectSum = new int[personNumber];
		// 教科数
		int[] studyNum = new int[subjectName.length];

		// 生徒の人数
		for(int i = 1; i <= personNumber; i++) {
			// 教科の数
			for (int j = 0; j < subjectName.length; j++){
				// メッセージ表示
				System.out.print(i + "人目の「" + subjectName[j] + "」の点数を入力してください :");
				
				// 点数を入力
				int points = num.nextInt();
				// 点数を格納
				peopleScore[i - 1][j] = points;
				// 1人1人合計点
				subjectSum[i - 1] += peopleScore[i - 1][j];

			}
			// 改行
			System.out.println();

		}

		// 一人一人の平均
		for(int k = 1; k <= personNumber; k++) {
			// 1人1人の平均点
			double average = subjectSum[k-1]/4;
			
			// メッセージ表示
			System.out.println(k + "人目の平均点は" + String.format("%.2f",average) + "点です。");

		}
		// 改行
		System.out.println();

		/* ---------------------------------------------------
		 [概要] 一人一人の平均を計算する処理
		  --------------------------------------------------- */
		// 初期値
		double  average = 0;
		// 人数
		for(int i = 1; i <= personNumber; i++) {
			// 教科数
			for(int p = 0; p < subjectName.length; p++) {
				// 教科ごとの合計
				studyNum[p] += peopleScore[i-1][p];

			}
		}
		// 全ての教科の平均を出力するまで繰り返し
		for (int p = 0; p < subjectName.length; p++){
			// 教科ごとの平均
			average = studyNum[p]/personNumber;
			// メッセージ表示
			System.out.println(subjectName[p] + "の平均点は" + String.format("%.2f",average) + "点です。");

		}
		
		/* ---------------------------------------------------
		 [概要] 教科ごとの平均を計算する処理
		  --------------------------------------------------- */
		// 初期値
		double  averageSum = 0;
		// 教科要素
		for (int p = 0; p < subjectName.length; p++){
			// 全体の合計点
			averageSum += studyNum[p]/personNumber;
			
		}
		/* ---------------------------------------------------
		 [概要] 全体の平均を計算する処理
		  --------------------------------------------------- */
		// 全体の平均点
		double averageAll = averageSum / subjectName.length;
		
		// メッセージ表示
		System.out.println("全体の平均点は" + String.format("%.2f",averageAll) + "点です。");
		num.close();
	}
}