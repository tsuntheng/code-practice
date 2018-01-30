
public class RectangleClient {
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(2,5,8,10);
		System.out.println(rect1);
		
		if (rect1.contains(5,6)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}

