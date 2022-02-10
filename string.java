import java.util.*;
import java.util.Scanner;

class string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String a="Rohit";
		int y=a.length();
		System.out.println("The length of your name"+y);
		String z=a.toUpperCase();
		System.out.println("Name in Uppercase "+z);
		String l=a.toLowerCase();
		System.out.println("Name in Lowercase "+l);
		char m=a.charAt(3);
		System.out.println("Charector at index 3 is "+m );
		String o=a.replace('a','b');
		System.out.println("Replace string is "+o);
		String n=a.substring(2,5);
		System.out.println("substring from 2 to 5 is "+n);
		System.out.println("Enter the charcter to perform string operation");
		String s= sc.next();
		int k=a.indexOf(s);
		System.out.println("index of "+s+"is: "+k);
		String myStr="Hello planet earth.you are great";
		System.out.println(myStr.lastIndexOf("planet you are great"));
		//error at that line 
		System.out.println("Enter the first string");
		String str1 = sc.next();
		System.out.println("Enter the second string");
		String str2 =sc.next();
		String cnct=str1.concat(str2);
		System.out.println("concatinated string is"+cnct);
		System.out.println("Comparing the String B with String A");
		boolean b=a.equals(str1);
		if(b==true)
		{
			System.out.println("String is equal");
		}
		else
		{
			System.out.println("string is not equal");
		}
	}





    }


