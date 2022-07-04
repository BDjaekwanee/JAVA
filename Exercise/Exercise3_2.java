class Exercise3_2 { 
	public static void main(String[] args) { 
		int numOfApples = 123; // 사과의 개수 
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ( numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0)) ;

		System.out.println("필요한 바구니의 수 :"+numOfBucket);
	}
}
// numOfBucket에 들어갈 수식을 구하는 문
// [풀이: ::삼항연산자 사용:: 10으로 나누게 되면 1의 자리가 버려지기 때문에 버려지는 1의 자리가 0이였으면 0을 반환, 0보다 크면 1을 반환하게 해서 더함.]