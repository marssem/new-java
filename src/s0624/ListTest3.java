package s0624;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private String adr;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getAdr() {
		return adr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Person : name="+name+" age="+age+" adr ="+adr;
	}
}
public class ListTest3 {

	public static void main(String[] arge) {
		List<Person> pList = new ArrayList<>();
				
		pList.add(new Person());
		pList.add(new Person());
		pList.add(new Person());
		
		Person p =pList.get(1);
		p.setName("김");
		p.setAge(3);
		p.setAdr("ff");
		
		
		pList.get(2).setName("이");
		pList.get(2).setAge(6);
		pList.get(2).setAdr("ㅇㅇ");
		
		pList.get(0).setName("박");
		pList.get(0).setAge(7);
		pList.get(0).setAdr("ㅂㅂ");
		
		System.out.println(pList);
		
		
		
		
		
		
		
		
		
		
	}
}
