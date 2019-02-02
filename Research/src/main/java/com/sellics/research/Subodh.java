package com.sellics.research;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Subodh {

	public static int rank=0;
	public static List<String> elements=Arrays.asList("Subodh","Raksha","Anal","Neha");

	public static void main(String[] args) {
		
		Integer pos=findElementAndPosition("Anal");

		if(pos!=-1)
			rank+=pos;
		else
			rank+=10;
		
		System.out.println("Present at : " + rank);

	}

	public static Integer findElementAndPosition(final String ele)
	{		
		Optional<String> presentInList=elements.stream().
				 filter(i -> i.equals(ele)).findFirst();
		
		if(presentInList.isPresent()) {
				return elements.indexOf(ele)+1; //Done as array indexing starts at 0
		}else
			return -1; 
	}
}
