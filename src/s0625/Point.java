package s0625;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		String pointStr;
		Scanner scan = new Scanner(System.in);
		System.out.print("니 점수 입력해봐~ :");
		
		pointStr = scan.nextLine();
		int point = -1;
		while(point<0) {
		try {
		point = Integer.parseInt(pointStr);
		}catch(Exception e) {
			System.out.println("입력하신 점수를 읽을 수 없습니다.");
			System.out.print("다시 입력 : ");
			pointStr = scan.nextLine();
		}
		}
		System.out.println("니 점수 : "+point);
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
