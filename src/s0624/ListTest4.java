package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
	
	static void doPerson(Person p) {
		p = new Person();
		p.setName("aa");
	}
public static void main(String[] args) {
	Person p1 = new Person();
	doPerson(p1);
	System.out.println(p1);
	/*
	List<Person> pList = new ArrayList<>();
	Person p = new Person();
	pList.add(p);
	p.setName("박민수");
	p = new Person(); //p를 바라보는 주소 값이 달라진다.
	System.out.println(pList.get(0));
	*/
	/*
	Person p1 = new Person();
	Person p2 = p1;
	System.out.println(p1==p2);
	p2.setName("하하");
	System.out.println(p1.getName());
	System.out.println(p2.getName());
	p2 = new Person();
	System.out.println(p2.getName());
	System.out.println(p1.getName());
	*/
	
}
}
