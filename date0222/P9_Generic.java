package date0222;

public class P9_Generic {

	public static void main(String[] args) {
		Cmember<Integer> obj1 = new Cmember<Integer>();
		Cmember<String> obj2 = new Cmember<String>();
		Cmember<Double> obj3 = new Cmember<Double>();
		
		obj1.setId(1111);
		obj2.setId("Hello");
		obj3.setId(1.123);
		obj1.show();
		obj2.show();
		obj3.show();
		
	}

}

class Cmember<T>{
	private T id;
	public void setId(T value) {
		id = value;
	}
	public void show() {
		System.out.println("id ="+id);
	}
}