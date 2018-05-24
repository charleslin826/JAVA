package date0118;

public class T5_99 {

	public static void main(String[] args) {
		//do..while loop//
		int a=1,b=1;
		do {
			do {
			System.out.printf("%d * %d = %d\t",a,b,a*b);
			b++;
			}while(b<10);
			b=1;
			a++;
			System.out.println();
	}while(a<10);
		/////////////////////////////////////////////////////////////////////////////////
		//while loop//
		System.out.println();
		System.out.println();
		System.out.println("--------------------------");
		int x=1,y=1;
		while(x<10) {
			while(y<10) {
				System.out.printf("%d * %d = %d\t",x,y,x*y);
				y++;
			}
			y=1;
			x++;
			System.out.println();
		}
}
}