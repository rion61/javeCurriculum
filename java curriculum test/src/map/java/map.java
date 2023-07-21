package map.java;


import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "田中");
		map.put(3, "鈴木");
		map.put(5, "高橋");

		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println(map.get(5));

		for(Integer key : map.keySet()) {
			System.out.println(key);
		}

		for (String val : map.values()) {
			System.out.println(val);
		}
	}
}
