package s0624;

public class StringArray2 {
public static void main(String[] args) {
	String str = "111,222,333,444,555,666,777,888,";
	String[] strs = str.split(",");
	int[] nums = new int[strs.length];
	for(int i=0;i<strs.length;i++) {
		nums[i] = Integer.parseInt(strs[i]);
	}
	for(int num:nums) {
		System.out.println(num);
	}
}
}
