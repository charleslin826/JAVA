package date0124;

public class P4_3_ContinueBlock {

	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Block1:
			for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				if(j==5) {
						continue Block1;
					}	
				System.out.println("j ="+j);
			}
		}
				System.out.println("k ="+k);
				
	}

	}


