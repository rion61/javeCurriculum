package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes6 {
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner name = new Scanner(System.in);

		// 名前を取得
		String line1 = name.next();
		name.close();
		//文字列を代入また文字列を分割
		String electricAppliances[] = line1.split("、");;
		// 変数名に文字列を順番に取り出している
		for (String array : electricAppliances) {
			// 台数を表示
			int num = rand.nextInt(12);
			switch(array){
			case "パソコン":
				System.out.println(array + "の残りの代数" + num +  "台です\n");
				break;
			case "冷蔵庫":
				System.out.println(array + "の残りの代数" + num +"台です\n");
				break;
			case "扇風機":
				System.out.println(array + "の残りの代数" + num +"台です\n");
				break;
			case "洗濯機":
				System.out.println(array + "の残りの代数" + num +"台です\n");
				break;
			case "加湿器":
				System.out.println(array + "の残りの代数" + num +"台です\n");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(array + "の残りの代数" + num +"台です\n");
				break;
				// それ以外の時の処理
			default:
				System.out.println("「その他商品」は指定の商品ではありません");
			}
		}
	}
}
