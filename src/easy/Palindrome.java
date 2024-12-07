package easy;

import java.util.HashSet;
import java.util.Set;

//3.
public class Palindrome {
	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		int num1 = 11;
		int num2 = 100;
		int num3 = 0;
		
		boolean result = solution.isPalindrome(num3);
		
		System.out.println("palindrome = " + result);
		
		//String Palindrome class
		StringPalindrome stringPalindrome = new StringPalindrome();
		String st1 = "racecar";
		String st2 = " ";
		String st3 = "a";
		String st4 = "Nabin";
		
		boolean resultStr1 = stringPalindrome.isStringPalindrome(st1);
		boolean resultStr2 = stringPalindrome.isStringPalindrome(st2);
		boolean resultStr3 = stringPalindrome.isStringPalindrome(st3);
		boolean resultStr4 = stringPalindrome.isStringPalindrome(st4);
		
		System.out.println("========== String Palindrome ===============");
		System.out.println("is string1 palindrome = " + resultStr1);
		System.out.println("is string2 palindrome = " + resultStr2);
		System.out.println("is string3 palindrome = " + resultStr3);
		System.out.println("is string4 palindrome = " + resultStr4);
	}
}

//Q 1.  Given an integer x, rturn true if it is palindrome, otherwise false
class Solution3{
	public boolean isPalindrome(int x) {
		boolean result = false;
		String intToString = Integer.toString(x); // int to string
		
		int indexValue = 0;
		if(intToString.length() == 1) {
			result = true;
			return result;
		}else {
			while(indexValue < intToString.length()/2) {
				for(int j = intToString.length() - 1; j >= intToString.length()/2; j--) {	
					if(intToString.charAt(indexValue) == intToString.charAt(j)) {
						result = true;
						indexValue++;
					}else {
						result = false;
						return result;
					}
				}
			}
		}
		return result;
	}
}

// Explanation: space Complexity = O(1)

// test cases 
//1. 1
//2. 11
//3. 121, true
//4. 10, false


//Question 2 -> Check if a string is a palindrome(Does String read the same from front and back, ex aba, racecar)
class StringPalindrome{
	public boolean isStringPalindrome(String st) {
		boolean result = false;
		// split string into two halves, and compare first element from first half to last element from second half and so on
		int j = st.length() - 1;
		while(j >= st.length()/2) {
			for(int i = 0; i <= st.length()/2; i++) { // i goes up to half a length of string while j comes down half a length of string
				if(st.charAt(i) == st.charAt(j)) {
					result = true;
					j--;
				}else {
					result = false;
					return result;
				}
			}
		}
		
		return result;
	}
}