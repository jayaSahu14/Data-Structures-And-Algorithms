package DataStructures.Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOf2Arr {

    public static void main (String[] args) {
        int arr1[] = new int[]{2, 8, 3, 5, 6};
        int arr2[] = new int[]{4, 8, 3, 6, 1};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println(unionSize(arr1, m, arr2, n));
    }
    
    static int unionSize(int arr1[], int m, int arr2[], int n)
    {
    	Set<Integer> hs =new HashSet<Integer>();
    	for(int i:arr1) {
    		hs.add(i);
    		/*  for(int i = 0; i < m; i++)
          hs.add(arr1[i]);  */
    	}
    	for(int i:arr2) {
    		hs.add(i);
    	}
		return hs.size();
    }

	
	
	
	
	
	
	
}
