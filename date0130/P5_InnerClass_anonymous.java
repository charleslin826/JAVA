package date0130;

public class P5_InnerClass_anonymous {

	public static void main(String[] args) {
		(new Caaa() {  //�إ߰ΦW�������OCaaa������
					void set_num(int n) {                //7-10��ɨ��������OCaaa�̨S���w�q�쪺���
						num =n;
						System.out.print("num = "+num);
					}
				}
				).set_num(10);		
	}
	
	static class Caaa{ //�������OCaaa
		int num;
	}

}
