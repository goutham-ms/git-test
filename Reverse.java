import java.util.Scanner;

class Reverse {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	
	int no = sc.nextInt();
	int ans = 0;
	
	while (no > 0) {
		int rem = no % 10;
		no = no / 10;
		ans = ans * 10 + rem;
	}
	
	System.out.println("Reverse of the number: " + ans);
}
}
