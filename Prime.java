import java.util.*;
class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int no = sc.nextInt();
		
		boolean ans = isPrime(no);
		System.out.println(ans);

	}
	
	static boolean isPrime(int n) {
		if (n < 1) {
			return false;
		}
		int c = 2;
		while(c * c <= n) {
			if(n % c == 0)
			{
				return false;
			}
			c++;
		}
		if (c * c > n) {
			return true;
		}
		return false;
	}
}
