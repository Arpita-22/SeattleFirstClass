package org.softwareDeveloperClubProjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftwareDeveloperClub {
	
	public SoftwareDeveloperClub(Scanner sc) {
		String location = "members.txt";
		File file = new File(location);
		List <ClubMember> list = new ArrayList<>();
//		List <String> list2 = new ArrayList<>();
		int num = 0;
		

		
		try {
			Scanner input = new Scanner(file);
			input.nextLine();
			while(input.hasNextLine()) {

				String [] cmArr = input.nextLine().split("\\*\\*");

				list.add(new ClubMember(cmArr[0], cmArr[1], cmArr[2], cmArr[3]));
				
			}

			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		
		while(num != 4){
			menu();
			num = sc.nextInt();
			switch(num) {
			case 1:
					for(ClubMember cm: list) {
//						System.out.printf("%-15s %-15s %-15s %-15s%n", cm.getName(), cm.getState(), cm.getCity(), cm.getFavoriteLanguage());
						System.out.println("Name: " + cm.getName());
						System.out.println("Location: " + cm.getCity() + "," + cm.getState());
						System.out.println("Favorite Language: " + cm.getFavoriteLanguage());
						System.out.println();

					}
					
				break;
				
			case 2:
				System.out.println("Remove members");
				list.remove(list.size() - 1);

				break;
				
			case 3:
				System.out.println("Add member");
				System.out.println("Please enter name:");
				String name = sc.next();
				System.out.println("Please enter city:");
				String city = sc.next();
				System.out.println("Please enter state:");
				String state = sc.next();
				System.out.println("Please enter favoriteLanguage:");
				String favoriteLanguage = sc.next();
				list.add(new ClubMember(name, city, state, favoriteLanguage));
				break;
				
			}
		}
		System.out.println("You quit!");
		


	}
	
	public void menu() {
		System.out.println("Please select from the following menu");
		System.out.println("1: Display Members");
		System.out.println("2: Remove Members");
		System.out.println("3: Add Member");
		System.out.println("4: Quit");
	
		
	}

}
