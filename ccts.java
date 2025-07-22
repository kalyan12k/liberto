package demo;

import java.util.TreeMap;

public class CCTS {
	public static void main(String[] args) {
		TreeMap<String,String> cc = new TreeMap<>();
		cc.put("India","new delhi");
		cc.put("USA","Washington");
		cc.put("Germany","Berlin");
		cc.put("Japan","Tokyo");
		cc.put("India","Delhi");
		System.out.println(cc);
		System.out.println(cc.firstKey());
		System.out.println(cc.lastKey());
		System.out.println(cc.higherKey("Japan"));
		System.out.println(cc.lowerKey("Japan"));
		
		
		
		
		
		
	}

}