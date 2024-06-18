package joinerclass;

import java.util.StringJoiner;

public class Executor {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		sj.add("18");
		System.out.println(sj.toString());
		sj.add("06").add("2024");
		System.out.println(sj.toString());
		
		StringJoiner sj2 = new StringJoiner(",");
		sj2.setEmptyValue("sj2 is empty");
		sj2.add("Hello");
		System.out.println(sj2.toString());
		
		sj.merge(sj2);
		System.out.println(sj.toString());
	}
}
