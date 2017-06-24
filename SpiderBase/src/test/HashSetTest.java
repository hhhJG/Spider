package test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> sort = new HashSet<String>();
		sort.add("1");
		sort.add("1111");
		sort.add("5");
		sort.add("-1");
		sort.add("19");
		for(String m : sort) {
			System.out.print(m + "\t");
		}
	}

}
