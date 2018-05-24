package date0222;

import java.util.TreeSet;

public class P11_for_each {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Monkey");
		tset.add("Bunny");
		tset.add("Kitty");
		tset.add("puppy");
		System.out.print("TreeSet contain:");  
		for(String i:tset)  //for-each will show every element of TreeSet  (PPT CH16 P.32)
			System.out.print(i+" ");
	}

}
