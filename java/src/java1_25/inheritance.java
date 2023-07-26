package java1_25;

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
	// 格納
	public String statusName[] = {"HP：", "MP：", "攻撃力：", "素早さ：", "防御力："};
	
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