/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package java1_10;

public class practice2 {

	public static void main(String[] args) {
		// 変数iが1から9まで繰り返します
		 for(int i = 1; i <= 9; i++) {
			 	// 2番目のfor文で、変数jが1から9まで繰り返しています
	            for(int j = 1; j <= 9; j++){
	            	// 最初のfor文で変数iが1の場合、2番目のfor文で変数jが1～9まで繰り返しています
	            	System.out.print(i + "×" + j + "=" + i * j + " ");
	            }
	            //改行
	            System.out.println();
	        }
	}
}
