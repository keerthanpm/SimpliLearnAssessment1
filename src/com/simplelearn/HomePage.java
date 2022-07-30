package com.simplelearn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomePage {

	public static void menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("Application Name: LockedMe.com");
		System.out.println("Developer Name: Keerthan P M");
		System.out.println("------------------------------------------------------");
		while (true) {
			System.out.println("-------------Initial Menu-----------");
			System.out.println("Press 1.Retrive the file name in ascending order");
			System.out.println("Press 2.Perform Business Operation");
			System.out.println("Press 3.Close the application");
			Scanner sc = new Scanner(System.in);
			int n = 0;
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Enter Integer value");
			}
			if (n == 1) {
				FileHandling.ascending();
			} else if (n == 2) {
				while (true) {
					
					System.out.println("Opt correct option to perform required business operation");
					System.out.println("Press 1.Add file to menu folder");
					System.out.println("Press 2.delete file from menu folder");
					System.out.println("Press 3.serach file in menu folder");
					System.out.println("Press 4.return to Initial menu");
					int m = 0;
					try {
						m = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Enter Integer value");
					}

					if (m == 1) {
						FileHandling.addFile();
					} else if (m == 2) {
						FileHandling.deleteFile();
					} else if (m == 3) {
						{
							FileHandling.searchFile();
						}
					} else if (m == 4) {
						break;
					} else {
						System.out.println("You have entered wrong option");
						break;
					}
				}

			} else if (n == 3) {
				sc.close();
				System.out.println("Application  is closed");
				break;
			} else {
				System.out.println("You have entered wrong option. Please enter correct option");
			}
		}
	}
}
