package date0124;

public class P5_Array {

	public static void main(String[] args) {
		int[] score2= {10,20,30,40,50};
		int sum=0;
		for (int i=0; i<score2.length; i++) {
			sum += score2[i];
		}
		System.out.println("Sum = "+sum);
		System.out.println("******************************");
		
		int score3[]= {40,20,25,60,10};
		int sum2=0, max, min;
		max =min =40;
		 for(int i=0;i<score3.length;i++) {
			 if(score3[i]>max) {
				 max = score3[i];
			 }
			 if(score3[i]<min) {
				 min = score3[i];
			 }
		 }
		 System.out.println("max ="+max+"\nmin ="+min);	
		for(int item:score3) {  //each //每次item都會儲存score3的值 此方法可以替換原先的"int i=0;i<score3.length;i++"
			sum2 +=item;               //以及 sum2+= score3[i] ;
		}
		System.out.println("sum2 ="+sum2);
		
		
		
	}

}
