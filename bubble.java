import java.util.*;
import java.lang.*;

public class bubble
{
    //normal bubble sort
    public static void bubbleSort(int[] nums)
    {
        int n= nums.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                //ascending order: '>' 
                //descending order: '<'
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j+1];
                    nums[j+1]= nums[j];
                    nums[j]= temp;
                }
                
            }
        }
    }
    
    //optimised bubble sort
    //for some cases they may give already sorted array or after some 
    //iterations array gets sorted then we can stop 
    public static void obubbleSort(int[] nums)
    {
        int n= nums.length;
        boolean swap= false;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    swap=true;
                    int temp = nums[j+1];
                    nums[j+1]= nums[j];
                    nums[j]= temp;
                }
            }
            if(!swap) break;
        }
    }
    
    public static void printer(int[] nums)
    {
        for(int i=0; i<nums.length; i++ )
        {
            System.out.print(nums[i]+" ");
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int n= in.nextInt();
	    int[] nums = new int[n];
	    
	    for (int i=0; i<n; i++) nums[i]= in.nextInt();
	    
	   // bubbleSort(nums);
	    obubbleSort(nums);
	    printer(nums);
	}
}