package com.velocity.practice.example;

public class Example3 {

	public static void main(String[] args) {

		String str="Umbrella";
		char charsearch='e';//make charecter
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==charsearch)
			   {
				   System.out.println(ch); 
				   break;
			   }
				
		}

	}

}
