package date0129;

public class CCalculator {
		int a,b,c;	
		void set_value(int x,int y,int z) {   //�N��ƪ�xyz�ഫ��abc
			a=x;
			b=y;
			c=z;
		}
		void show(){		
			System.out.println("a ="+a+"\tb ="+b+"\tc ="+c);	
		};	
		int sub() {
			return a-b-c;
		}		
		int add() {
			return a+b+c;
		}		
		int mul() {
			return a*b*c;
		}		
		int avg() {
			return (a+b+c)/3;
		}
	}


