package date0124;

public class P4_BreakBlock {

	public static void main(String[] args) {
		boolean i=false;
		//Block1:{
			System.out.println("<This is first block>");
			i=true;
			Block2:{
				if(i==true) 
					break Block2;//程式運行到此後 跳離Block2繼續運行
				System.out.println("<This is second block>");
				
		}
			System.out.println("<Escape from block 2 to here!>");
		
		//}
	
		

	}

}
