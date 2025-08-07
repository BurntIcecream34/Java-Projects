import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class MoneySim {
	static int pause(int sec)
	{
		try
		  {
			new Date();
			Thread.sleep(sec);   
			new Date();
		  }
		  catch(InterruptedException ex)
		  {
			  ex.printStackTrace();
		  }
		  return(0);
	}
	
	public static int checkBalance(int balance)
	{
		return(balance);
		// System.out.println(checkBalance(balance));
	}
	
	public static String checkCurrentJob(String job)
	{
		return(job);
		// System.out.println(check_CurrentJob(currentJob));
	}
	
	public static void jobProgress(String currentJob) {
		if (currentJob == "table"){
			System.out.println("Building table legs...");
			pause(4000);
			System.out.println("Carving table top...");
			pause(3000);
			System.out.println("Putting it all together...");
			pause(2000);
			System.out.println("Table is solid.");
		}
		else if (currentJob == "windows") {
			System.out.println("Spraying windows...");
			pause(3000);
			System.out.println("Wiping them clean...");
			pause(4000);
			System.out.println("Adding rain repellent...");
			pause(3000);
			System.out.println("Windows are now shiny.");
		}
		else {
			System.out.println("Adding gas...");
			pause(2000);
			System.out.println("Starting the lawn mower...");
			pause(2000);
			System.out.println("Mowing the lawn...");
			pause(6000);
			System.out.println("Grass has been cut.");
		}
	}
	
	public static double actionProgress(double balance, String action, double cash) {
		Scanner reader = new Scanner(System.in);
		if (action == "bank") {
			System.out.println("You cruise over to Buford's Banking Emporium...");
			pause(2000);
			System.out.println("You casually walk into the establishment...");
			pause(5000);
			System.out.println("You finally get to the clerk...");
			pause(1000);
			System.out.println("What would you like to do? (Check Current Balance, Deposit Some Stacks, Withdraw Some Buccarinos");
			String bankChoice = reader.nextLine();
			bankChoice = bankChoice.toLowerCase();
			if (bankChoice.equals("check current balance") || bankChoice.equals("check balance") || bankChoice.equals("balance")) {
				bankChoice = "balance";
			}
			else if (bankChoice.equals("deposit some stacks") || bankChoice.equals("deposit stacks") || bankChoice.equals("deposit")) {
				bankChoice = "deposit";
			}
			else {
				bankChoice = "withdraw";
			}
			if (bankChoice == "balance") {
				System.out.print("The clerk is looking up your account info.");
				pause(1000);
				System.out.print(".");
				pause(1000);
				System.out.println(".");
				pause(1000);
				System.out.println("Your current balance is: " + balance + " dollars");
			}
			else if (bankChoice == "deposit") {
				int quickInt = 0;
				System.out.println("How much would you like to deposit? ");
				quickInt = Integer.parseInt(reader.nextLine());
				System.out.print("Depositing the stacks");
				pause(1000);
				System.out.print(".");
				pause(1000);
				System.out.print(".");
				pause(1000);
				System.out.println(".");
				pause(1000);
				System.out.println("You have successfully deposited " + quickInt);
			}
			else {
				System.out.println("How much would you like to withdraw? ");
				double amount = Integer.parseInt(reader.nextLine());
				pause(1000);
				System.out.print("Pulling the money from your account");
				pause(1000);
				System.out.print(".");
				pause(1000);
				System.out.print(".");
				pause(1000);
				System.out.println(".");
				pause(1000);
				System.out.println("You now have " + amount + " buccarinos");
			}
		}
		else if (action == "batteries") {
			System.out.println("You drive to your house at record speed...");
			pause(3000);
			System.out.println("You quickly unlock the door...");
			pause(1000);
			System.out.println("You head inside and quickly hit the bed...");
			pause(4000);
			System.out.println("Batteries are now fully charged...");
		}
		else {
			System.out.print("Where would you like to eat? ");
			String place = reader.nextLine();
			System.out.print("");
			System.out.println("You drive on down to " + place);
			pause(3000);
			System.out.println("You roll through the drive-thru ");
			pause(2000);
			System.out.print("What would you like to eat? ");
			String foodChoice = reader.nextLine();
			System.out.println("");
			System.out.println("You wait for your " + foodChoice + "...");
			pause(2000);
			System.out.println("You finally get your " + foodChoice);
			pause(2000);
			System.out.println("");
			if (foodChoice.indexOf("burger") > -1) {
				balance -= 10;
			}
			else if (foodChoice.indexOf("salad") > -1) {
				balance -= 8;
			}
			else if (foodChoice.indexOf("chicken") > -1) {
				balance -= 9;
			}
			else if (foodChoice.indexOf("sandwhich") > -1) {
				balance -= 11;
			}
			else if (foodChoice.indexOf("noodles") > -1) {
				balance -= 8;
			}
			else if (foodChoice.indexOf("steak") > -1) {
				balance -= 15;
			}
			else {
				balance -= 6
			}
		}
		return(balance);
	}
	
	public static int Incoming(int made, String currentJob) {
		Random rand = new Random();
		int max = 0;
		int min = 0;
		if (currentJob == "table") {
			max = 150;
			min = 70; }
		else if (currentJob == "windows") {
			max = 50; 
			min = 10; }
		else { // grass
			max = 100; 
			min = 20; }
		made = (int) (Math.random() * (max - min)) + min;
		return(made);
	}
		
	public static void main (String[] args) {
		int balance = 0;
		int made = 0;
		System.out.println("Time to make some money");
		Scanner reader = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = reader.nextLine();
		System.out.println("Nice to meet you, " + name + ".");
		System.out.println("");
		pause(1500);
		System.out.print("Which job would you like to do first? (Make a Table, Clean Windows, Cut Grass) ");
		String currentJob = reader.nextLine();
		currentJob = currentJob.toLowerCase();
		if (currentJob.equals("table") || currentJob.equals("make a table") || currentJob.equals("make table")) {
			currentJob = "table";
			System.out.println("You get to make a table.");
			pause(2000);
		}
		else if (currentJob.equals("clean windows") || currentJob.equals("windows") || currentJob.equals("clean")) {
			currentJob = "windows";
			System.out.println("You get to clean some windows.");
			pause(2000);
		}
		else {
			currentJob = "grass";
			System.out.println("You get to cut some grass.");
			pause(2000);
		}
		jobProgress(currentJob);
		System.out.println("");
		pause(2000);
		System.out.println("Lets see how much you made...");
		System.out.print("Calculating");
		pause(1000);
		System.out.print(".");
		pause(1000);
		System.out.print(".");
		pause(1000);
		System.out.print(".");
		pause(2000);
		made = Incoming(0, currentJob);
		balance += made;
		System.out.println("You made a whopping " + made + " dollars"); // buccarinos, stacks, bills, bags full
		System.out.println("");
		pause(2000);
		System.out.println("What would you like to do now? (Go to bank, Recharge batteries, Get Food) ");
		String action = reader.nextLine();
		action = action.toLowerCase();
		if (action.equals("go to bank") || action.equals("go bank") || action.equals("bank")) {
			action = "bank";
			pause(2000);
		}
		else if (action.equals("recharge batteries") || action.equals("batteries") || action.equals("battery")) {
			action = "batteries";
			pause(2000);
		}
		else {
			action = "food";
			pause(2000);
		}
		actionProgress(balance, action);
	}
}

