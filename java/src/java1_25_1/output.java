package java1_25_1;

import java.util.Scanner;

import java1_25.inheritance;

public class  output extends inheritance{

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		String strName = name.nextLine();
		System.out.println("こんにちは「" + strName + "」さん");
		System.out.println("ステータス");

		rand();
		name.close();
	}
}