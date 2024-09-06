import java.util.Scanner;
import java.util.Arrays;

class ArrayReverse {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter 5 elements: ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		swap(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}	
	
	static void swap(int [] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	} 
}
