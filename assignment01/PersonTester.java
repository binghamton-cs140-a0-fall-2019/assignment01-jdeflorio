package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {

		Person person1 = new Person("Bob", "Johnson", "012345678", new DateAndPlaceOfBirth(2000, 3, 3, "New York", "NY", "USA"), new StreetUSAddress("123 Main St", "", "CityVille", "NY", "12345"));

		System.out.println(person1);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		Person person12 = new Person("Bob", "Johnson", "012345678", new DateAndPlaceOfBirth(2000, 3, 3, "New York", "NY", "USA"), new StreetUSAddress("123 Main St", "", "CityVille", "NY", "12345"));

		output.println(person12);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
