package chapter1_InputAndOutput;

import java.util.Scanner;
public class No_10926 
{

	public static void main(String[] args) 
	{
		String[] id = new String[] {"joonas","moon","sun","jake","james"};
		
		Scanner in = new Scanner(System.in);
		
		String inputId = in.next();
		
		for ( String i : id)
			if(i.equals(inputId))
				System.out.println(inputId+"??!");
	}
}