package homework;
class Cow{
	 int weight;
		
		void big() {
			System.out.println(weight);
		}
}
public class Calf extends Cow{
	void big() {
		System.out.println(weight + "kg");		
	}
	public static void main(String[] args) {
		Calf c= new Calf();
		
		c.weight = 30;
		
		c.big();
	}
}
