package C_File_Reading_Writing;

public class Q_String_Comparision 
{
    //==it will compare the address
	//.equals it will compare the content
	//compare to it will compare the asciivalue
	
	public static void main(String[] args) 
	{
		//using == comparison equal keyword
		
		String s="Sanjeev"; //SCP
		String s1="Sanjeev";//SCP
		
		if(s==s1)
		{
			System.out.println("Address is same");
		}
		else
		{
			System.out.println("Address is not same");
		}
		//O/P=Address is same
//------------------------------------------------------------------------------		
		// using == comparison new keyword	
		
		String s2=new String("Sanjeev"); //Heap,Every time make a object
		String s3=new String("Sanjeev"); //Heap,Every time make a object
		
		if(s2==s3)
		{
			System.out.println("Address is same....");
		}
		else
		{
			System.out.println("Address is not same....");
		}
		//O/P=Address is not same....
//------------------------------------------------------------------------------
		// using .equals comparison new keyword
		
		String s4="Sanjeev"; //SCP
		String s5=new String("Sanjeev"); //Heap,Every time make a object
		
		if(s4==s5)
		{
			System.out.println("Address is same..");
		}
		else
		{
			System.out.println("Address is not same");
		}
		//O/P=Address is not same
//------------------------------------------------------------------------------		
		String s6="kumar"; //SCP
		String s7=new String("thakur"); //Heap,Every time make a object
		
		if(s6==s7)
		{
			System.out.println("Address is same..");
		}
		else
		{
			System.out.println("Address is not same");
		}
		//O/P=Address is not same
//------------------------------------------------------------------------------		
		//using .equals comparison new keyword
		
		String s8=new String("Sanjeev"); //Heap,Every time make a object
		String s9=new String("Sanjeev"); //Heap,Every time make a object
		
		if(s8==s9)
		{
			System.out.println("Address is same............");
		}
		else
		{
			System.out.println("Address is not same..........");
		}
		//O/P=Address is not same..........
	
//------------------------------------------------------------------------------		
		//compare to
		String s10="sanjeev";
		String s11=new String("sanjeev");
		System.out.println(s.compareTo(s11)); //Ascii value is different compare to ascii chart
		//O/P=-32
		
		
}
}