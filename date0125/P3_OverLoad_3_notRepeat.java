package date0125;

public class P3_OverLoad_3_notRepeat {

	public static void main(String[] args) {
		int seed;
		int lotto[] = new int[49];  //因為第0項沒用到49-1=48 所以從第1項開始使用
		for (int i =1 ; i<=1000000;i++) {
			seed = (int) (Math.random()*48)+1;
			lotto[seed] +=1;//產生的數字若是48則 lotto[48]+1 每出現一次加一次
		
		}
		
		for(int i =0 ; i<lotto.length ; i++ ) {
			System.out.println(i+" = " + lotto[i]);  //每個數字的出現機率都差不多在2萬上下
		}
	}

}
