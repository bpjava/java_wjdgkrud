package ch7;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D(1,2,3);

	}

}

class Point2{
	int x;
	int y;
	
	Point2(){}
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}

class Point3D extends Point2{
	int z;
	
	Point3D(int x, int y, int z){
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}
