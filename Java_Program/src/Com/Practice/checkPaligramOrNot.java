package Com.Practice;

public class checkPaligramOrNot {

	public static void main(String[] args) {
		String input="The quick brown fox jumps over the lazy dog hel the ";
		//String input="The quick ";

	boolean result=	isPalingram(input);
	if(result) {
	System.out.println("Its a Palingram");	
	}else {
		System.out.println("Not a Palingram");
	}
	}
static boolean isPalingram(String input) {
	input=input.toLowerCase();
	if(input.length()<26) {
	return false;
	
}

	for(char i='a';i<='z';i++) {
		if(input.indexOf(i)<0) {
		System.out.println(i);
		return false;
	}
	}
	return true;

}
}