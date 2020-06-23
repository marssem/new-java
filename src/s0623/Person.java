package s0623;

public class Person {
	
	private String name;
	private int age;
	private String adr;
	public String toString() {
		return "name :"+name+", "+"age :"+age+"adress :"+adr;
	}

	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getAdr() {
		return adr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	
	
}

