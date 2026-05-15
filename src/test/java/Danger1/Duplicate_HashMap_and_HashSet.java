package Danger1;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate_HashMap_and_HashSet 
{
public static void main(String[] args) 
{
	/*HashSet Output
	normal hasset value is 
	[Sanjeev, Thakur, Automation, Automationsdet]

	Duplicate value is 
	[Sanjeev, Thakur, Automation, Automationsdet]

	first time add the null value 
	[Sanjeev, Thakur, Automation, Automationsdet, null]
			
	Multiple time add the null value 
	[Sanjeev, Thakur, Automation, Automationsdet, null]

	HashMap Output
	normal hasmap value is 
	{1=sanjeev, 2=Kumar, 3=Thakur}
	
	Duplicate value is 
	{1=sanjeev, 2=Kumar1, 3=Thakur}

	first time add null value 
	{1=sanjeev, 2=Kumar1, 3=Thakur, 5=null}
	
	Multiple time add the null value 
	{1=sanjeev, 2=Kumar1, 3=Thakur, 5=null, 6=null}

	Final Summary (Very Short)
	HashSet → No duplicate, one null
	HashMap → No duplicate key, duplicate value allowed, 
	multiple null values.
	*/
	
//HashSet	
	HashSet<String> hasset=new HashSet<String>();
	hasset.add("Sanjeev");
	hasset.add("Thakur");
	hasset.add("Automation");
	hasset.add("Automationsdet");
	System.out.println("normal hasset value is "+hasset);
	hasset.add("Sanjeev");
	hasset.add("Thakur");
	System.out.println("Duplicate value is "+hasset);
	hasset.add(null);
	System.out.println("first time add the null value "+hasset);
	hasset.add(null);
	System.out.println("Multiple time add the null value "+hasset);
	
	//HashMap
	HashMap<Integer,String>hasmap=new HashMap<Integer, String>();
	hasmap.put(1, "sanjeev");
	hasmap.put(2, "Kumar");
	hasmap.put(3, "Thakur");
	System.out.println("normal hasmap value is "+hasmap);
	hasmap.put(2, "Kumar1");
	hasmap.put(3, "Thakur");
	System.out.println("Duplicate value is "+hasmap);
	hasmap.put(5, null);
	System.out.println("first time add null value "+hasmap);
	hasmap.put(6, null);
	System.out.println("Multiple time add the null value "+hasmap);
}
}
