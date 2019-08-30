package assignment01;

public class SimpleDateTester {
	public static void main(String[] args) {

		SimpleDate date1 = SimpleDate.of(2000,3,3);
		SimpleDate date2 = SimpleDate.of(2000, 3, 25);
		SimpleDate date3 = SimpleDate.of(2000,3,1);
	
		System.out.println(date1.before(date2));
		System.out.println("should print true");

		System.out.println(date1.before(date3));
		System.out.println("should print false");
	}
}
