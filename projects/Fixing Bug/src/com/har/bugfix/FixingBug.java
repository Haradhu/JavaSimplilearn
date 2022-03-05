package com.har.bugfix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixingBug {

	public static void main(String[] args) {
		System.out.println("\t*****Welcome **** \n");
		optionsSelection();
	}

	private static void optionsSelection() {
		String[] arr = { "1. I wish to review my expenditure", "2. I wish to add my expenditure",
				"3. I wish to delete my expenditure", "4. I wish to sort the expenditures",
				"5. I wish to search for a particular expenditure", "6. Close the application" };
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
		}
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> cost = new ArrayList<Integer>();
		cost.add(1000);
		cost.add(2000);
		cost.add(3000);
		cost.add(4000);
		cost.add(5000);
		cost.addAll(arrlist);
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int options;
		do {
			options = sc.nextInt();
			switch (options) {
			case 1:
				System.out.println("Your saved data are listed below: \n");
				System.out.println(cost + "\n");

				break;
			case 2:
				System.out.println("Enter the value to add your data: \n");
				int value = sc.nextInt();
				cost.add(value);
				System.out.println("Your value is updated\n");
				cost.addAll(arrlist);
				System.out.println(cost + "\n");
				break;
			case 3:
				System.out.println(
						"Delete all your data! \nConfirm again by selecting the same option...\n");
				int con_choice = sc.nextInt();
				if (con_choice == options) {
					cost.clear();
					System.out.println(cost + "\n");
					System.out.println("All your data's are erased!\n");
				} else {
					System.out.println("Oops... try again!");
				}
				break;
			case 4:
				sortExpenses(cost);

				break;
			case 5:
				searchExpenses(cost);

				break;
			case 6:
				closeApp();
				break;
			default:
				System.out.println("You have made an invalid choice!");
				break;
			}
		} while (options != 6);

	}

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
		Scanner searchScanner = new Scanner(System.in);
		System.out.println("Enter the data you need to search:\t");
		int searchNum = searchScanner.nextInt();
		System.out.println(arrayList.contains(searchNum) ? "Found your cost: " + searchNum
				: "Sorry data not found , Please try again.");

	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}