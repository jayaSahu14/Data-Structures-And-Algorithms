package DataStructures.Arrays;

public class LongestEvenOdd {

	 static int eff(int arr[], int n)
	    {
	    	int res = 1;
	    	int curr = 1;

	    	for(int i = 1; i < n; i++)
	    	{
	    			if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||(arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
	    				{
	    					curr++;

	    					res = Math.max(res, curr);
	    				}
	    				else
	    					curr = 1;
	    	}
	    	
	    	return res;
	    }

//------------------------------------------------------------------------------
	 
	 static int naive(int arr[], int n)
	    {
	    	int res = 1;

	    	for(int i = 0; i < n; i++)
	    	{
	    		int curr = 1;
	    		for(int j = i + 1; j < n; j++)
	    		{
	    			if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
	    			   ||(arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
	    				curr++;
	    			else
	    				break;
	    		}

	    		res = Math.max(res, curr);
	    	}
	    	
	    	return res;
	    }





	  public static void main(String args[]) 
	    { 
	       int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;
	       int arr2[] = {1,2,3,4,5,6}, m = 6;

	       System.out.println(naive(arr, n));
	       System.out.println(eff(arr2, m));

	    } 


}
