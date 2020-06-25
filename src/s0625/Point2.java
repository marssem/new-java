package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("학생 몇 명? : ");
	int cnt = Integer.parseInt(scan.nextLine());
	List<Integer> intList = new ArrayList<>();
	int min =0;
	int max =0;
	int i=0;
	for(;i<cnt;i++) {
		System.out.print(i+"번째 학생 점수는? : ");
		intList.add(Integer.parseInt(scan.nextLine()));
	
	/*
	int min = 0;
	for(int i = 0;i<intList.size();i++) {
		if(i==0|| min>intList.get(i)) {
			min = intList.get(i);
			System.out.println(min);
		}
		int max = 0;
	}}
	*/	
	if(i==0|| min>intList.get(i)) {
		min = intList.get(i);
	}
	if(i==0 || max<intList.get(i)) {
		max = intList.get(i);
	}
	}
	System.out.println("가장 낮은 점수 : "+min);
	System.out.println("가장 높은 점수 : "+max);
		
	
}
}
