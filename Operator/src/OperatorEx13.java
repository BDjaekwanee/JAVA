class OperatorEx13 { 
      public static void main(String[] args) { 
			char c1 = 'a';

//			char c2 =  c1+1;           // 변수에 선언 되어 있기 때문에 c1+1 자체가 'b'가 되지 않음. int값이 출력됨.
			char c2 = 'a'+1;           // 라인 6 : 컴파일 에러없음

            System.out.println(c2); 
      } 
}