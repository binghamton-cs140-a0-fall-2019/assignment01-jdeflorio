package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		
		DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(2000, 3, 3, "Farmingdale", "NY", "USA");
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(2000, 3, 3, "Queens", "NY", "USA");
		DateAndPlaceOfBirth dob3 = new DateAndPlaceOfBirth(2001, 3, 3, "Miami", "FL", "USA");
		DateAndPlaceOfBirth dob4 = new DateAndPlaceOfBirth(1997, 5, 21, "Florence", "Italy");
		DateAndPlaceOfBirth dob5 = new DateAndPlaceOfBirth(1960, 8, 12, "Havana", "Cuba");

		System.out.println(dob1);
		System.out.println(dob2);
		System.out.println(dob3);
		System.out.println(dob4);
		System.out.println(dob5);

		System.out.println(dob1.olderThan(dob4));
		System.out.println("should print false");
		System.out.println(dob1.olderThan(dob3));
		System.out.println("should print true");

		System.out.println(dob1.youngerThan(dob4));
		System.out.println("should print true");
		System.out.println(dob1.youngerThan(dob3));
		System.out.println("should print false");

		System.out.println(dob1.hasSameBirthDateAs(dob2));
		System.out.println("should print true");
		System.out.println(dob1.hasSameBirthDateAs(dob4));
		System.out.println("should print false");

		System.out.println(dob1.hasSameBirthDayAs(dob3));
		System.out.println("should print true");
		System.out.println(dob1.hasSameBirthDayAs(dob4));
		System.out.println("should print false");


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		DateAndPlaceOfBirth dob12 = new DateAndPlaceOfBirth(2000, 3, 3, "Farmingdale", "NY", "USA");
		DateAndPlaceOfBirth dob22 = new DateAndPlaceOfBirth(2000, 3, 3, "Queens", "NY", "USA");
		DateAndPlaceOfBirth dob32 = new DateAndPlaceOfBirth(2001, 3, 3, "Miami", "FL", "USA");
		DateAndPlaceOfBirth dob42 = new DateAndPlaceOfBirth(1997, 5, 21, "Florence", "Italy");
		DateAndPlaceOfBirth dob52 = new DateAndPlaceOfBirth(1960, 8, 12, "Havana", "Cuba");

		output.println(dob12);
		output.println(dob22);
		output.println(dob32);
		output.println(dob42);
		output.println(dob52);

		output.println(dob12.olderThan(dob42));
		output.println("should print false");
		output.println(dob12.olderThan(dob32));
		output.println("should print true");

		output.println(dob12.youngerThan(dob42));
		output.println("should print true");
		output.println(dob12.youngerThan(dob32));
		output.println("should print false");

		output.println(dob12.hasSameBirthDateAs(dob22));
		output.println("should print true");
		output.println(dob12.hasSameBirthDateAs(dob42));
		output.println("should print false");

		output.println(dob12.hasSameBirthDayAs(dob32));
		output.println("should print true");
		output.println(dob12.hasSameBirthDayAs(dob42));
		output.println("should print false");


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
