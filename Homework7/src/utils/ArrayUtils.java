package utils;

public class ArrayUtils {
public static int[] reverse(int[] num) {
		
		int [] reversed = new int[num.length];
		for(int i = num.length-1; i >= 0; i--) {	
			reversed[reversed.length - (i+1)] = num[i];
		}
		return reversed;
	}
	
	public static String stringifyArray(int[] num) {
		String reversed = "";

		for(int i = 0; i < num.length; i++) {
			if(i == num.length-1) {
				reversed = reversed + num[i];
				break;
			}
			reversed = reversed + num[i] + ", ";
		}
		return reversed;
	}
}

