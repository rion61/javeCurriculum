package java1_19;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// 呼び出し
		Dog pet = new Dog();
		// メッセージ表示
		System.out.println(pet.other);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 呼び出し
		Dog animalNumber = new Dog();
		// メッセージ表示
		System.out.println(animalNumber.nums);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Calendar cl = Calendar.getInstance();
		// 日付設定
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd" + " " + "H:m:s ");
	        String yearsTime = sdf.format(cl.getTime());
	        System.out.println(yearsTime);
	}
}