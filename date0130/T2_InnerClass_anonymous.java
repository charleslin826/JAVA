//1.	�м��gCCircleY���ΦW�������O�A�åΥ��I�sshow()�禡�A�ΥH��ܶꭱ�n�C
package date0130;

public class T2_InnerClass_anonymous {

	public static void main(String[] args) {
		(new CCircleY(1.0) {
			void show() {
				System.out.println("Area = "+pi*radius*radius);
			}
		}
		).show();

	}
	static class CCircleY{
		protected double pi = 3.14;//��Ʀ����@����ܼ�
		protected double radius;	//��Ʀ����@����ܼ�
		
		public CCircleY(double r) { //�ۭq�غc�l  //����ڬO��radius =r��bshow��k�̭��A���O�٬O�n���X�Ӥ���ŦX�ܼƪ��W�٩w�q
			radius =r;
		}
	}

}