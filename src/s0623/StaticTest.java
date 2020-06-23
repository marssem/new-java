package s0623;

public class StaticTest {
	static String str ; //static이라서 초기값이 없어도 초기화 해줌.
	static int num;
	
	public static void main(String[] args) {//해당 class의 main메소드를 읽을 때 static을 같이 읽어서 초기화 시켜준다.
		System.out.println(num);
		int num = 3;
		StaticTest num1 = new StaticTest();
		System.out.println(num1);
		
		StaticTest st2 = new StaticTest();
		System.out.println(st2);
		
		
		
		
		
	}

}
