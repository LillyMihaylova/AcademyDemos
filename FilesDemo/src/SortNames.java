import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {

		String names = "Names.txt";
		String sortedNames = "SortedNames.txt";
		ArrayList<String> fileNames = new ArrayList<>();
		Scanner fileReader = null;
		PrintStream fileWriter = null;
	
		try {
			fileReader = new Scanner(new File(names));

			while (fileReader.hasNext()) {
				String name = fileReader.next();
				fileNames.add(name);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error! File " + names + " not found!");
		} finally {
			fileReader.close();
		}

		fileNames.sort(null);

		try {
			fileWriter = new PrintStream(sortedNames, "UTF-8");
			for (int i = 0; i < fileNames.size(); i++) {
				fileWriter.println(fileNames.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error! File " + sortedNames + " not found!");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error! Unsupported Encoding!");
		} finally {
			fileWriter.close();
		}
	}
}
