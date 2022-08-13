import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(String.join("-", arr));

		StringJoiner sj = new StringJoiner("*","[","]"); // *로 구분하고 [ 와 ] 로 처음과 끝을 지정   
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}