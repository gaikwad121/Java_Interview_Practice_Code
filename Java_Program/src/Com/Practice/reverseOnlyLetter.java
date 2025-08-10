package Com.Practice;

public class reverseOnlyLetter {
public static void main(String[] args) {
	String input="21jyoti86";
	char ch[]=input.toCharArray();
	for(int i=0;i<ch.length;i++) {
	int Left=0;
	int Right=ch.length-1;
	while(Left<Right) {
if(!Character.isLetter(ch[Left])) {
	Left++;
}
else if(!Character.isLetter(ch[Right])) {
	Right--;
}
else {
	char temp=ch[Left];
	ch[Left]=ch[Right];
	ch[Right]= temp;
	Left++;
	Right--;
}
	}
	}
//for(char ch1:ch) {
	//System.out.print(ch1);
	System.out.println("Output"+"  "+ new String(ch));
}
	}