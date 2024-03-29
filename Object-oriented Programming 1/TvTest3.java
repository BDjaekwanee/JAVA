class Tv {
	String color;
	boolean power;
	int channel;
	
	void power()       {power = !power;}
	void channelUp()   { ++channel;}
	void channelDown() { --channel;}
}

class TvTest3 {
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		
		t2 = t1; // t1이 바라보고 있는 주소값을 t2로 저장
		t1.channel = 7;
		
		System.out.println("t1 의 channel 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
	}
}