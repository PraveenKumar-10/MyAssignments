package assignment5;

public class ReverseEverWords {

	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				String word = split[i];
			}
			
		}

	}

}
