package FunctionalIntefaces.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {  
    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
    public static void main(String[] args){  
     
        Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;  
        
        boolean result = predicate.test(25);  
        System.out.println(result);  
    }  
}  