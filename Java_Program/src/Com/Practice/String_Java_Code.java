package Com.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class String_Java_Code {
public static void main(String[] args) {
	// find first non repeating char
	String str="Jyoti gaikwadj";
	str=str.toLowerCase();
	//Map<Character,Integer> map=new HashMap<Character, Integer>();
		char chars[]=str.toCharArray();
for(int i=0;i<chars.length;i++) {
	boolean unique=true;
for(int j=i+1;j<chars.length;j++) {
if(i!=j && chars[i]!=chars[j]) {
	unique=false;
	
}
if(unique) {
	System.out.println(chars[i]);
}
}
}
}}
	/*	for(char ch:chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				int value=map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
}}
/* sorting a string 
String str="jyoti gaikwad";
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++) {
for(int j=i+1;j<ch.length;j++) {
	if(ch[i]>ch[j]) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
}
}
System.out.println(new String(ch));
}}
/*String str="aabbcd";
char ch[]=str.toCharArray();
StringBuilder sb=new StringBuilder();
Set<Character>se=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	se.add(ch[i]);
}
for(Character a:se) {
  sb.append(a);
}
System.out.println(new String(sb));
}}
 /*char ch[]=str.toCharArray();
 for(int i=0;i<ch.length;i++) {
	 boolean repeated=false;
for(int j=i+1;j<ch.length;j++) {
	if(ch[i]==ch[j]) {
		repeated=true;
		break;
	}
}
if(!repeated) {
	sb.append(ch[i]);
}}
System.out.println(new String(sb));
 }
}
	/*String str="j y o t i Ga    i  kWa d";
	str=str.replaceAll("\\s+", "");
	System.out.println(str);
}
}
/*	String str= "jyoti";
 	str.concat("Gaikwad");
	System.out.println(str);
}
}
/*String str="JYYoottit"	;
str=str.toLowerCase();
char ch[]=str.toCharArray();
StringBuffer sb=new StringBuffer();
Set<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
}
	for(char c:set) {
		sb.append(c);
	}

System.out.println(sb);
}}
/* Sort the string
String str="Gaikwad";
str=str.toLowerCase();
char ch[]=str.toCharArray();
Arrays.sort(ch);
System.out.println(new String(ch));
}}
/*for(int i=0;i<ch.length;i++) {
for(int j=i+1;j<ch.length;j++) {
if(ch[i]>ch[j]) {
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
}
}}
System.out.println(new String(ch));
}}

/*String str="aabbbacdd";
// remove duplicate using a hashset
StringBuilder sb=new StringBuilder();
char ch[]=str.toCharArray();
Set<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
}

for(char ch1:set) {
	sb.append(ch1);
}
System.out.println(sb);
}}
/* remove duplicate character in a string
String str="jtyoti";
StringBuilder sb=new StringBuilder();
 char ch[]=str.toCharArray();
 for(int i=0;i<ch.length;i++) {
	 boolean repeated=false;
 for(int j=i+1;j<ch.length;j++) {
	if(ch[i]==ch[j]) {
		repeated=true;
		break;
	}
 }
 if(!repeated) {
	sb.append(ch[i]);
 }
 }
 System.out.println(sb);
}
}
	/*Remove duplicate character in string
StringBuilder sb=new StringBuilder();
String str="JyyOOTTIMMAAHADEVV";
str=str.toLowerCase();
char ch[]=str.toCharArray();
Set<Character> set=new LinkedHashSet<Character>();
    for(int i=0;i<ch.length;i++) {
    	set.add(ch[i]);
    }
    for(char c:set) {
    	sb.append(c);
    }
    System.out.println(sb);
}
}
	//remove the white space in string
	String str="j y o t i";
	str=str.replaceAll("\\s+","");
	System.out.println(str);
}
}*/
