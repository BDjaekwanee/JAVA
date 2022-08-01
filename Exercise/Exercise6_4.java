class Exercise6_4 {
	public static void main(String args[]) {
		Students s = new Students();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
	}
}

class Students {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}
}
/*
236 / 3 → 78
236 / 3f → 78.666664
236 / 3f * 10 → 786.66664
236 / 3f * 10 + 0.5 → 787.16664
(int)(236 / 3f * 10 + 0.5) → (int)787.16664 → 787
(int)(236 / 3f * 10 + 0.5) / 10 → 78
(int)(236 / 3f * 10 + 0.5) / 10f → 78.7
*/