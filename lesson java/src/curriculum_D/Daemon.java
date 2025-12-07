package curriculum_D;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Daemon {
	public static void main(String[] args) {
		try {
			File file = new File("daemon_status.txt");
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try {
			FileWriter file = new FileWriter("daemon_status.txt");
			BufferedWriter writer = new BufferedWriter(file);

			writer.write(120);
			writer.newLine();
			writer.write(30);
			writer.newLine();
			writer.write(50);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
