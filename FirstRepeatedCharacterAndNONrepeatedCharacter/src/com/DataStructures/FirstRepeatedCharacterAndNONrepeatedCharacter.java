package com.DataStructures;

import java.util.HashMap;

public class FirstRepeatedCharacterAndNONrepeatedCharacter {

	static void FRCANRC(String inputString)
	{
		HashMap<Character, Integer> charcountmap = new HashMap<Character, Integer>();
		char[]strArray = inputString.toCharArray();
		for(char c:strArray)
		{
			if(charcountmap.containsKey(c))
			{
				charcountmap.put(c, charcountmap.get(c)+1);
			}
			else
				charcountmap.put(c, 1);
		}
		// cheacking for non-repeated character
		
		for(char c:strArray)
		{
			if(charcountmap.get(c)==1)
			{
				System.out.println("NON - Repeated Character....    "+c);
				break;
			}
		}
		// cheaking for Repeated character
		
		for(char c: strArray)
		{
			if(charcountmap.get(c)>1)
			{
				System.out.println("Repeated Character...     "+c);
				
				break;
			}
		}
	}
	public static void main(String[] args) {
		String str = "First Day in The Poland";
		FRCANRC(str);
	}
}
