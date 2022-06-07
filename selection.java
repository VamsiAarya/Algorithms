import java.lang.*;
import java.util.*;


public class selection {
    public static void selectionSort(int[] nums, int n)
    {
        for (int i=0; i<n; i++)
        {
            int min = i;
            // findin the index that is having minimum value
            for(int j=i+1; j<n; j++)
            {
                if(nums[j]< nums[min])
                {
                    min=j;
                }
            }
            // after iterating we are checking if min index is same as defined
            // if not that means we find the min index so swap those elements.
            if(min!=i)
            {
                int temp = nums[i];
                nums[i]= nums[min];
                nums[min] = temp;
            }

        }

    }

    public static void printer(int[] nums,int n)
    {
        for(int i=0; i<nums.length; i++ )
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++) numbers[i]= in.nextInt();

        selectionSort(numbers,n);
        printer(numbers,n);

    }
}
