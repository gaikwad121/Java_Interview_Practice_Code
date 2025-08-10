package Com.Practice;

public class ReplaceAllVowelsInputNameWithX {
    public static void main(String[] args) {
        String str = "Jyotika";
      /*  StringBuilder sb = new StringBuilder(str);
 char[]ch=str.toCharArray();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.setCharAt(i, 'x');
            }
        }

        System.out.println(sb.toString());
    }
}
*/
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        char ch1[]=str.toCharArray();
        for(char ch: ch1) {
        	if(ch=='a' || ch=='e' || ch=='u' || ch=='i' || ch=='o') {
        		sb.append('x');
        	}else {
        		sb.append(ch);
        	}
        }
        System.out.println(sb.toString());

    }}