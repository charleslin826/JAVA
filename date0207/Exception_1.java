package date0207;

public class Exception_1 {

	public static void main(String[] args) {
		int a=3,b=0,c;
		try {
			
			System.out.println("try try try..");//嘗試執行此程式
//			int arr[] = new int[5];
//			arr[10] = 7; //Runtime Error (執行時才會發生/發現的錯誤)  uncomment here and line 13 will be executed.
			c=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {  //範圍小的放前面(參閱PDF ch13 p.10.12.13)
			System.out.println("Error! Here is ref. reason: "+e);//錯誤時會運行的程式區塊
		}catch(IndexOutOfBoundsException e) {  //範圍大的要放後面 //也可更細分打成 ArrayIndexOutOfBoundsException
			System.out.println("Error! Here is ref. reason: "+e);
		}catch(ArithmeticException e) {  //也可更細分打成 ArrayIndexOutOfBoundsException
			System.out.println("Error! Here is ref. reason: "+e); //會顯示"/ by zero" [表示除於0是錯誤的]
		}catch(Exception e) {  //範圍大的要放後面
			System.out.println(e); 
		}finally{
			System.out.println("finally!不管有沒有當機都會執行");  //不管有沒有當機都會執行
		}

	}

}
