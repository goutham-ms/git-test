public class Linear {
	public static void main(String [] args) {
		int [] arr = {1, 54, 132, 98, 2431, 10};
		String str = "";
		int target = 9;
		char letter = 'a';
		
		System.out.println(linearSearch(arr, target));
		System.out.println(linearSearch1(str, letter));
	}
	
	static int linearSearch(int [] arr, int target) {
	
		if(arr.length == 0) {
			 return -1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	static boolean linearSearch1(String str, char letter) {
		if(str.length() == 0) {
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == letter) { 
				return true;
			}
		}
		return false;
	}
}
