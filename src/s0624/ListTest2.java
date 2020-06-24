package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
public static void main(String[] args) {
	List<String> strList = new ArrayList<>();
	strList.add("abc");
	strList.add("ㄱㄴㄷ");
	strList.add("아아아아");
	int idx = strList.indexOf("ㄱ ㄴㄷ");
	System.out.println(idx);
	
}
}
