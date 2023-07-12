package ObjectClass;

public class Test extends Sample {

	public void test1() {
		System.out.println("incomplet method");
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Sample.test();
		t1.test1();
		t1.test2();
	}
}
