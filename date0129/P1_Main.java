package date0129;

public class P1_Main {

	public static void main(String[] args) {
		Crectangle rect1 = new Crectangle();  //�I�s�����O�éw�q�l���O [�ŧi�P�إߪ���]
		rect1.height =25;
		rect1.width = 35;
		rect1.area();
//		System.out.println("PERI ="+rect1.peri()); �]���e�{��k(println)�[�Jperi()���A�ҥH�令�����I�speri()�p�U
		rect1.peri();
		System.out.println("����ΰ� ="+rect1.height);
		System.out.println("����μe ="+rect1.width);	
		
		P1_newClass cir1 = new P1_newClass();  //CalculateCircle//
		cir1.radius=20; //�I�sP1_newClass��radius(��Ʀ���)
		//cir1.area();	//�I�sP1_newClass��area(��Ʀ���/��k) ��p���k(���)�M�U����Crectangle(�����)���@��
		cir1.area_all(); //��ӥ[�W���o�Ӥ�k�̭��w�g�]�t�W������k'area()'�A��²�{���X!
		cir1.setCircle(3.1416, 2.0);	//���]circle��pi & �b�|
		cir1.area_all();
	}	
}

class Crectangle {  //�S���["()"�]�����O��k �u�O���O(�W��)!!  //���O�O��'��Ʀ���'�P'��Ʀ���'�ʸ˦Ӧ�
	int width;//'��Ʀ���'
	int height;//'��Ʀ���'
	/*�U��method��type�쥻�Oint���^��(return)�ȡA���{�b��L�X�\��println������bCrectangle��k�̭� �ҥH�令void*/
	//�ЩMperi()��k�����Τ覡����ӡA�Y�i�ݥX�ݭ١C
	
	void area() {      //'��Ʀ���' 
		int area=width * height;
		System.out.println("Rectangle AREA(����έ��n) ="+area);
	};
	
	/*int*/ void peri() {      //'��Ʀ���'
		System.out.println("PERIMETER(�P��) ="+(width+height)*2);
		//return (width+height)*2;
	};
	
}
