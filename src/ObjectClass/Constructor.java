package ObjectClass;

public class Constructor {

	int a;
	int id;
	String strs;
	int rollno;
	
	public Constructor() {    //no argument constructor
		
		 a=15;
		
		 
		
	}
	
	public Constructor(int a, int b, String str) {    //parametresid constructor
		
		id=a;
		rollno=b;
		strs=str;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(obj.a);
		Constructor obj1 = new Constructor(25,45,"yogesh");
		System.out.println(obj1.id);
		System.out.println(obj1.rollno);
		System.out.println(obj1.strs);
	}
}
