package date0124;

public class P4_2 {

	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Block:{
		for(i=0;i<100;i++) {
			for(j=0;j<100;j++) {
				for(k=0;k<100;k++) {
					if(i==10 && j==20 && k==30) {
						break Block;
					}
				}
			}
		}
				}
		System.out.println("Oh yeah!Escapse from Block which include 3 loops!!!");
		System.out.println("i ="+i);
		System.out.println("j ="+j);
		System.out.println("k ="+k);
	}

}
