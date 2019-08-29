package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress address1 = new StreetUSAddress("123 Main St", "456 Main St", "Farmingdale", "NY", "11735");
		StreetUSAddress address2 = new StreetUSAddress("123 Street Ln", "", "Townsville", "NY", "98765");

		System.out.println(address1);
		System.out.println(address2);

		try(var output =new PrintWriter(new FileOutputStream(
				    new File("output.txt"), true /* true means append to file */))) {
				output.println("\nTESTS FOR StreetUSAddress.java:");
	
			//Copy all your lines above, add an extra "2" to every variable name	
			// and replace every System.out.print or System.out.println
			// by output.print or output.println

			StreetUSAddress address12 = new StreetUSAddress("123 Main St", "456 Main St", "Farmingdale", "NY", "11735");
			StreetUSAddress address22 = new StreetUSAddress("123 Street Ln", "", "Townsville", "NY", "98765");

			output.println(address12);
			output.println(address22);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}
