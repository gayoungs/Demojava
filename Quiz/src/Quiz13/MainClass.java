package Quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Shape circle = new Circle ("원",10);
		
		System.out.println(circle.getArea());
		System.out.println(circle.getName());
		
		Shape rect = new Rect("정사각형",5);
		
		System.out.println(rect.getArea());
		System.out.println(rect.getName());
	}
}
