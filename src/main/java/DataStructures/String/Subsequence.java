package DataStructures.String;

import java.util.Scanner;

public class Subsequence {
	
	 static boolean isSubSeq1(String s1, String s2, int n, int m){//iterative
	        int j = 0;
	        for(int i = 0; i < n && j < m; i++){
	            if(s1.charAt(i) == s2.charAt(j))
	            j++;
	        }
	        
	        return j == m;
	    }

	    static boolean isSubSeq(String s1, String s2, int n, int m){
	        if( m == 0 )
	            return true;
	        
	        if( n == 0 )
	            return false;
	            
	        if ( s1.charAt(n-1) == s2.charAt(m-1) )
	            return isSubSeq(s1, s2, n-1, m-1);
	        
	        else
	            return isSubSeq(s1, s2, n-1, m);
	    }
	    
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n, m;
			n = sc.nextInt();
			m = sc.nextInt();
			
			String s1, s2;
			s1 = sc.next();
			s2 = sc.next();
			
			System.out.println(isSubSeq(s1, s2, n, m));
			
		}
	}