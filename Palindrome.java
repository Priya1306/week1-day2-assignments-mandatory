package week1.day2.assignments.mandatory;

public class Palindrome {
	public static void checkforPalindrome(String s) {
		String result="";
		System.out.println("the string is " +s);
		char c[] = s.toCharArray();
		System.out.print("the reversed string is ");
		for(int i=c.length-1; i>=0;i--) {
			result=result+c[i];
		}
		System.out.println(result);
		if(result.equals(s)) {
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("the given string is not palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		checkforPalindrome(str);
	}

}
