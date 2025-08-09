package Com.Java;

public class printEvenWordInString {

	public static void main(String[] args) {

		String str="Hellow World i am jyoti gaikwad i am SDET in Reputed orgnization";
	//	char ch[]=str.toCharArray();
		//for(int i=0;i<ch.length;i++) {
			//if(ch)
			//if(ch[i]%2==0) {
		String s[]=str.split(" ");
		//for(char i=0;i<=s.length;i++) {
			//int lengths=s[i].length();
		for(String word : s) {
			int lengths=word.length();
			if(lengths%2==0)
			System.out.println(" Even Word"+word);	
				
			}
		for(String words:s) {
			int leg=words.length();
			if(leg%2==0) {
				System.out.println("Odd Word"+words);
			}
		}
		}
	}


