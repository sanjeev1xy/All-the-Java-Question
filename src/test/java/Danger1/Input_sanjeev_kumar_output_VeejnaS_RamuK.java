package Danger1;

public class Input_sanjeev_kumar_output_VeejnaS_RamuK 
{
public static void main(String[] args) 
{
	//I/P:Sanjeev kumar
	//O/P:VeejnaS RamuK
	
	String input = "Sanjeev kumar";
    String[] names = input.split(" ");

    String firstname = names[0];
    String lastname = names[1];

    String reversedFirstname = new StringBuilder(firstname).reverse().toString();
    String reversedLastname = new StringBuilder(lastname).reverse().toString();

    String output = capitalizeFirstLetter(reversedFirstname) + " " + capitalizeFirstLetter(reversedLastname);

    System.out.println("Output: " + output);
}

private static String capitalizeFirstLetter(String str) 
{
    return str.substring(0, 1).toUpperCase() + str.substring(1); // keep rest as-is
}
}
