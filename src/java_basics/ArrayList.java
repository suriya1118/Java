package java_basics;

import java.util.Scanner;


public class ArrayList {

	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "world";
		if (str1.equals(str2)) {
		    System.out.println("The strings are equal");
		} else {
		    System.out.println("The strings are not equal");
		}

		int result = str1.compareTo(str2);
		System.out.println(result);
		if (result == 0) {
		    System.out.println("The strings are equal");
		} else if (result < 0) {
		    System.out.println("str1 is less than str2");
		} else {
		    System.out.println("str1 is greater than str2");
		}
	}
	
}
