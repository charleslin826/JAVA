package date0125;

public class T5_Lottery {

	public static void main(String[] args) {
		
		System.out.print("電腦挑的10組大樂透號碼:\n");
		int num[] = {0,0,0,0,0,0,0};
		int flag=0;
		for (int i=0;i<10;i++) { //共印出十組
//		do {//當...重新RUN
			for (int j=0;j<=6;j++) {      //randon產生0~1的數字 該數所得最小值是0 ，最大值是0.999999999999 永遠不會到1
			num[j]=(int)(Math.random()*49+1);  //所以要加1   例如  (int)0.999*49=48+1=49# {這樣才能印出最大值49}			
		}
//			for (int k=0;k<=6;k++) {
//				for (int l=0;l<=6;l++) {//用第0~5比對第0項到第5項
//					if (num[k]==num[l]){ //會比到自己會永遠break 用sort 比對n-1
//						flag =1;
//						break;
//		}
//		}
//		}
//		}while(flag==1);//當有重複的數字時 重跑	
			for (int k=0;k<=6;k++) {
			System.out.print(num[k]+"\t");//依次印出一組	
			}
			System.out.println();
	}

	}

}
