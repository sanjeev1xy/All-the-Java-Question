package A_Java;

public class Integer_Array_Sum_11 
{
public static void main(String[] args) 
{
	//I/P=4, 9, 3, 2, 5, 2, 6,11,0,12,-1
	//O/P=9 + 2 = 11
	//	  5 + 6 = 11
	//	  11 + 0 = 11
	//	  -1 + 12 = 11
	
	//O/P=(9,2) (-1,12) (5,6) (11,0) 
	
	/*int[] intarr = {4, 9, 3, 2, 5, 2, 6,11,0,12,-1};
    int target = 11;

    for (int i = 0; i < intarr.length; i++) 
    {
        for (int j = i + 1; j < intarr.length; j++) 
        {
            if (intarr[i] + intarr[j] == target) 
            {
                System.out.println(intarr[i] + " + " + intarr[j] + " = " + target);
                //O/P=9 + 2 = 11
            	//	  5 + 6 = 11
            	//	  11 + 0 = 11
            	//	  -1 + 12 = 11
                
               //System.out.print("(" + intarr[i] + "," + intarr[j] + ") "); 
              //O/P=(9,2) (-1,12) (5,6) (11,0)
                
                intarr[j] = -1; // avoid duplicate
                break;
            }
        }
    }*/
    
	//Method-2 for Exchanging the number
	
    //I/P=4, 9, 3, 2, 5, 2, 6,11,0,12,-1
	//O/P=9 + 2 = 11
	//    2 + 9 = 11
	//	  5 + 6 = 11
	//	  6 + 5 = 11
	//	 11 + 0 = 11
	//	 0 + 11 = 11
	//	12 + -1 = 11
	//	-1 + 12 = 11
    
    
    int[] intarr1 = {4, 9, 3, 2, 5, 6,11,0,12,-1};
    int target1 = 11;

    for (int i = 0; i < intarr1.length; i++) 
    {
        for (int j = 0; j < intarr1.length; j++) 
        {
            if (intarr1[i] + intarr1[j] == target1) 
            {
                System.out.println(intarr1[i] + " + " + intarr1[j] + " = " + target1);
                
            }
        }
    }	
}
}
