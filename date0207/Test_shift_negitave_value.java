package date0207;

public class Test_shift_negitave_value {

	public static void main(String[] args) {
		System.out.println(-1<<2);//1 001 >> 1 100 =-4
		System.out.println(1<<2); //001 => 100 =4
		System.out.println(-7<<2); //0000 0111 = 7 / 1111 1001 =-7 (左移2後)=> 1110 0100  = -(4+8+16) =-28
		System.out.println(-7>>2); //1111 1001 =-7 (右移2後)=> 1111 1110  = -2  
		//見http://content.saihs.edu.tw/chapter_htm/chapter2/2c/c_06.htm  表2-7
		System.out.println(-3>>2); //0011 = 3 / 1101 = -3 (右移2後)=> 1111 =-1
	/*http://pclevin.blogspot.tw/2011/12/java_3018.html
	 *例如:
	 * (-4)<<2   =>  -16
	 * -4的二進位值為1111 1011，位元左移兩個位元，
	 * 將左移所空出的位元補上1，如1110 1111換成整數為-16
	 *
	 */
	}

}
