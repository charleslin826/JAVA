package date0222;

import java.util.HashSet;

public class P8_Collection_Hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();// <generic(泛型)>
		HashSet<Integer> hi = new HashSet<Integer>();
		hs.add("Monkey");
		hs.add("Apple");
		hs.add("Monkey");
		hi.add(123);
		hi.add(123);
		hi.add(38081);
		hi.add(11111);   //please refer PPT ch16 p.12,10
		hi.add(911);
		hi.add(0);
		System.out.println("Collection of Hashset :"+hs+hi); //HashSet's internal Algorithms will sort the element from A-Z and will not repeat.
		System.out.println("HashSet_hs size="+hs.size()+"\nHashSet_hi size="+hi.size());
		hi.remove(38081);
		System.out.println("Collection of Hashset :"+hi);
		hs.clear();
		System.out.println("Collection of Hashset :"+hs+hi);
		
	}

}
