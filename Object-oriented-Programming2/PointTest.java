class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y: " +y;
	}
}

class Point3D extends Point {
	int z;	
	
	Point3D(int x, int y, int z) {
		// super();  [컴파일러가 자동 생성해줌 근데? Point()는 부모에 없음. 컴파일 에러] 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : " + x + ", y: " +y + "z : " + z;
	}
}