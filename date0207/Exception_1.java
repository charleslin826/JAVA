package date0207;

public class Exception_1 {

	public static void main(String[] args) {
		int a=3,b=0,c;
		try {
			
			System.out.println("try try try..");//���հ��榹�{��
//			int arr[] = new int[5];
//			arr[10] = 7; //Runtime Error (����ɤ~�|�o��/�o�{�����~)  uncomment here and line 13 will be executed.
			c=a/b;
		}catch(ArrayIndexOutOfBoundsException e) {  //�d��p����e��(�Ѿ\PDF ch13 p.10.12.13)
			System.out.println("Error! Here is ref. reason: "+e);//���~�ɷ|�B�檺�{���϶�
		}catch(IndexOutOfBoundsException e) {  //�d��j���n��᭱ //�]�i��Ӥ����� ArrayIndexOutOfBoundsException
			System.out.println("Error! Here is ref. reason: "+e);
		}catch(ArithmeticException e) {  //�]�i��Ӥ����� ArrayIndexOutOfBoundsException
			System.out.println("Error! Here is ref. reason: "+e); //�|���"/ by zero" [��ܰ���0�O���~��]
		}catch(Exception e) {  //�d��j���n��᭱
			System.out.println(e); 
		}finally{
			System.out.println("finally!���ަ��S��������|����");  //���ަ��S��������|����
		}

	}

}
