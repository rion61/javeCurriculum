package java1_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class prefectures {
	// コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	public static void prefecture(){
		Scanner scannerNamber = new Scanner(System.in);

		// 県ごとの番号
		String numSplit[];

		// 判定フラグ
		boolean inputErrorFlag = false;
		do {
			// 入力エラー時、繰り返しフラグの初期化
			inputErrorFlag = false;
			// メッセージ表示
			System.out.println("0〜10の数字をカンマ区切りで入力して下さい" );

			// 入力した値をカンマ区切りで分けて、配列に代入
			numSplit = scannerNamber.next().split(",");

			// 配列の数値を分けて繰り返し入れている
			for (String strItem : numSplit){
				// エラーチェック処理
				inputErrorFlag = check(strItem,11);
				// 処理を抜ける
				if (inputErrorFlag) {
					break;
				}
			}
		}while(inputErrorFlag);

		// 県を追加していく
		List<Integer> newList = new ArrayList<>();
		// 入力値をひとつひとつ入れている
		for (String s : numSplit) {
			// 追加していく
			newList.add(Integer.parseInt(s));
		}

		// フラグ
		boolean inputError = false;

		// 昇順、降順を指定
		String points = "";

		do {
			inputError = false;
			System.out.println("昇順,降順どちらにしますか");
			System.out.println("昇順なら0、降順なら1を入力してください");

			// 判定の入力
			points = scannerNamber.next();

			// エラーチェック処理
			inputError = check(points,2);
			// 処理を抜ける
			if (inputError) {
				continue;
			}

			if (Integer.parseInt(points) == 0) {
				// 昇順
				Collections.sort(newList);
			}else if (Integer.parseInt(points) ==1) {
				// 降順
				Collections.sort(newList,  Collections.reverseOrder());
			}

			// 当てはまらないとき
		}while(inputError);

		Map<Integer, String> national = new HashMap<>();
		int mapNum = 0;

		national.put(mapNum++, "北海道:札幌市:83424");
		national.put(mapNum++, "青森県:青森市:9646");
		national.put(mapNum++, "岩手県:盛岡市:15275");
		national.put(mapNum++, "宮城県:仙台市:7282");
		national.put(mapNum++, "秋田県:秋田市:11638");

		national.put(mapNum++, "山形県:山形市:9323");
		national.put(mapNum++, "福島県:福島市:13784");
		national.put(mapNum++, "茨城県:水戸市:6097");
		national.put(mapNum++, "栃木県:宇都宮市:6408");
		national.put(mapNum++, "群馬県:前橋市:6362");
		national.put(mapNum++, "埼玉県:さいたま市:3798");

		// 昇順,降順をひとつひとつ入れていく
		for (int nums : newList) {
			// 配列に都道府県名、県庁所在地,面積 渡す
			String nationalSplit[] = national.get(nums).split(":");

			// メッセージ表示
			System.out.println("都道府県名：" + nationalSplit[0]);
			System.out.println("県庁所在地：" + nationalSplit[1]);
			System.out.println("面積：" + nationalSplit[2] + "km2\n");
			scannerNamber.close();
		}
	}

	/*-----------------------------------------------------
	 * エラーチェック
	 * intPointは11か２が入る予定
	 * strItemは入力値
	-----------------------------------------------------*/
	public static boolean check (String strItem, int intPoint) {

		// マッチング処理
		String regex_AlphaNum = "[0-9]";

		// 数字以外の場合
		if (!strItem.matches(regex_AlphaNum)) {
			// メッセージ表示
			System.out.println("数字以外の入力はやめてください");
			return true;

		}

		// 文字列から整数に変換
		int intItem = Integer.parseInt(strItem);

		// 数字が基準値以上の場合
		if (intItem >= intPoint) {
			// メッセージ表示
			System.out.println("指定の入力値以外の入力はやめてください");
			return true;

		}
		return false;

	}
}