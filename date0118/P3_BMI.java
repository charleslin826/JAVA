package date0118;

import java.util.Scanner;

public class P3_BMI {
	public static void main(String[] args) {
	double weight, height;
	double BMI;
	Scanner scn = new Scanner(System.in);
	System.out.println();
	System.out.print("Please input your Weight(kg):");
	weight = scn.nextDouble();
	System.out.print("Please input your Height(cm):");
	height = scn.nextDouble();
	BMI = (weight/(height/100.0*height/100.0));
	System.out.printf("BMI = %.1f \n",BMI);
	
	if(BMI > 24) {
	System.out.print("¤Ó­DÅo");
	};
	if(BMI < 18) {
	System.out.print("¤Ó½GÅo");
	};
	if(BMI>=18 && BMI <=24) {
	System.out.print("­è­è¦n");
	};	
	scn.close();
}
}
