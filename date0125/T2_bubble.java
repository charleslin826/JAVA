package date0125;

public class T2_bubble {
//ㄏノ獁逼猭(パオ ㄢㄢゑ耕耕娩程程计程オ 程计程)盢33,24,11,48,15パ逼  
	public static void main(String[] args) {
		int A[]= {48,33,24,11,15};
		bubble(A);
		
		System.out.print("A[] =");
		for(int i=0;i<A.length;i++) {
		System.out.print(A[i]+"\t");
		}
	}
	
	static void bubble(int arr[]) {
		int temp,n=arr.length;
	for(int j=0;j<n;j++) {					
		for(int i=0;i<n-1;i++) {					
		if (arr[i]>arr[i+1]) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;			
		}
		}
		
		System.out.print("材"+j+"Ω");
		for(int item:arr) {
			System.out.print(item+"\t");
		}
		System.out.print("\n");
			
	}
		
		
		

	}

}
