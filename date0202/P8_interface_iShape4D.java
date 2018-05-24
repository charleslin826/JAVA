package date0202;

public class P8_interface_iShape4D {

	public static void main(String[] args) {
		OK oo = new OK(2.0);  //�ǤJ�b�|�Ȩ�OK���غc������radius�����ܼ�
		oo.setColor("Green"); //�ǤJ"Green"��setColor��k����color�����ܼ�
		oo.area();  //�p��(radius * radius *pi)�ꭱ�n �åB�L�X��

	}

}

interface iShape4D{
	final double pi=3.14;
	abstract void setColor(String str);
}

interface iShape5D extends iShape4D{  //5D�����~��4D����
	abstract void area();
}



class OK implements iShape5D{  //OK�~��5D(��M�]�t4D)�����̪������P��H��k

	double radius;
	String color;
	
	public OK(double r) { //�غc���Q����ɡA�]�w�b�|
		radius=r;  //this.radius�N�O��ܨ��Τ��Ϊ������ܼơA���B�]�i�ٲ�this.
	}
	@Override
	public void setColor(String str) {  //����k�æb4D interface���A�Y���ѨS�g�����oı�b����
		color=str;
		
	}

	@Override
	public void area() {				//����k�æb5D interface���A�Y���ѨS�g�����oı�b����
		// TODO Auto-generated method stub
		System.out.println("Color ="+ this.color);
		System.out.println("Area ="+ radius * radius *pi);
	}
	
}