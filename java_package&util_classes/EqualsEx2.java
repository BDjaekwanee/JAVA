class Person {
	long id;
	
	public boolean equals(Object obj) {
		if (obj instanceof Person)
			return id == ((Person)obj).id;
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}

class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(970128123123L);
		Person p2 = new Person(970128123123L);
		
		if(p1 == p2)
			System.out.println("p1과 p2는 같은 주소값입니다.");
		else
			System.out.println("p1과 p2는 다른 주소값입니다.");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2의 값은 같습니다.");
		else
			System.out.println("p1과 p2의 값은 다릅니다.");
	}
}