package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++){
				String formatStr = String.format("%02d", i);
				String formatStr2 = String.format("%02d", j);
				String formatStr3 = String.format("%02d", i * j);
				System.out.print(formatStr + "×" + formatStr2 + "=" + formatStr3);
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
