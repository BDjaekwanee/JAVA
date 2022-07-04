class Exercise3_1 {
	public static void main (String[] args) {
		int  x = 2;
		int  y = 5;
		char c = 'A'; // A의 문자코드는 65
		
		System.out.println(1 + x << 33);
		// [풀이 : 산술연산 진행순서 왼쪽에서 오른쪽으로 진행한다. 1 + 2 계산 = 3 , 3 << 33 연산 이진번 11 이 110으로 됨]
		
		
		System.out.println(y >=5 || x <0 && x > 2);
		// [풀이 : true || false && false == true || false == true]

		
		System.out.println(y += 10 - x++);
		// [풀이 : 5 += 10 - 2   ::x값 2로 참조되고 x값 3으로 변환::]

		
		System.out.println(x+=2); 
		// [풀이 : 3으로 바뀐 x에 2 더하면 5]
		
		
		System.out.println(!('A' <= c && c <= 'Z'));
		// [풀이 : !(true && true) == !(true) == false
		
		
		System.out.println('C' - c);
		// [풀이 : ASCII 'C' - 'A' == 67 - 65 == 2]
		
		
		System.out.println('5' - '0');
		// [풀이 : ASCII '5' - '0' == 53 - 48 == 5]
		
		
		System.out.println(c+1);
		// [풀이 : 이항 연산자이기 때문에 int로 형변환 되어서 계산됨. 65 + 1 = 66]
		
		
		System.out.println(++c);
		// [풀이 : B 전위 증가기 때문에 참조와 동시에 값 증가, 단항 연산자기 때문에 '피연산자 스택(operand stack)'을 사용하지 않음']
		
		
		System.out.println(c++);
		// [풀이 : B 후위 증가기 때문에 이 프린트 문에서는 아직 증가 안됨. 프린트 되고나서 증가됨]
		
		
		System.out.println(c);
		// [풀이 : 후위 증가 잘 반영되었는지 확인]
	}
}