package date0118;

import java.util.Scanner;

public class P2_Scanner_Celsius_to_Fahrenheit {

	public static void main(String[] args) {
			float C; 
			Scanner scn = new Scanner(System.in);
			System.out.println("Please input Celsius to Fahrenheit(�����ؤ�):"); 
			C = scn.nextFloat(); //���o�B�I�� �]�i��.nextDouble();
			System.out.printf("= %.1f�XC \n",C);
			System.out.printf("= %.1f�XF in integer type\n",(9/5)*C+32); //�Ʀr�L�p���I�]�Lf �����H���(int)�B��� �h1.8 �|�������Ĥ@��1 
			System.out.printf("= %.1f�XF in float type ���I�O�C�ӼƦr�᭱���n�[f \n",(9f/5f)*C+32); //�Ʀr��+f �j��B�I��(float)
			System.out.printf("= %.1f�XF in double type\n",(9.0/5.0)*C+32); //�Ʀr���p���I�۰ʧאּ�w�]double
			scn.close(); //�۷��C�y������fflush�\��h�R���Ҧ��ڪ��O����			
		}
	
	}


