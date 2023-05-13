package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// 右側の繰り返し処理
		for(int i = 1; i <= 9; i++) {
			// 左側の繰り返し処理
			for(int j = 1; j <= 16; j++){
				// 0埋め
				String formatStr = String.format("%02d", i);
				String formatStr2 = String.format("%02d", j);
				String formatStr3 = String.format("%03d", i * j);
				// メッセージ表示
				System.out.print(formatStr2 + "×" + formatStr + "=" + formatStr3);
				
				// 16までかけたらスキップ
				if (j == 16) {
					continue;
				}
				// メッセージ表示
				System.out.print("||");
			}
			//改行
			System.out.println();
		}
	}
}
