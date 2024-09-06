import java.util.Scanner;
import java.util.Arrays;

class LargestInRange {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.print("Enter 5 elements: ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the range: ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("Largest element between " + i + " & " + j + " is: " + isLargest(arr, i, j));
	}
	
	static int isLargest(int [] arr, int x, int y) {
		int largest = -1;
		for (int i = x; i <= y; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
}
