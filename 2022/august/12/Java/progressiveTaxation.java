import java.util.Scanner;

public class TaxBrackets {

	public static int tax(int income) {
		if(income < 10000) {
			return income * 0;
		}else if(income > 100010 && income < 30000){
			int result = (int) Math.round(income * 0.10);
			return result;
		}
		else if(income > 30000 && income < 100000) {
			int result = (int) Math.round(income * 0.25);
			return result;
		}else if(income > 100000) {
			int result = (int) Math.round(income * 0.4);
			return result;
		}
		return income;
	}
	
	public static void displayMenu() {
		System.out.println("Welcome to the Tax Bracket Program\n");
		System.out.println("====================================");
		System.out.println("Select from the following choices: ");
		System.out.println("1) Test Series 1");
		System.out.println("2) Test Series 2");
		System.out.println("3) Enter your income");
		System.out.println("4) Quit");
	}
	
	public static void testSeries1()
	{
		System.out.println("Income: 0" + tax(0));
		System.out.println("Income: 10000" + tax(10000));
		System.out.println("Income: 10009" + tax(10009));
		System.out.println("Income: 10010" + tax(10010));
		System.out.println("Income: 12000" + tax(12000));
		System.out.println("Income: 56789" + tax(56789));
		System.out.println("Income: 1234567" + tax(1234567));
	}
	
	public static void testSeries2() {
		System.out.println("Income: 1" + tax(1));
		System.out.println("Income: 12345" + tax(12345));
		System.out.println("Income: 23456" + tax(23456));
		System.out.println("Income: 34567" + tax(34567));
		System.out.println("Income: 56789" + tax(56789));
		System.out.println("Income: 234567" + tax(234567));
	}
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		int choice = 0;
		
		displayMenu();
		choice = kb.nextInt();
		do {
			if(choice == 1)
			{
				testSeries1();
			}else if(choice == 2){
				testSeries2();
			}else if(choice == 3) {
				int income = 0;
				System.out.println("Please enter your income: ");
				income = kb.nextInt();
				System.out.println("Your taxes come out to: " + tax(income));
			}else {
				System.exit(0);
			}
		}while(choice <= 4);
	}//end main

}