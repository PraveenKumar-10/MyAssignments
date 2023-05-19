package assignment5;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count = count + 1;
					if(count>0) {
						split[j]="";
					}
				}
			}
			
		}
			String result = "";
			for (int i = 0; i < split.length; i++) {
				String a = split[i];
				if(a.length() > 0) {
					result = result+split[i]+" ";
				}
			}
		System.out.println(result);
}
}