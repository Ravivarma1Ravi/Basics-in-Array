package Demo;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element:");
		String a = sc.nextLine();
		String str1="";
		char ch;
		System.out.println("Original word:"+a);
		
		for(int i=0; i<a.length(); i++)
		{
			ch=a.charAt(i);
			str1=ch+str1;
		}
		System.out.println("Reversed Word:"+str1);
	}
}
