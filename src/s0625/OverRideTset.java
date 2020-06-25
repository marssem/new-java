package s0625;
class Test{
	String name;
	int age;
	public void run() {
		System.out.println("달리는 거~~");
	}
	public String toString() {
		return age+name;
	}
}
class SubTest extends Test{
	
	
	
	public void run() {
		System.out.println("힘들다. 걷자.");
	}
	public String toString() {
		
		return name+age;
	}
}
public class OverRideTset {

	public static void main(String[] args) {
		Test st = new SubTest();
		st.run();
		st.name = "하하";
		st.age= 23;
		
		
		System.out.println(st);
	}
}
