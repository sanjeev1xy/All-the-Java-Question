package A_Java;

public class Right_Rotation_of_an_Array_by_N_Times 
{
	// Input:  arr = [1, 2, 3, 4, 5], N = 2 
	// Output: 4 5 1 2 3 
	
	/*
	int n = 0; // Output: 1 2 3 4 5
	int n = 1; // Output: 5 1 2 3 4
	int n = 2; // Output: 4 5 1 2 3
	int n = 3; // Output: 3 4 5 1 2
	int n = 4; // Output: 2 3 4 5 1
	int n = 5; // Output: 1 2 3 4 5
	int n = 6; // Output: 5 1 2 3 4   
	*/

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5}; 
		int n = 2;                                       // Change only this value: 0, 1, 2, 3, 4, 5           

		for (int i = 1; i <= n; i++)                     // Repeat the rotation process N times
		{
			int last = arr[arr.length - 1];              // Store the last element of the array
			for (int j = arr.length - 1; j > 0; j--)     // Move from last index to first index
			{
				arr[j] = arr[j - 1];                     // Shift each element one position to the right
			}
			arr[0] = last;                               // Place the stored last element at index 0 (first position)
		}
		System.out.print("Output: ");                   // Print the text "Output: "
		for (int num : arr)                             // Read each element from the rotated array one by one
		{
			System.out.print(num + " ");                // Print each element with a space
		}
		
		
		/*
		int n = 0; // Output: My name is Sanjeev kumar
        int n = 1; // Output: kumar My name is Sanjeev
        int n = 2; // Output: Sanjeev kumar My name is
        int n = 3; // Output: is Sanjeev kumar My name
        int n = 4; // Output: name is Sanjeev kumar My
        int n = 5; // Output: My name is Sanjeev kumar
        int n = 6; // Output: kumar My name is Sanjeev
		 */
		
		/*String[] arr={"My","name","is","Sanjeev","Kumar"};
        int n=2;
        
        for(int i=1;i<=n;i++)
        {
            String Last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=Last;
        }
        System.out.println("output ");
        for(String w:arr)
        {
            System.out.println(w+" ");
        }*/
	}
}