package date0207;

public class Test_shift_negitave_value {

	public static void main(String[] args) {
		System.out.println(-1<<2);//1 001 >> 1 100 =-4
		System.out.println(1<<2); //001 => 100 =4
		System.out.println(-7<<2); //0000 0111 = 7 / 1111 1001 =-7 (����2��)=> 1110 0100  = -(4+8+16) =-28
		System.out.println(-7>>2); //1111 1001 =-7 (�k��2��)=> 1111 1110  = -2  
		//��http://content.saihs.edu.tw/chapter_htm/chapter2/2c/c_06.htm  ��2-7
		System.out.println(-3>>2); //0011 = 3 / 1101 = -3 (�k��2��)=> 1111 =-1
	/*http://pclevin.blogspot.tw/2011/12/java_3018.html
	 *�Ҧp:
	 * (-4)<<2   =>  -16
	 * -4���G�i��Ȭ�1111 1011�A�줸������Ӧ줸�A
	 * �N�����ҪťX���줸�ɤW1�A�p1110 1111������Ƭ�-16
	 *
	 */
	}

}
