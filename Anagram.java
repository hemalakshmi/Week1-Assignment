package week1.day2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
    String text2 = "potss";
    boolean status= true;
    if(text1.length()==text2.length()) {
    	char[] strToCharArray1 = text1.toCharArray();
    	char[] strToCharArray2 = text2.toCharArray();
    	Arrays.sort(strToCharArray1);
    	Arrays.sort(strToCharArray2);
    	status = Arrays.equals(strToCharArray1,strToCharArray2); 
    	if(status) {
    		System.out.println("Given strings are Anagram");
    	}
    	else {
    		System.out.println("Given Strings are not an Anagram");
    	}
    }
}
}
