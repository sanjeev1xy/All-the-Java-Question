package Danger;

import java.util.HashMap;
import java.util.Scanner;

public class Kumar
{
	 public static void main(String[] args) 
	    {
	        //int[] numbers = {3, 7, 2, 8, 7, 3, 1, 2}
	        System.out.println("Plz.Enter the Value");
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String[]s1=s.split("//s+");
	        HashMap<String,Integer>mp=new HashMap<String,Integer>();
	        for(String w:s1)
	        {
	            if(mp.containsKey(w))
	            {
	                mp.put(w,mp.get(w)+1);
	            }
	            else
	            {
	                mp.put(w,1);
	            }
	        }
	        for(String w:mp.keySet())
	        {
	            if(mp.get(w)>1)
	            {
	                System.out.println(w+"->"+mp.get(w));
	            }
	        }
	    }
	
}