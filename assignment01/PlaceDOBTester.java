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

		System.out.println(dob12);
		System.out.println(dob22);
		System.out.println(dob32);
		System.out.println(dob42);
		System.out.println(dob52);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
