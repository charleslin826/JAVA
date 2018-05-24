package date0222;

import java.util.TreeSet;

public class P10_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for(int i=20;i>=2;i-=2) {
			tset.add(i);
		}
		System.out.println("size = "+ tset.size());
		System.out.println("content = "+ tset);
		System.out.println("6-14="+tset.subSet(6, 14));//介於6~14之間的
		System.out.println(">=10="+tset.tailSet(10));  //10後面的 
		System.out.println("<10="+tset.headSet(10));   //10前面的
	}

}
