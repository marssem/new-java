package homework;
class Stone{
	 int size;
		
		void big() {
			System.out.println(size);
		}
	
}
public class Rock extends Stone{
	void big() {
		System.out.println(size+"m");
	}
	public static void main(String[] args) {
	Rock r = new Rock();
	r.size =  20;
	r.big();
		
	}
}
