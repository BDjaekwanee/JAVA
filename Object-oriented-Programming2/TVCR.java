class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class VCR {
	boolean power;
	int counter = 0;
	void power() { power = !power;}
	static void play() {/*생략 */}
	void stop() {/*생략 */}
	void rew()  {/*생략 */}
	void ff()   {/*생략 */}
}

/* 다중상속이 안되기 때문에 포함관계로 작성 */

class TVCR extends TV {
	VCR vcr = new VCR();
	
	void play() {
		VCR.play(); // static 은 클래스명 쓰고 함수 
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}