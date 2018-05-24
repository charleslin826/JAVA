package date0222;

import java.util.LinkedList;
import java.util.ListIterator;

public class P12_Iterator {

	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(10);
		llist.add(5);
		llist.add(15);
		llist.add(2);
		llist.add(7);
		ListIterator<Integer> litr = llist.listIterator(); // use ListIterator
		while(litr.hasNext()) {
			System.out.print(litr.next()+" - ");
		}
		System.out.println("");
		ListIterator<Integer> litr2 = llist.listIterator(llist.size()); //Here llist.size() = 5
		while(litr2.hasPrevious()) {
			System.out.print(litr2.previous()+" - ");
		}		
		System.out.println("");
		System.out.print(llist.listIterator(llist.size()));//the last address of llist
	}

}
