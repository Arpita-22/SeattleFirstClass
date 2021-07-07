package org.perscholas.advancedIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesPlayGround {

	public static void main(String[] args) throws IOException {
		File newFile = null;
		File newFile1 = null;
		File newFile2 = null;
		File newFile3 = null;
		File newFile4 = null;
		File newFile5 = null;
		File newFile6 = null;
		File playGround = new File("/Users/arpita/Desktop/PlayGround");
		
		System.out.println(playGround.isDirectory());
		
		System.out.println(playGround.getAbsolutePath());
		new File(playGround.getAbsolutePath() + "/ParkOne").mkdir();
		File parkOne = new File("/Users/arpita/Desktop/PlayGround/ParkOne");
		newFile = new File(parkOne.getAbsolutePath() + "/Emma.txt");
		newFile.createNewFile();
		newFile = new File(parkOne.getAbsolutePath() + "/Olivia.txt");
		newFile.createNewFile();
		
		System.out.println(newFile.getName());
		
		new File(playGround.getAbsolutePath() + "/ParkThree").mkdir();
		File parkThree = new File("/Users/arpita/Desktop/PlayGround/ParkThree");
		newFile1 = new File(parkThree.getAbsolutePath() + "/Ethan.txt");
		newFile1.createNewFile();
		newFile2 = new File(parkThree.getAbsolutePath() + "/Liam.txt");
		newFile2.createNewFile();
		
		System.out.println(newFile.getName());
		
		new File(playGround.getAbsolutePath() + "/ParkTwo").mkdir();
		File parkTwo = new File("/Users/arpita/Desktop/PlayGround/ParkTwo");
		newFile3 = new File(parkTwo.getAbsolutePath() + "/Aiden.txt");
		newFile3.createNewFile();
		newFile4 = new File(parkTwo.getAbsolutePath() + "/Ava.txt");
		newFile4.createNewFile();
		newFile5 = new File(parkTwo.getAbsolutePath() + "/Logan.txt");
		newFile5.createNewFile();
		newFile6 = new File(parkTwo.getAbsolutePath() + "/Mia.txt");
		newFile6.createNewFile();
		
		System.out.println(newFile.getName());
		
		
		Files.move(Paths.get(newFile6.getPath()), 
				Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + (newFile6.getName())), 
				StandardCopyOption.REPLACE_EXISTING);
		
		Files.move(Paths.get(newFile5.getPath()), 
				Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + (newFile5.getName())), 
				StandardCopyOption.REPLACE_EXISTING);
		
		Files.move(Paths.get(newFile4.getPath()), 
				Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + (newFile4.getName())), 
				StandardCopyOption.REPLACE_EXISTING);
		
		Files.move(Paths.get(newFile3.getPath()), 
				Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + (newFile3.getName())), 
				StandardCopyOption.REPLACE_EXISTING);
		
		Files.move(Paths.get(newFile2.getPath()), 
				Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + (newFile2.getName())), 
				StandardCopyOption.REPLACE_EXISTING);
		
		Files.move(Paths.get(newFile1.getPath()), 
				Paths.get(playGround.getAbsolutePath() + "/ParkOne/" + (newFile1.getName())), 
				StandardCopyOption.REPLACE_EXISTING);
		
		
		

	}

}
