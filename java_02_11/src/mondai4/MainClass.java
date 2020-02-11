package mondai4;

abstract class BaseClass {
	static int num;
	BaseClass() {
		System.out.println("1");
		num++;
	}
	
	abstract void printMyNum();
	abstract void divMyNum();
	
}


abstract class L1Class extends BaseClass {
	void printMyNum() {
		System.out.println(num);
	}
}

class L2Class extends L1Class {
	void divMyNum() {
		System.out.println(num/2);
	}
}


public class MainClass {
	public static void main(String[] args) {

//		L1Class c1 = new L1Class();
		L2Class c2 = new L2Class();
		
		c2.divMyNum();

	}
}
