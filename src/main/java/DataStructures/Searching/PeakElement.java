package DataStructures.Searching;

public class PeakElement {

		static int getPeak(int arr[], int n){
		if(n == 1)
			return arr[0];
		if(arr[0] >= arr[1])
			return arr[0];
		if(arr[n - 1] >= arr[n - 2])
			return arr[n - 1];
		for(int i = 1; i < n - 1; i++)
			if(arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return arr[i];				
		return -1;
	}
		
		//efficient
		
		static int getPeak1(int arr[], int n)
		{
			int low = 0, high = n - 1;
			while(low <= high)
			{
				int mid = (low + high) / 2;
				if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
					(mid == n - 1 || arr[mid + 1] <= arr[mid]))
					return mid;
				if(mid > 0 && arr[mid - 1] >= arr[mid])
					high = mid -1;
				else
					low = mid + 1;
			}		
			return -1;
		}

	public static void main(String args[]) 
    {
		int arr[] = {5, 10, 11, 12, 20, 12}, n = 6;
        System.out.println(getPeak(arr, n));
    } 
}

// if arr[mid] > arr[mid-1] (left element)...........there must be peak at right, we can ignore left side
// if arr[mid] > arr[mid+1] (right element)...........there must be peak at left, we can ignore right side