package homework;


class Tree {
	 String color;
	void big() {
		System.out.println("이 나무는"+color);
	}
	
}
public class Fruit extends Tree {
	public void big() {
		
		System.out.println("이 열매는 "+color);
	}
	public static void main(String[] args) {
	
	}
}