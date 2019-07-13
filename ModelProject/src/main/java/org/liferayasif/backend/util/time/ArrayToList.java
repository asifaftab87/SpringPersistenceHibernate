package org.liferayasif.backend.util.time;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		String[] str= new String[]{"aaa","bbb","ccc","ddd","eee"};
		
		
		List<String> strList=new ArrayList<String>();
		
		for(int i=0;i<str.length;i++)
		{
			strList.add(str[i]);
		}
		
		for(String D : strList)
		{
			System.out.println(""+D);
		}

	}

}
