class OperatorEx6 { 
      public static void main(String[] args) { 
            byte a = 10; 
            byte b = 20; 
            byte c = a + b; //컴파일 에러남 why? 타입이 byte 인데 사칙연산하면 int 타입으로 반환해줌. 

            System.out.println(c); 
      } 
} 