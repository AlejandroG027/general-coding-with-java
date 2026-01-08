import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNotes {
    // Stream: Applies functionalities on a collection of data, heavily relies on lambda expressions

    // Stream Functionalities: Intermediate and Terminal
    // 1. Intermediate: Mapping, Filter, Sort, etc.
    // 2. Terminal: Collect, Average, Sum, Min, Max, etc.

    public static void main(String[] args){
        //lambda to filter even numbers
        Predicate<Double> isEven = x -> x % 2 == 0;

        //lambda to square a value
        Function<Double,Double> square = x -> x * x;

        List<Double> nums = Arrays.asList(1.0,2.0,3.0,4.0);
        List<Double> nums_mod = nums.stream()
                .filter(isEven)
                .map(square)
                .toList();
        nums_mod.forEach(val -> System.out.println(val));

        // get average of nums_mod
        System.out.println("Avg: " + nums_mod.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0));

        // Sort using reverse order using stream
        nums_mod.stream().sorted((a,b) -> b.compareTo(a));

        // map every value to nums, modify them, and print the results
        nums.stream().parallel().map(num -> num*2)
                .sequential().forEach(num -> System.out.print(num+ ", "));

        // find average of list using reduce
        double avg = nums.stream()
                .reduce(0.0,(n1,n2) -> n1+n2)
                / nums.size();
        System.out.print(avg);

        // find average of value between 20 and 50
        List<Integer> nums2 = new ArrayList<>();
        for(int j=20;j<=50;j++){
            nums2.add(j);
        }

        /* int avg2 = nums2.stream()
                .mapToInt(n -> n.intValue())
                .average();

        System.out.println(avg2); */

        //
        /* Arrays.stream(new int[] {4,67,12,-9})
                .map(x -> x*3)
                .average()
                .isPresent(System.out::println); */

        // practice work
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Predicate<Integer> isOdd = n -> n.doubleValue() % 2 != 0;

        // reduce list to just odd numbers
        list.stream()
                .filter(isOdd)
                .map(num -> num * 2)
                .toList();
        list.forEach(System.out::print);

        // average the list using .average
        double avg_val = list.stream()
                .mapToDouble(num -> num.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println("\n" + avg_val);


        }
    }

