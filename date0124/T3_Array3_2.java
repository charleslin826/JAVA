package date0124;

public class T3_Array3_2 {
//�Ϊ��e�{ �H�U ���εe�u
//�C�@��P���`�B V
//�C�@�����~�P���`���B V
//���@��P����~�Z�̦n �M �̮t V
//�P����B�̦h���O���@�����~ V
	
	
	public static void main(String[] args) {
		String productname[][]={{"�P���","���~A","���~B","���~C","���~D","���~E","�`�p"},{"Bill","John","Kenny",""}};
		int totalsum=0; 
		int sale[][]= {{33,32,56,45,33,0},{77,33,68,45,23,0},{43,55,43,67,65,0},{0,0,0,0,0,0}};
		
		for(int i=0;i<sale.length-1;i++) {
			for(int j=0;j<sale[i].length-1;j++) {
				if(i==0)sale[0][5] += sale[0][j];//Bill�P���`���B 
				if(i==1)sale[1][5] += sale[1][j];
				if(i==2)sale[2][5] += sale[2][j];

				if(j==0)sale[3][0] += sale[i][0];//�C�@�����~�P���`���B
				if(j==1)sale[3][1] += sale[i][1];//�C�@�����~�P���`���B
				if(j==2)sale[3][2] += sale[i][2];//�C�@�����~�P���`���B
				if(j==3)sale[3][3] += sale[i][3];//�C�@�����~�P���`���B
				if(j==4)sale[3][4] += sale[i][4];//�C�@�����~�P���`���B

				totalsum += sale[i][j];
				
				
			}
			
			
		}
		//�H�W�p��
		
		sale[3][5]=totalsum;
		
		
		//�e�{�e�� �H�U
				for(int i=0;i<sale.length;i++){
					for(int j=0;j<sale[i].length+1;j++) {
						if(i==0) System.out.print(productname[0][j]+"\t"); //�e�{�Ĥ@�C
						if(i==1) { //����e�{Bill�C
							if(j==0) { System.out.print("\n"+productname[1][0]);} //�e�{Bill�C
							if(j<=5)System.out.print("\t"+sale[0][j]);				
							}				
						if(i==2) { //����e�{John�C
							if(j==1) { System.out.print("\n"+productname[1][1]); //�e�{John �����������
							for(int k=0;k<sale[i].length;k++) {System.out.print("\t"+sale[1][k]);
							}
							}
							}
						if(i==3) { //����e�{Kenny�C
							if(j==2) { System.out.print("\n"+productname[1][2]); //�e�{Kenny �����������
							for(int k=0;k<sale[i].length;k++) {System.out.print("\t"+sale[2][k]);		
							}
							}
							}										
					
						
					}
					
				}
				//����e�{last�C
					System.out.print("\n"+productname[1][3]); //�e�{Kenny �����������
					for(int k=0;k<sale[3].length;k++)  {System.out.print("\t"+sale[3][k]);}		
					 									
							
				//�e�{�e�� �H�W
		
		
		System.out.println("\n\n\n");

		
		//�H�U ���@��P����~�Z�̦n �M �̮t 		
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
		System.out.println("�P��~�Z�̦n���B�O"+maxvalue+"\t�P��~�Z�̦n���H�O"+maxname);
		System.out.println("�P��~�Z�̮t���B�O"+minvalue+"\t�P��~�Z�̮t���H�O"+minname);
		

		//�H�W ���@��P����~�Z�̦n �M �̮t 
		
		//�H�U�e�{�P����B�̦h���O���@�����~ 
		int salemax = 0;
		String salemaxitem = null;
		for(int i=0;i<sale[0].length-1;i++) {
		if(sale[3][i]>salemax) {
			salemax=sale[3][i];
			salemaxitem=productname[0][i+1];
		}			
		}
		System.out.println("���~�P����B�̦h ="+salemaxitem+"\t���B��"+salemax);
		//�H�W�e�{�P����B�̦h���O���@�����~ 
		
		
		}
		

		
		
	}

	
	


