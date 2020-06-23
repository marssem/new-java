package s0623;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
	int[] nums = new int[6];
	Random r = new Random();
	int a;
	for(int i=0;i<nums.length;i++) {
		nums[i] = r.nextInt(6)+1;
		for(int j=i-1;j>=0;j--) {
			if(nums[j]==nums[i]) {
				i--;
			}
		}
	}
	for(int i=0;i<nums.length;i++) {
		a = nums[i];
		System.out.println((i+1)+"번째 : "+nums[i]);
		
	}
	}
}//
