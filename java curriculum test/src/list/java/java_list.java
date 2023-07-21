package list.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java_list {
    public static void main(String[] args) {
        List<String> sample1 = new ArrayList<>() {
            {
                add("test1");
                add("test2");
                add("test3");
            }
        };
        sample1.add(null);
        for(String test : sample1) {
        	System.out.println(test);
        }
        List<String> sample2 = new ArrayList<String>(Arrays.asList("test1", "test2", "test3"));
        System.out.println("sample1= " + sample1);
        System.out.println("sample2= " + sample2);
    }
}
// 1つ目のサンプルではArraylistの初期化時に、初期化ブロックの構文を利用して、要素に入れる値をセットしています。
// 2つ目のサンプルでは、asList関数を利用して、初期化と同時に要素を格納しています。

