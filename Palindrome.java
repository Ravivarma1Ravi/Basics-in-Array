package Demo;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element:");
		String a = sc.nextLine();
	String b="";
	for(int  i= a.length()-1; i>=0; i--)
	{
		b+=a.charAt(i);
	}
	if(a.equals(b))
	{
		System.out.println(b+" :This is Palindrome");
	}
	else
	{
		System.out.println(b+" :This Not a Palindrome");
	}
}
}
