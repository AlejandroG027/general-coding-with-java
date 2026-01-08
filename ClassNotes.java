import java.util.HashMap;

public class ClassNotes {
    // this is the general setup of a custom class

    // instance vars
    private int int1;
    private String str1;
    private HashMap<Integer, String> hash1;

    // constructor
    public ClassNotes(int int1, String str1, HashMap<Integer, String> hash1) {
        this.int1 = int1;
        this.str1 = str1;
        this.hash1 = hash1;
    }

    // getters - this is known as an instance method bc it applies to the object at hand
    public String getStr() {
        return str1;
    }

    // setter
    public void setStr(String str1){
        this.str1 = str1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } // checks if o object is NULL
        if (o == this) {
            return true;
        }  // checks if o object is the same object as original
        if (!(o instanceof ClassNotes)) {
            return false;
        } // checks if o object is of Class Point
        ClassNotes other = (ClassNotes) o; // down casting
        return this.int1 == other.int1 && this.str1 == other.str1;
    }

    @Override
    public String toString(){
        return "Num: " + int1;
    }

    @Override
    public int hashCode(){
        return 39 + int1 * 3;
    }

    // static method: can be applied manually to an input
    public static boolean equalStrs(ClassNotes obj1, ClassNotes obj2){
        if(obj1.str1.equals(obj2.str1)){return true;}
        return false;
    }



    public static void main(String[] args){
        // instantiating the class
        ClassNotes my_example = new ClassNotes(10,"yes",new HashMap<Integer,String>());
        // applying instance method
        String val = my_example.getStr();
        //System.out.println(val);

        // applying static method
        ClassNotes my_example2 = new ClassNotes(10,"no",new HashMap<Integer,String>());
        boolean val2 = ClassNotes.equalStrs(my_example,my_example2);
        //System.out.print(val2);


        // VOCABULARY
        /* Cohesion: How well a class's internal design and variables work for a common
        purpose. You want high cohesion */

        /* Coupling: How much classes depend on other classes to run propoerly without error.
       You want low coupling, bc this mean more independednt class, less errors*/

    }

}
