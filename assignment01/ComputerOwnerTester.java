package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person person1 = new Person("John", "Johnson", "123456789", new DateAndPlaceOfBirth(2000,1,2,"Binghamton", "NY", "USA"), new StreetUSAddress("123 Main St","", "Binghamton", "NY", "11735"));
		ComputerOwner cpuOwner1 = new ComputerOwner(person1);

		cpuOwner1.addComputer(new Computer("Dell", "intel i5", 8, 500, true, 1000.00));
		cpuOwner1.addComputer(new Computer("HP", "intel i7", 16, 1500, false, 2000.00));
		cpuOwner1.addComputer(new Computer("Lenovo", "AMD", 4, 250, true, 500.00));
		cpuOwner1.addComputer(new Computer("Asus", "AMD", 32, 2000, false, 1500));

		System.out.println(cpuOwner1);
		
		cpuOwner1.removeComputer(0);
		cpuOwner1.removeComputer(0);

		System.out.println(cpuOwner1);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println


		Person person12 = new Person("John", "Johnson", "123456789", new DateAndPlaceOfBirth(2000,1,2,"Binghamton", "NY", "USA"), new StreetUSAddress("123 Main St", "", "Binghamton", "NY", "11735"));
		ComputerOwner cpuOwner12 = new ComputerOwner(person12);

		cpuOwner12.addComputer(new Computer("Dell", "intel i5", 8, 500, true, 1000.00));
		cpuOwner12.addComputer(new Computer("HP", "intel i7", 16, 1500, false, 2000.00));
		cpuOwner12.addComputer(new Computer("Lenovo", "AMD", 4, 250, true, 500.00));
		cpuOwner12.addComputer(new Computer("Asus", "AMD", 32, 2000, false, 1500));

		output.println(cpuOwner12);
		
		cpuOwner12.removeComputer(0);
		cpuOwner12.removeComputer(0);

		output.println(cpuOwner12);

		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
