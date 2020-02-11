package mondai3;

public class BaseClass {

	int myNum;
	
	protected BaseClass(){
		myNum++;
	}
	
	protected void printMyNum() {
		System.out.println(myNum);
	}
	
	int getNum() {
		return myNum;
	}
	
//	float getNum() {
//		return myNum;
//	}
	
}
