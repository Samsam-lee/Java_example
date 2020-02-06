package example;

public class Ex {
	public static void main(String[] args) {
		
		
//	Americano cafe = new Americano(2);
//	
//	JClass eat = new JClass();
//	eat.printInfo();
	
	comInfo c = new comInfo();
	c.printName();
	c.printSuperName();
	c.printDoubleSuperName();
	
	}
}

//class Americano {
//	int price = 2500;
//	
//	Americano(){
//		System.out.println("생성자호출");
//		this.printPrice();
//	}
//	
//	Americano(int quantity){
//		this.price = this.price * quantity;
//		this.printPrice();
//	}
//	
//	void printPrice(){
//		System.out.println("아메리카노의 가격은 " + this.price + "입니다.");
//	}
//	
//	
//}
//
//
//class JClass{
//	int takowasa = 10;
//	
//	void printInfo() {
//		int takowasa = 18;
//		
//		System.out.println(this.takowasa);
//		System.out.println(takowasa);
//	}
//}


class College{
	String name = "College";
}

class YJCollege extends College{
	String name = "YJCollege";
}

class comInfo extends YJCollege{
	String name = "comInfo";
	
	void printName() {
		System.out.println(name);
	}
	
	void printSuperName() {
		System.out.println(super.name);
	}

	void printDoubleSuperName() {
		System.out.println(((College)this).name);
	}
}





