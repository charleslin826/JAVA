package date0110;

public class P1 {

	public static void main(String[] args) {
		// args �r�ꫬ�A���}�C  
		int num = 2; 
		double num2 = 1.1;
		char ch1;
		String school,student;
		ch1 ='A';
		school = "National Don-Hwa University -";
		student = "Charles";
		System.out.println("I have " + num + " dogs.");
		System.out.print(num);
		System.out.println("u baby "+ ch1);
		System.out.println(school + student);
		System.out.printf("I have %d friends. \n", num);
		System.out.printf("I have %f dollars. \n", num2);
		// %f �O�B�I��
		System.out.printf("I have %s 's account.%n", student);
		// %n �P \n ���O =�U�@��
		System.out.printf("Java %s%d %7.3f ��%n", "SE", 8, 1.8005 );
		//%7.3f �N��O�C�Ӧ��(�����|�۰ʥH�Ů���)�A�|�ˤ��J��p���I�ܲĤT��
		System.out.printf("a = %5.1f, b = %5.1f\n", 2.5, 2.6);
		System.out.format("a = %5.1f, b = %5.1f\n", 2.5, 2.6);
		//�H�W���۵�
		System.out.println(args[0]+" - "+args[1]+" - "+args[0]);
		//�n�qrun > run configuration > Arguments > Program arguments ���J�o��ӰѼơA�n���J�@�ʭӤ]OK
		
	}

}
