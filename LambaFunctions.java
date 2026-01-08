import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambaFunctions {
    /* FUNCTIONAL INTERFACE
    - An interface with a single abstract method that will be implemented by a simple
    lambda expression.
    - Example

    public interface Calculator {
        public int Calculate(double num);
    }

    // lambda function
    Calculator square = num -> num * num;

    // apply lambda function
    square.Calculate(5) -- returns 25

    - Java has built in Functional Interfaces so you don't have to
    make your own

     */

    public static void main(String[] args) {
        // Built in Functional Interfaces

        // 1. Function - must define input and output
        Function<Double, Double> square = num -> num * num;
        double output = square.apply(5.0); // calling lambda function
        //System.out.print(output);

        // 2. Predicate - must define the input, returns boolean by default
        Predicate<Integer> isEven = num -> num % 2 == 0;
        boolean output2 = isEven.test(10);
        //System.out.print(output2);

        // 3. Comparator - Define the types of the inputs

        // returns 1 if obejct 1 is greater than object 2
        // returns 0 if they are equal
        // returns -1 if obj1 is less than obj2
        Comparator<Integer> which = (n1, n2) -> n1.compareTo(n2);
        Integer output3 = which.compare(21, 20);
        //System.out.println(output3);

        // OTHER BUILT-IN LAMBDA FUNCTIONS
        // For Each - specifies something that can be applied to a list of objects
    }
}


