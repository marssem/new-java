package s0625;

import java.util.ArrayList;
import java.util.List;

public class MInNum {
public static void main(String[] args) {
	List<Integer> numList = new ArrayList<>();
	numList.add(110);
	numList.add(120);
	numList.add(100);
	numList.add(170);
	numList.add(15);
	int min = 0;
	for(int i = 0;i<numList.size();i++) {
		if(i==0|| min>numList.get(i)) {
			min = numList.get(i);
		}
	}
}
}
