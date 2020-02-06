package java_02_06;


class Point {
	
	int x = 2;
	int y = 3;
	
	int getSum() {
		return x + y;
	}
	
}


class Point3D extends Point {
	
	int z = 5;
	
	int getSum() {
		return super.getSum() + z;
	}
	
}


public class edu {
	public static void main(String[] args) {
	
	Point 	addition 	= new Point();
	Point3D add 		= new Point3D();
	
	System.out.println(addition.getSum());
	System.out.println(add.getSum());
		
	}
}

