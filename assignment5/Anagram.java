package assignment5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int len1 = text1.length();
		int len2 = text2.length();
		if(len1 == len2) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean Equal = Arrays.equals(charArray1, charArray2);
			if (Equal) {
				System.out.println("It is an anagram word");

			} else {
				System.out.println("It isn't an anagaram word");
			}
		}

	}

}
