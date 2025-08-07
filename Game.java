import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class Game
{
	static String board(String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String player, String bot)
	{
		if (one == "a")
			System.out.print("   |");
		if (one == "bp")
			System.out.print(" " + player + " |");
		if (one == "bb")
			System.out.print(" " + bot + " |");
		if (two == "c")
			System.out.print("   |");
		if (two == "dp")
			System.out.print(" " + player + " |");
		if (two == "db")
			System.out.print(" " + bot + " |");
		if (three == "e")
			System.out.println("   "); //   |   |  
		if (three == "fp")
			System.out.println("  " + player + " ");
		if (three == "fb")
			System.out.println("  " + bot + " ");
		System.out.print("___|");  // skip 29-31
		System.out.print("___|");
		System.out.println("___"); //___|___|___
		if (four == "g")
			System.out.print("   |");
		if (four == "hp")
			System.out.print(" " + player + " |");
		if (four == "hb")
			System.out.print(" " + bot + " |");
		if (five == "i")
			System.out.print("   |");
		if (five == "jp")
			System.out.print(" " + player + " |");
		if (five == "jb")
			System.out.print(" " + bot + " |");
		if (six == "k")
			System.out.println("   "); //   |   |   
		if (six == "lp")
			System.out.println("  " + player + " ");
		if (six == "lb")
			System.out.println("  " + bot + " ");
		System.out.print("___|");  // skip 44-46
		System.out.print("___|");
		System.out.println("___"); //___|___|___
		if (seven == "m")
			System.out.print("   |");
		if (seven == "np")
			System.out.print(" " + player + " |");
		if (seven == "nb")
			System.out.print(" " + bot + " |");
		if (eight == "o")
			System.out.print("   |");
		if (eight == "pp")
			System.out.print(" " + player + " |");
		if (eight == "pb")
			System.out.print(" " + bot + " |");
		if (nine == "q")
			System.out.println("   "); //   |   |   
		if (nine == "rp")
			System.out.println("  " + player + " ");
		if (nine == "rb")
			System.out.println("  " + bot + " ");
		System.out.print("   |");  // skip 59-61
		System.out.print("   |");
		System.out.println("   "); //   |   |   
		return("word");
	}
	
	static int update_board(int choice)
	{
		if (choice == 1)
			return(2);
		return(3);
	}
		
	static String pick(String choice)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Choose your spot (1, 2, 3, 4, 5, 6, 7, 8, 9): ");
		choice = reader.nextLine();
		return choice;
	}
	
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
		
	public static void main(String[] args)
	{
		Random rand = new Random();
		int max = 10;
		int sec = 2000;
		
		// boolean for board placement
		String one = "a";
		String two = "c";
		String three = "e";
		String four = "g";
		String five = "i";
		String six = "k";
		String seven = "m";
		String eight = "o";
		String nine = "q";
		
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		String place = "0";
		String choice = pick(place);
		int move = Integer.parseInt(choice);
		if (move == 1)
			one = "bp";
		if (move == 2)
			two = "dp";
		if (move == 3)
			three = "fp";
		if (move == 4)
			four = "hp";
		if (move == 5)
			five = "jp";
		if (move == 6)
			six = "lp";
		if (move == 7)
			seven = "np";
		if (move == 8)
			eight = "pp";
		if (move == 9)
			nine = "rp";
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		pause(sec);
		boolean good = true;
		int bot_move = rand.nextInt(max);
		while (good)
		{
			bot_move = rand.nextInt(max);
			if (bot_move == 1)
			{
				if (!(one.equals("bp") || one.equals("bb")))
					good = false;
			}
			if (bot_move == 2)
			{
				if (!(two.equals("dp") || two.equals("db")))
					good = false;
			}
			if (bot_move == 3)
			{
				if (!(three.equals("fp") || three.equals("fb")))
					good = false;
			}
			if (bot_move == 4)
			{
				if (!(four.equals("hp") || four.equals("hb")))
					good = false;
			}
			if (bot_move == 5)
			{
				if (!(five.equals("jp") || five.equals("jb")))
					good = false;
			}
			if (bot_move == 6)
			{
				if (!(six.equals("lp") || six.equals("lb")))
					good = false;
			}
			if (bot_move == 7)
			{
				if (!(seven.equals("np") || seven.equals("nb")))
					good = false;
			}
			if (bot_move == 8)
			{
				if (!(eight.equals("pp") || eight.equals("pb")))
					good = false;
			}
			if (bot_move == 9)
			{
				if (!(nine.equals("rp") || nine.equals("rb")))
					good = false;
			}
		}
		good = true;
		if (bot_move == 1)
			one = "bb";
		if (bot_move == 2)
			two = "db";
		if (bot_move == 3)
			three = "fb";
		if (bot_move == 4)
			four = "hb";
		if (bot_move == 5)
			five = "jb";
		if (bot_move == 6)
			six = "lb";
		if (bot_move == 7)
			seven = "nb";
		if (bot_move == 8)
			eight = "pb";
		if (bot_move == 9)
			nine = "rb";
		System.out.println("The bot chose space " + bot_move);
		pause(sec);
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		place = "0";
		choice = pick(place);
		move = Integer.parseInt(choice);
		if (move == 1)
			one = "bp";
		if (move == 2)
			two = "dp";
		if (move == 3)
			three = "fp";
		if (move == 4)
			four = "hp";
		if (move == 5)
			five = "jp";
		if (move == 6)
			six = "lp";
		if (move == 7)
			seven = "np";
		if (move == 8)
			eight = "pp";
		if (move == 9)
			nine = "rp";
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		pause(sec);
		while (good)
		{
			bot_move = rand.nextInt(max);
			if (bot_move == 1)
			{
				if (!(one.equals("bp") || one.equals("bb")))
					good = false;
			}
			if (bot_move == 2)
			{
				if (!(two.equals("dp") || two.equals("db")))
					good = false;
			}
			if (bot_move == 3)
			{
				if (!(three.equals("fp") || three.equals("fb")))
					good = false;
			}
			if (bot_move == 4)
			{
				if (!(four.equals("hp") || four.equals("hb")))
					good = false;
			}
			if (bot_move == 5)
			{
				if (!(five.equals("jp") || five.equals("jb")))
					good = false;
			}
			if (bot_move == 6)
			{
				if (!(six.equals("lp") || six.equals("lb")))
					good = false;
			}
			if (bot_move == 7)
			{
				if (!(seven.equals("np") || seven.equals("nb")))
					good = false;
			}
			if (bot_move == 8)
			{
				if (!(eight.equals("pp") || eight.equals("pb")))
					good = false;
			}
			if (bot_move == 9)
			{
				if (!(nine.equals("rp") || nine.equals("rb")))
					good = false;
			}
		}
		good = true;
		if (bot_move == 1)
			one = "bb";
		if (bot_move == 2)
			two = "db";
		if (bot_move == 3)
			three = "fb";
		if (bot_move == 4)
			four = "hb";
		if (bot_move == 5)
			five = "jb";
		if (bot_move == 6)
			six = "lb";
		if (bot_move == 7)
			seven = "nb";
		if (bot_move == 8)
			eight = "pb";
		if (bot_move == 9)
			nine = "rb";
		System.out.println("The bot chose space " + bot_move);
		pause(sec);
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		place = "0";
		choice = pick(place);
		move = Integer.parseInt(choice);
		if (move == 1)
			one = "bp";
		if (move == 2)
			two = "dp";
		if (move == 3)
			three = "fp";
		if (move == 4)
			four = "hp";
		if (move == 5)
			five = "jp";
		if (move == 6)
			six = "lp";
		if (move == 7)
			seven = "np";
		if (move == 8)
			eight = "pp";
		if (move == 9)
			nine = "rp";
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		pause(sec);
		while (good)
		{
			bot_move = rand.nextInt(max);
			if (bot_move == 1)
			{
				if (!(one.equals("bp") || one.equals("bb")))
					good = false;
			}
			if (bot_move == 2)
			{
				if (!(two.equals("dp") || two.equals("db")))
					good = false;
			}
			if (bot_move == 3)
			{
				if (!(three.equals("fp") || three.equals("fb")))
					good = false;
			}
			if (bot_move == 4)
			{
				if (!(four.equals("hp") || four.equals("hb")))
					good = false;
			}
			if (bot_move == 5)
			{
				if (!(five.equals("jp") || five.equals("jb")))
					good = false;
			}
			if (bot_move == 6)
			{
				if (!(six.equals("lp") || six.equals("lb")))
					good = false;
			}
			if (bot_move == 7)
			{
				if (!(seven.equals("np") || seven.equals("nb")))
					good = false;
			}
			if (bot_move == 8)
			{
				if (!(eight.equals("pp") || eight.equals("pb")))
					good = false;
			}
			if (bot_move == 9)
			{
				if (!(nine.equals("rp") || nine.equals("rb")))
					good = false;
			}
		}
		good = true;
		if (bot_move == 1)
			one = "bb";
		if (bot_move == 2)
			two = "db";
		if (bot_move == 3)
			three = "fb";
		if (bot_move == 4)
			four = "hb";
		if (bot_move == 5)
			five = "jb";
		if (bot_move == 6)
			six = "lb";
		if (bot_move == 7)
			seven = "nb";
		if (bot_move == 8)
			eight = "pb";
		if (bot_move == 9)
			nine = "rb";
		System.out.println("The bot chose space " + bot_move);
		pause(sec);
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		place = "0";
		choice = pick(place);
		move = Integer.parseInt(choice);
		if (move == 1)
			one = "bp";
		if (move == 2)
			two = "dp";
		if (move == 3)
			three = "fp";
		if (move == 4)
			four = "hp";
		if (move == 5)
			five = "jp";
		if (move == 6)
			six = "lp";
		if (move == 7)
			seven = "np";
		if (move == 8)
			eight = "pp";
		if (move == 9)
			nine = "rp";
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		pause(sec);
		while (good)
		{
			bot_move = rand.nextInt(max);
			if (bot_move == 1)
			{
				if (!(one.equals("bp") || one.equals("bb")))
					good = false;
			}
			if (bot_move == 2)
			{
				if (!(two.equals("dp") || two.equals("db")))
					good = false;
			}
			if (bot_move == 3)
			{
				if (!(three.equals("fp") || three.equals("fb")))
					good = false;
			}
			if (bot_move == 4)
			{
				if (!(four.equals("hp") || four.equals("hb")))
					good = false;
			}
			if (bot_move == 5)
			{
				if (!(five.equals("jp") || five.equals("jb")))
					good = false;
			}
			if (bot_move == 6)
			{
				if (!(six.equals("lp") || six.equals("lb")))
					good = false;
			}
			if (bot_move == 7)
			{
				if (!(seven.equals("np") || seven.equals("nb")))
					good = false;
			}
			if (bot_move == 8)
			{
				if (!(eight.equals("pp") || eight.equals("pb")))
					good = false;
			}
			if (bot_move == 9)
			{
				if (!(nine.equals("rp") || nine.equals("rb")))
					good = false;
			}
		}
		good = true;
		if (bot_move == 1)
			one = "bb";
		if (bot_move == 2)
			two = "db";
		if (bot_move == 3)
			three = "fb";
		if (bot_move == 4)
			four = "hb";
		if (bot_move == 5)
			five = "jb";
		if (bot_move == 6)
			six = "lb";
		if (bot_move == 7)
			seven = "nb";
		if (bot_move == 8)
			eight = "pb";
		if (bot_move == 9)
			nine = "rb";
		System.out.println("The bot chose space " + bot_move);
		pause(sec);
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		place = "0";
		choice = pick(place);
		move = Integer.parseInt(choice);
		if (move == 1)
			one = "bp";
		if (move == 2)
			two = "dp";
		if (move == 3)
			three = "fp";
		if (move == 4)
			four = "hp";
		if (move == 5)
			five = "jp";
		if (move == 6)
			six = "lp";
		if (move == 7)
			seven = "np";
		if (move == 8)
			eight = "pp";
		if (move == 9)
			nine = "rp";
		board(one, two, three, four, five, six, seven, eight, nine, "x", "o");
		pause(sec);
		if ((one.equals("bp") && two.equals("dp") && three.equals("fp")) || (four.equals("hp") && five.equals("jp") && six.equals("lp")) || (seven.equals("np") && eight.equals("pp") && nine.equals("rp")) || (one.equals("bp") && four.equals("hp") && seven.equals("np")) || (two.equals("dp") && five.equals("jp") && eight.equals("pp")) || (three.equals("fp") && six.equals("lp") && nine.equals("rp")) || (one.equals("bp") && five.equals("jp") && nine.equals("rp")) || (three.equals("fp") && five.equals("jp") && seven.equals("np"))) //b, d, f, h, j, l, n, p, r
			System.out.println("You won!");
		else if ((one.equals("bb") && two.equals("db") && three.equals("fb")) || (four.equals("hb") && five.equals("jb") && six.equals("lb")) || (seven.equals("nb") && eight.equals("pb") && nine.equals("rb")) || (one.equals("bb") && four.equals("hb") && seven.equals("nb")) || (two.equals("db") && five.equals("jb") && eight.equals("pb")) || (three.equals("fb") && six.equals("lb") && nine.equals("rb")) || (one.equals("bb") && five.equals("jb") && nine.equals("rb")) || (three.equals("fb") && five.equals("jb") && seven.equals("nb")))
			System.out.println("The computer beat you.");
		else
			System.out.println("Tie game.");
	}
}
