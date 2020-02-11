package mondai5;


class BaseClass {
	/*final*/int value;
	static int count = 1;
	
	private void setMyNum() {
		value = 18;
	}
	
	static {
		incValue();
	}
	
	static final void incValue() {
		count++;
	}
	
	BaseClass(String argString) {
		System.out.println(argString);
	}
	
	BaseClass() {
		System.out.println("hello");
	}
}

class L1Class extends BaseClass {
	String myMessage;
	int value = 218;
	
	L1Class() {
		super("Samsung lions");
		myMessage = "½ÃÇè ³¡";
		System.out.println("Samsung lions");
		
	}
	
	void printMessage() {
		System.out.println(myMessage);
	}
	
}


public class MainClass {
	public static void main(String[] args) {

		BaseClass c1 = new BaseClass();
		BaseClass c2 = new L1Class();
		
		System.out.println(c1.value);
		System.out.println(c2.value);
		
		//L1Class c3 = c1;
		

	}
}
