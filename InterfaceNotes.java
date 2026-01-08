public interface InterfaceNotes {
    /* an interface is implemented by methods in which those methods
    are required to override the instance methods provided by the interface */

    // variables that can be access by any of the shared classes
    // treated as final static variables
    int int1 = 2;
    int int2 = 3;

    // required non-static methods are to be present in each shared class
    public int Area();

    // static methods are not present in the shared classes
    // this method can only be called through the Interface, not by a class
    public static int Area_Diff(ShapeIF shape1, ShapeIF shape2){
        return shape1.Area() - shape2.Area();
    }
}
