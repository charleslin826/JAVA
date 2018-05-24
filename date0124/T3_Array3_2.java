package date0124;

public class T3_Array3_2 {
//用表格呈現 以下 不用畫線
//每一位銷售總額 V
//每一項產品銷售總金額 V
//哪一位銷售員業績最好 和 最差 V
//銷售金額最多的是哪一項產品 V
	
	
	public static void main(String[] args) {
		String productname[][]={{"銷售員","產品A","產品B","產品C","產品D","產品E","總計"},{"Bill","John","Kenny",""}};
		int totalsum=0; 
		int sale[][]= {{33,32,56,45,33,0},{77,33,68,45,23,0},{43,55,43,67,65,0},{0,0,0,0,0,0}};
		
		for(int i=0;i<sale.length-1;i++) {
			for(int j=0;j<sale[i].length-1;j++) {
				if(i==0)sale[0][5] += sale[0][j];//Bill銷售總金額 
				if(i==1)sale[1][5] += sale[1][j];
				if(i==2)sale[2][5] += sale[2][j];

				if(j==0)sale[3][0] += sale[i][0];//每一項產品銷售總金額
				if(j==1)sale[3][1] += sale[i][1];//每一項產品銷售總金額
				if(j==2)sale[3][2] += sale[i][2];//每一項產品銷售總金額
				if(j==3)sale[3][3] += sale[i][3];//每一項產品銷售總金額
				if(j==4)sale[3][4] += sale[i][4];//每一項產品銷售總金額

				totalsum += sale[i][j];
				
				
			}
			
			
		}
		//以上計算
		
		sale[3][5]=totalsum;
		
		
		//呈現畫面 以下
				for(int i=0;i<sale.length;i++){
					for(int j=0;j<sale[i].length+1;j++) {
						if(i==0) System.out.print(productname[0][j]+"\t"); //呈現第一列
						if(i==1) { //限制呈現Bill列
							if(j==0) { System.out.print("\n"+productname[1][0]);} //呈現Bill列
							if(j<=5)System.out.print("\t"+sale[0][j]);				
							}				
						if(i==2) { //限制呈現John列
							if(j==1) { System.out.print("\n"+productname[1][1]); //呈現John 但不重複顯示
							for(int k=0;k<sale[i].length;k++) {System.out.print("\t"+sale[1][k]);
							}
							}
							}
						if(i==3) { //限制呈現Kenny列
							if(j==2) { System.out.print("\n"+productname[1][2]); //呈現Kenny 但不重複顯示
							for(int k=0;k<sale[i].length;k++) {System.out.print("\t"+sale[2][k]);		
							}
							}
							}										
					
						
					}
					
				}
				//限制呈現last列
					System.out.print("\n"+productname[1][3]); //呈現Kenny 但不重複顯示
					for(int k=0;k<sale[3].length;k++)  {System.out.print("\t"+sale[3][k]);}		
					 									
							
				//呈現畫面 以上
		
		
		System.out.println("\n\n\n");

		
		//以下 哪一位銷售員業績最好 和 最差 		
		int maxvalue = 0,minvalue= 0;
		String maxname =null,minname =null;	
		for(int i=0;i<3;i++) {
		if(sale[i][5] > maxvalue) {
			maxvalue=sale[i][5];
			maxname=productname[1][i];
		}			
		minvalue=sale[0][5];
		minname=productname[1][0];
		if(sale[i][5] < minvalue) {
			minvalue=sale[i][5];	
			minname=productname[1][i];
		}
		}
		System.out.println("銷售業績最好金額是"+maxvalue+"\t銷售業績最好的人是"+maxname);
		System.out.println("銷售業績最差金額是"+minvalue+"\t銷售業績最差的人是"+minname);
		

		//以上 哪一位銷售員業績最好 和 最差 
		
		//以下呈現銷售金額最多的是哪一項產品 
		int salemax = 0;
		String salemaxitem = null;
		for(int i=0;i<sale[0].length-1;i++) {
		if(sale[3][i]>salemax) {
			salemax=sale[3][i];
			salemaxitem=productname[0][i+1];
		}			
		}
		System.out.println("產品銷售金額最多 ="+salemaxitem+"\t金額為"+salemax);
		//以上呈現銷售金額最多的是哪一項產品 
		
		
		}
		

		
		
	}

	
	


