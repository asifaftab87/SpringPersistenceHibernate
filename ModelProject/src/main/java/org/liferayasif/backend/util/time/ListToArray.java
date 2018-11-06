package org.liferayasif.backend.util.time;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<String>();
		strList.add("alpha");
		strList.add("beta");
		strList.add("gama");
		strList.add("thita");
		strList.add("hecta");
		strList.add("octa");
		
		for(String a : strList)
		{int i=0;
			System.out.println(i+":"+a);
			i++;
		}
		System.out.println("======================================>");
		String[] str=new String[strList.size()];
		
		str=strList.toArray(str);
		
		
		
			for(String a : str)
			{
				System.out.print(","+a);
			}
		

	}
	
	
	

}

