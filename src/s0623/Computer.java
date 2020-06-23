package s0623;

public class Computer {
	private String cpu;
	private int ram;
	private String board;
	Computer(String cpu, int ram, String board){// java에서 파란 글씨는 멤버 변수를 말함.
		this.cpu = cpu;
		this.ram = ram;
		this.board = board;
	}
	void printInfo() {
		System.out.println("CPU :"+this.cpu);
		System.out.println("RAM :"+ram+"G");
		System.out.println("Main Board :"+ board);
	}
}
