package Com.Java;

import java.util.HashMap;

public class countFrequencyOfAString {

    public static void main(String[] args) {
        String str = "Gaikwad";
        countOfChar(str); 
    }

    static void  countOfChar(String str) {
    HashMap<Character,Integer> FrequencyMap=new HashMap<Character,Integer>();
    char ch[]=str.toCharArray();
    for(char character:ch) {
    	FrequencyMap.put(character, FrequencyMap.getOrDefault(character, 0)+1);
    }
    for(char ch2:FrequencyMap.keySet()) {
    System.out.println(ch2+" "+FrequencyMap.get(ch2));
    }
}
}
