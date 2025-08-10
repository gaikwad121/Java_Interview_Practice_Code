package Com.Practice;

public class reverseOnlyVowels {

	public static void main(String[] args) {

		String str="Jyoti";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int Left=0; int Right=ch.length-1;
     String Vowels="aeiouAEIOU";

	while(Left<Right) {
        if (Vowels.indexOf(ch[Left]) == -1) {
        	Left++;
			
		}
        else if(Vowels.indexOf(ch[Right])==-1) {
        	Right--;
        }
        else {
        	char Temp=ch[Left];
        	ch[Left]=ch[Right];
        	ch[Right]=Temp;
        	Left++;
        	Right--;
        } 
	}
	}
	System.out.println(new String(ch));
	}}
