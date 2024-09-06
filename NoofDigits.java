import java.util.*;

class NoofDigits{	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int no = sc.nextInt();
		int count = 0;
		System.out.print("Enter the digit: ");
		int digit = sc.nextInt();
		
		while(no > 0) {
			int rem = no % 10;
			if (rem == digit )
				count ++;
			no /= 10;
		}
		
		System.out.println("The count of " + digit + " is: " + count);
	}
}
