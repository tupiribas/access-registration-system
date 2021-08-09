package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full: ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<User> listUser = new HashSet<>();

			String line = br.readLine();

			while (line != null) {
				String[] i = line.split(" ");

				String name = i[0];
				Date date = sdf.parse(i[1]);

				listUser.add(new User(name, date));
				line = br.readLine();
			}

			System.out.println("Total users: " + listUser.size());

		} catch (IOException e) {
			System.out.println("ERROR >>> " + e.getMessage());
		}
		sc.close();
	}
}
