package java1_25;

import java.util.Random;

public class inheritanceSub extends inheritance{

	public void status() {
		Random rand = new Random();
		
		// ステータスの数
				for(int i = 0; i <= 4; i++) {
					// ランダムな数値
					setStatus(rand.nextInt(1000));
					// メッセージ表示
					System.out.println(super.statusName[i] + getStatus());
				}
				// メッセージ表示
				System.out.println("\nさあ冒険に出かけよう！");
			}
	}