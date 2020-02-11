package mandai2;

class BaseClass {
	static int 	num;
	String		myName;
	
	BaseClass(String argName) {
		myName = argName;
		num++;
	}
}

class L1Class extends BaseClass {
	
	
	
	L1Class(String argName) {
		super(argName);
		
	}
	void printNum() {
		System.out.println(num);
	}
	void printName() {
		System.out.println(myName);
	}
	
}

public class MainClass {

	public static void main(String[] args) {

		String name = "";
		
		L1Class l1 = new L1Class(name);
		l1.printNum();
		l1.printName();

	}

}
