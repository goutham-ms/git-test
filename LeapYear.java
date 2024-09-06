import java.util.Scanner;
class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		boolean leap;
		int year = sc.nextInt();
		
		leap = (year % 4 == 0);
		
		leap = leap && (year % 100 != 0 || year % 400 == 0);
		
		if(leap) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}
