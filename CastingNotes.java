import java.util.HashMap;

public class CastingNotes {

    public static void main(String[] args){
        /* Downcasting:
        changing the class of an instance variable to a subclass of a higher class
         */
        Object obj1 = new ClassNotes(10,"no",new HashMap<Integer,String>());
        ClassNotes obj2 = (ClassNotes) obj1; // downcasting

        // verifying down cast by appling an instance method
        String str = obj2.getStr();
        // System.out.println(str);

        /* Upcasting happens implicityly, when a variable can be referred to as
        also a higher class than what it is */
        }
    }
