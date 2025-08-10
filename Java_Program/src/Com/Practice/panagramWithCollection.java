package Com.Practice;

import java.util.HashSet;

public class panagramWithCollection {

	public static void main(String[] args) {
		String input="The quick brown fox jumps over the lazy dog hel the ";
		//String input ="Jyoti";
		boolean result=checkPangram(input);
		if(result) {
			System.out.println("It's pangram");
		}else {
			System.out.println("It's not a pangram");

		}
	}

	private static boolean checkPangram(String input) {
		HashSet<Character> characterSet=new HashSet<Character>();
		input=input.toLowerCase();
		char inputChar[]=input.toCharArray();
		for(char c:inputChar) {
			if(Character.isLetter(c)) {
				characterSet.add(c);
			}
		}
	 if(characterSet.size()==26) {
		 return true;
	 }
	 return false;
	}
}
