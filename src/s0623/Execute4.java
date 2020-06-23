package s0623;

import java.util.Random;

public class Execute4 {

	public static void main(String[] args) {
		Cat[] cats = new Cat[20];//방을 두 개를 만든 것이지 두 번 실행을 한 것이 아니다.
	
		for(int i=0;i<cats.length;i++) {
			cats[i] = new Cat();//주체가 사라지기 전까지 사라지지 않는다.
			cats[i].setName("고양이"+i);
			cats[i].setAge(i);
		
		}
		
		for(Cat cat:cats) {
			System.out.println(cat);
		}
		}
		
	}

