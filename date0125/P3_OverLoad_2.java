package date0125;

public class P3_OverLoad_2 {

	public static void main(String[] args) {
		int total;
		total= add(1,2);
		System.out.println(total);
		total= add(1,2,3);
		System.out.println(total);
		total= add(1,2,3,4,5,6,7,8,9,10);
		System.out.println(total);
		
	}
	
	static int add(int x ,int... a) {   //int... n����k����"���w�Ӽ�" �۷��}�C
		int sum=x;
		for(int i:a)
			sum+=i;
		return sum;
	}
}
