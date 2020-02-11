package mondai1;

class BaseClass {
	
	BaseClass() {
		System.out.println("1");
	}
	
	BaseClass(String argStr){
		System.out.println(argStr);
	}
	
	static {
		System.out.println("2");
	}
	
	{
		System.out.println("3");
	}
	
}

public class MainClass {

	public static void main(String[] args) {

		BaseClass b = new BaseClass("5");
		
	}

}
