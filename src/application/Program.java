package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<String> listUser = new HashSet<>();
		
		String path = "C:\\pastaarquivo\\log.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] i = line.split(" ");
				if (!listUser.contains(i[0])) {
					listUser.add(i[0]);
				}
				line = br.readLine();
			}
			
			System.out.println(listUser.size());
			
		} catch (IOException e) {
			System.out.println("ERROR >>> " + e.getMessage());
		}
		
	}
	
	
}
