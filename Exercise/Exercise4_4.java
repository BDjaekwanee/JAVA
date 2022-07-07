class Exercise4_4{
	public static void main (String[] args) {
		int sum = 0;
		int count = 0;
		
		for(int i =1;sum < 100; i++) {
			count = i;
			sum += Math.pow(-1, (count-1))*count;
			}
		System.out.println(count);
		}
}