package org.chakri.app;

import java.util.Scanner;

public class ReverseOfStringAndCharacters {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The String");
	String s1=scanner.nextLine();
	char[]c1=s1.toCharArray();
	String out="";
	for(int i=0;i<c1.length;i++)
	{
		String res="";
		while(i<c1.length&&c1[i]!=' ')
		{
			res=c1[i]+res;
			i++;
		}
		out=out+res+res.length()+" ";
	}
	String s2=out.trim();
	System.out.println("Given String Is :"+s1);
	System.out.println("Reversed String Is :"+s2);
}
}
/*Given String Is :java is my world
Reversed String Is :avaj si ym dlrow
 {out=out+res+" ";}
*/
/*Given String Is :java is my world
Reversed String Is :avaj4 si2 ym2 dlrow4 
 {out=out+res+res.length()+" ";}
 */