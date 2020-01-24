import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Club  {
	public static ArrayList<Members> member = new ArrayList<Members>();

	public static ArrayList<Members> getMembers() {
		return member;
	}

	public static void main(String[] args) {

		ArrayList<Members> m = new ArrayList<Members>();

		member.add(new Members("Jennifer", "Sung", 'F', "12-12-1990", "12", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Martin", "James", 'M', "05-05-1975", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Hasan", "Sung", 'F', "12-12-1991", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Tom", "Cat", 'F', "08-09-1991", "100", "Row Gardens", "Reading", "Berkshire", "RG23AT",
				"United Kingdom", " British"));
		member.add(new Members("Christy", "Sung", 'M', "12-12-1991", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Micky", "Mouse", 'F', "01-12-1981", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Micky", "White", 'F', "01-12-1994", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Minni", "Mouse", 'F', "01-12-1999", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Minni", "White", 'F', "01-12-1991", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Nicky", "White", 'M', "01-12-1971", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Rocky", "Moore", 'M', "01-12-1991", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Vinn", "Joyce", 'F', "01-12-1991", "100", "Row Gardens", "Reading", "Berkshire",
				"RG23AT", "United Kingdom", " British"));
		member.add(new Members("Jas", "Pal", 'M', "10-12-1980", "12", "Pearl st", "Mumbai", "Mumbai", "RG23AT", "India",
				"Indian"));
		member.add(new Members("Lebron", "James", 'M', "05-05-1972", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Kevin", "Durant", 'M', "05-05-1996", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Kevin", "Love", 'M', "05-05-1999", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Jimmy", "Butler", 'M', "05-05-1994", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Maya", "Moore", 'F', "05-05-1990", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Cynthia", "Cooper", 'F', "05-05-1994", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Lauren", "Jackson", 'F', "05-05-1985", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Paul", "George", 'M', "05-05-1981", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Chris", "Paul", 'M', "05-05-1994", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Laura", "Jane", 'F', "05-05-1995", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Paula", "Georgina", 'F', "05-05-1981", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));
		member.add(new Members("Christine", "Smith", 'F', "05-05-1962", "27 ", "Rosebank Gardens", "London", "London",
				"E35EE", "United Kingdom", "New Zealand"));

		String teamType, ageGroup;
		int teamSize;

			try {
			Scanner userInput = new Scanner(System.in);
			do {
				System.out.println("");
				System.out.println(
						"What kind of team would you like to create ? Enter 'male', 'female' or 'mixed' for the team type ");
				teamType = userInput.nextLine();

				if (!teamType.matches("mixed|male|female"))

				{
					System.out.println("Please enter valid inputs");
				}
			} while (!teamType.matches("mixed|male|female"));

			
			do {
				System.out.println(
						"Which age Group are you creating a team for ? Enter 'j' for junior or 's' for senior ");
				ageGroup = userInput.nextLine();
				if (!ageGroup.matches("j|s")) {
					System.out.println("Please enter valid inputs");
				}
			} while (!ageGroup.matches("j|s"));

			System.out.println("How many players would you like in the team ? ");
			teamSize = userInput.nextInt();

			Team team = new Team();
		
			try {
				team.createTeam(teamType, teamSize, ageGroup);
			} catch (Exception e) {
				System.out.println("There are not enough Members available to create a team of " + teamSize);
			}

		} catch (Exception e) {
			System.out.println("Please enter valid inputs");
		}
		
	}

}
