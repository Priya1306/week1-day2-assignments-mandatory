package week1.day2.assignments.mandatory;

import week1.day2.ReverseString;

public class ReverseEvenWords {
	
	public static String reverseEvenWords(String s) {
		String[] str=s.split(" ");
		String r="";
		for(int i=0;i<str.length;i++) {
			if(i%2==1) {
				str[i]=reverse(str[i]);				
			}
			r=r+" "+str[i];
		}
		return r;
	}
	
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "I am a software tester";
		String result=reverseEvenWords(text);
		System.out.println(result);		            
		}
	}

	
