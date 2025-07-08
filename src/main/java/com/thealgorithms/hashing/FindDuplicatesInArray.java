package com.thealgorithms.hashing;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
/**
 * The FindDuplicates class provides a method to return the number of duplicate elements.
 * This algorithm uses a HashSet to check for duplicate elements.
 *
 * @author csdoge22
*/

public final class FindDuplicatesInArray {

    public FindDuplicates(){
    }

    /** 
     * Identifies all duplicate elements in an array of a generic type T.
     * 
     * @param <T> the type of elements in the array
     * @param arr an array of elements
     * @return all elements that appear more than once
    */
    public static <T> List<T> identifyDuplicates(T[] arr){
        Set<T> elements = new HashSet<>();
        List<T> duplicateList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            elements.add(arr[i]);
        }
    }
}
