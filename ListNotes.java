import java.util.*;

public class ListNotes {
    public static void main(String[] args) {
        /* 1D ARRAY
        - Java's most simplistic type of list
        - There are two ways to initialize an array */

        // 1. Empty Array with a fixed Length
        int[] array1 = new int[10]; // datatype[] name = new datatype[length of array]

        //2. Array with values already inside
        double[] array2 = {1.0, 2.0, 3.0, 4.0, 5.0}; // datatype[] name = {val1,val2,...}

        // To change access and change a value in an array
        array2[0] = 10.0;

        // Use loop to change all values in array
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i] + 5.0;
            //System.out.println(array2[i]);
        }

        // -----------------------------------------------

        /* 2D ARRAY
        - basically a matrix
        - two same ways to initialize */

        int[][] matrix1 = new int[3][3]; // [# of rows][# of columns]
        double[][] matrix2 = {{1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0},};

        // access single cell in matrix
        // System.out.println(matrix2[1][1]);

        // access and print all values in a column
        int col_num = 1;
        for(int i = 0; i<matrix2.length; i++){
            //System.out.print(matrix2[i][col_num]);
        }

        //-----------------------------------------------

        /* ARRAY LIST
        - more complex array
        - can add, remove, and change elements of a list
        - two ways to initialize
         */

        // 1. empty ArrayList
            // ArrayList<reference type> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();

        //2. Non-empty List
        ArrayList<double[]> lst2 = new ArrayList<>(Arrays.asList(array2));

        /* mutate methods:
        1. list.get()
        2. list.set()
        3. list.size()
        4. list.add()
        5. list.remove()
         */

        //---------------------------------------

        /* MAPS
        - store a key and a value
         */

        // Initializer
        Map<Integer,String> hasher = new HashMap<>();

        // Add value into hashmap
        hasher.put(5,"five");
        hasher.put(2,"two");

        // access all entries using keyset
        for(Map.Entry<Integer,String> entry : hasher.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue());
        }



    }
}



