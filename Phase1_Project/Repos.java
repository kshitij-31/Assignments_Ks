package com.firstProject;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Repos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/Hp/Desktop/SmlProject/main");
		f.mkdirs();// create a folder in SmlProject folder of desktop
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n========Lockedme.com Prototype=========");
			System.out.println("========Features are specified =========\n");
			System.out.println("1. To arrange files in ascending order.\n");
			System.out.println("2. Choose the given options reagrding to their operation.\n");
			System.out.println("3. Terminate  the  Program\n");
			System.out.println("======Choose your option======  \n");

			int option = sc.nextInt();
			switch (option) {

			case 1:
				File arr[] = f.listFiles();
				Arrays.sort(arr);

				for (int i = 0; i < arr.length; i++)
					System.out.println(arr[i]);
				break;

			case 2:
				Boolean t = true;
				while (t) {
					System.out.println("+++++Choose your options regarding your choices+++++\n");
					System.out.println("\nOption 1 : Option to add a file to the application.");
					System.out.println("Option 2 : Option to delete a file from the application. ");
					System.out.println("Option 3 : Option to search a file from the application.");
					System.out.println("Option 4 : Option to get back to the main menu.");

					int option1 = sc.nextInt();

					switch (option1) {
					case 1:
						// File f = new File("/Users/Hp/Desktop/Project/main"); 
						// To add your file
						System.out.println("Enter a file name");
						String s1 = sc.next();
						if (new File(f, s1).exists()) {
							System.out.println("This file already exist.\nTry anyother name for your file....");
						} else {
							File folder = new File(f, s1);
							folder.mkdir();
							if (new File(f, s1).exists()) {
								System.out.println("Your file added successfully!!!");
							}
						}

						break;

					case 2:
						//To delete your file.
						System.out.println("Enter a file name");
						String f_name = sc.next();
						boolean old_f = new File(f, f_name).exists();
						System.out.println(old_f);
						if (old_f == true) {
							File new_f = new File(f, f_name);
							new_f.delete();
							System.out.println("File successfully deleted");
						} else {
							System.out.println("File does not exist");
						}
						// new_f is the new folder
						break;

					case 3:
						//To search your file.
						System.out.println("Enter the keyword to be searched.");
						

						try {
							String key = sc.next();
							File a1[] = f.listFiles();
							for (int i = 0; i < a1.length; i++) {

								if (a1[i].getName().startsWith(key)) {
									System.out.println(" Here is your file at location : " + a1[i]);

								}
							}
						}

						catch (Exception e) {e.printStackTrace();
							System.out.println("Invalid file");
							

						}

						break;

					case 4:
						//Get back to the main menu

						t = false;
						break;

					default:
						//In case if user input is invalid..
						try {
						System.out.println("Incorrect value please retry...");}
						
						catch (Exception e) {e.printStackTrace();
						
						}

					}

				}
				break;

			case 3:
				//To close the Program
				System.out.println("=========Program Terminated Successfully========");
				System.exit(0);

			default:
				//For making valid choice
				System.out.println("Invalid choice.\nPlease make a valid choice...\n");
				break;

			}
		}
	}
}
