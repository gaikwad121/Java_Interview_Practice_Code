package Com.Java;

public  class countLengthOfLastWordOfString {

	public static void main(String[] args) {
String str=" Hello Jyoti Your Welcome in Java World ";
countLengthOfLastWordOfString.CountLength(str);
	}

	static void CountLength(String str) {
		int count=0;
	char ch[]=str.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
	if(ch[i]!=' ') {
		count++;
	}else {
		if(count>0) { 
			System.out.println(count);
			break;
		}
	}
	
	}
		
	}


		
	}
	

