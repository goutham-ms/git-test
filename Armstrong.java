import java.util.Scanner;

//To check whether the given 3 digit no is armstrong or not.

class Armstrong {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int no = sc.nextInt();
		
		isArmstrong(no);		
	}
	
	static void isArmstrong(int no) {
		int ans = 0;
		int n = no;
		
		while (no > 0) {
			int rem = no % 10;
			no /= 10;
			
			ans += rem * rem * rem;
		}
		if (ans == n) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
