package java1_25_1;

import java.util.Scanner;

import java1_25.inheritanceSub;

public class  output  {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		String strName = name.nextLine();
		System.out.println("こんにちは「" + strName + "」さん");
		System.out.println("ステータス");

		inheritanceSub sub = new inheritanceSub();
		sub.status();
		name.close();
	}
}