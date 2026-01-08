import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class SortingNotes {
    /* Interfaces for Sorting Lists and Arrays

    1. Comparator
    - create a custom way to compare
    - create your own class of comparators
    - use .compare() method

    2. Comparable
    - Natural Ordering Sort
    - overrides the dafault sort of collections
    - use .compareTo() method
     */

    public static void main(String[] args) {
        // Comaparable
        String s1 = "String";
        String s2 = "Apple";
        int o1 = s1.compareTo(s2);
        //System.out.println(o1);

        // Comparator
        List<Integer> nums = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        Comparator<Integer> byLength = (a,b) -> a - b;   // sort LF
        Collections.sort(nums,byLength); // applying the LF to the list
        //nums.forEach(System.out::print);


        // example comparator
        List<String> strs = new ArrayList<>(List.of("a", "bb", "ccc", "dddd"));
        Comparator<String> byLength2 = (a,b) -> b.length() - a.length();
        Collections.sort(strs,byLength2);
        strs.forEach(System.out::print);




    }


}

