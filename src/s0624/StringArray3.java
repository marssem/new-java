package s0624;

public class StringArray3 {
public static void main(String[] args) {
	String str = "1,21,32,5,7,20,31,22,16,15";
	String[] strs = str.split(",");
	int[] nums = new int[strs.length];
	
	for(int i=0;i<strs.length;i++) {
		nums[i] = Integer.parseInt(strs[i]);
		
		}
		for(int num:nums) {
			if(num%2==0) {
			System.out.println(num);
			}
		}
	}
	
	}
	
	


