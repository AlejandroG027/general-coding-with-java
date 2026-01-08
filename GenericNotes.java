import java.util.List;

public class GenericNotes <T>{
    private T tval;

    // constructor
    public GenericNotes(T newval){
        this.tval = newval;
    }

    // getter
    public T getval(){return this.tval;}

    // setter
    public void setTVal(T newval){this.tval = newval;}

    // printer for basic types
    public void printVal(){System.out.println(this.tval);}

    // static printer for arrays
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.print(item + ", ");
        }
    }

    // static printer for equal arrays
    public static <T> boolean equality(T[] a1, T[] a2){
        // make sure lengths are the same
        if (a1.length != a2.length) return false;
        // index through each cell in both arrays
        for(int i = 0; i < a1.length; i++){
            if(!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    // static method for max of 3 values assuming 3 parameters are
    // extends bounds the object T to be required to use Comparable interface
    /*public static <T extends Comparable> T max(T t1,T t2, T t3){
        T max = t1;
        if(t2.compareTo(t1) > 0) max = t2;

    }*/

    public static <T extends Number> double arraySum(T[] a){
        double sum = 0;
        for(T num : a){
            sum += num.doubleValue();
        }
        return sum;
    }

    /*public static <T> double sumList(List<? extends T> lst);*/

   public static void main(String[] args){

        GenericNotes obj1 = new GenericNotes(12);
        obj1.printVal();
        obj1.setTVal("sam");
        obj1.printVal();
        obj1.setTVal(false);
        obj1.printVal();
        String[] strs = {"apple","banana"};
        GenericNotes.printArray(strs);
        Double[] dubs = {12.0,11.0};
        GenericNotes.printArray(dubs);
        // moral: can set Generic Class to any type

       System.out.print(equality(strs,dubs));
       System.out.print(equality(strs,strs));


   }

}
