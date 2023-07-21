package java1_25;

import java.util.Random;

public class inheritance {
	//		名前を入力したら下記がコンソールに出力されるように作ってください
	//		条件：数値は毎回変わるように作ってください ＊ランダムで出力する
	//		 	 サブクラスを使用してください
	//			 スーパークラスを使用してください
	//			 getterとsetterを使用してください
	//			 packageを2つ作ってメインと処理を分けてください
	//			 命名する場合は規則にのっとってください
	//			 コンストラクタを使用してください
	//
	//		こんにちは 「 名前 」 さん
	//		ステータス
	//		HP：849
	//		MP：862
	//		攻撃力：375
	//		素早さ：937
	//		防御力：24
	//
	//		さあ冒険に出かけよう！
	private int status;

	public static void rand(){
		// 格納
		String statusName[] = {"HP：", "MP：", "攻撃力：", "素早さ：", "防御力："};
		// ステータスの数値
		Random rand = new Random();
		// 
		inheritance nums = new inheritance();
		// ステータスの数
		for(int i = 0; i <= 4; i++) {
			// ランダムな数値
			nums.setStatus(rand.nextInt(1000));
			// メッセージ表示
			System.out.println(statusName[i] + nums.getStatus());
		}
		// メッセージ表示
		System.out.println("\nさあ冒険に出かけよう！");
	}

	/**
	 * @return status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status セットする status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
}