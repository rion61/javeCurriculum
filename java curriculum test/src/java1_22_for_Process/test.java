package java1_22_for_Process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

	public String greeting;
	public String delicious;
	public String  japaneseFood;
	public String  japanTime;

	public test(){
		String food = "寿司";
		String country = "日本";
		
		this.greeting = "こんにちは！ここは" + country + "です！";
		this.delicious = "この" + food +"はうまい";
		this.japaneseFood = food + "は和食です";
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd" + " " + "H:m:s ");
		String yearsTime = sdf.format(calendar.getTime());
		this.japanTime = "今の現在日時は" + yearsTime + "です";
		
	}	
}