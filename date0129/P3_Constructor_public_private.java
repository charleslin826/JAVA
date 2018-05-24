package date0129;

public class P3_Constructor_public_private {

	public static void main(String[] args) {
//		Aaa a= new Aaa();  //無法取用private的建構元(constructor)
		Aaa a= new Aaa(5);  //不要理會eclipse驚嘆號 我們其實有用到此local variable
	}

}

class Aaa{			
	private void Aaa() { //只有內部類別可以使用 // 實例函數若省略public與private，則成員只能在同一個package裡被存取 
		System.out.println("aaa() called.");//此函數若在private後面省略void則會變成自訂建構子，就不是實例函數了 
	}
	
	public Aaa(int r) {
		this.Aaa();               //但是如果uncomment此項，則可輾轉使用Aaa(無參數)，Arr(r)可以呼叫Arr()，因為它們都還在同一個class內
		System.out.println("aaa(r) called.");
	}
}