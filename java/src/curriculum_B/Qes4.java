package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// 左側の繰り返し処理
		for(int i = 1; i <= 9; i++) {
			// 右側の繰り返し処理
			for(int j = 1; j <= 9; j++){
				// 0埋め
				String formatStr = String.format("%02d", i);
				String formatStr2 = String.format("%02d", j);
				String formatStr3 = String.format("%02d", i * j);
				// メッセージ表示
				System.out.print(formatStr + "×" + formatStr2 + "=" + formatStr3);
				// 9までかけたらスキップ
				if (j == 9) {
					continue;
				}
				System.out.print("||");
			}
			//改行
			System.out.println();
		}
	}
}
