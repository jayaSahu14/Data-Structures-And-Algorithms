package DataStructures.Searching;

public class lastOcc {

	static int firstOcc(int arr[], int low, int high, int x)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return firstOcc(arr, mid + 1, high, x);

		else if(x < arr[mid])
			return firstOcc(arr, low, mid - 1, x);

		else
		{
			if(mid == 0 || arr[mid - 1] != arr[mid])
				return mid;

			else
				return firstOcc(arr, low, mid - 1, x);
		}
	}
	
	static int lastOcc(int arr[], int low, int high, int x, int n)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return lastOcc(arr, mid + 1, high, x, n);

		else if(x < arr[mid])
			return lastOcc(arr, low, mid - 1, x, n);

		else
		{
			if(mid == n - 1 || arr[mid + 1] != arr[mid])
				return mid;

			else
				return lastOcc(arr, mid + 1, high, x, n);
		}
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 15, 20, 20, 20}, n = 7;

		int x = 20;
		
		System.out.println(firstOcc(arr, 0, n - 1, x));


    } 

}