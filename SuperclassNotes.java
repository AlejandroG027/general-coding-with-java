public abstract class SuperclassNotes {
    /*
    - a super class can contains methods and variables that can be passed down to
    subclasses.

    - a superclass can also be instantiated, unlike an interface

    - all subclasses extend the superclass

    - an abstract superclass will have abstract methods that must be overwritten
    by the subclasses, just like an interface

    */

    // instance variables
    // all subclasses will have access to these, unless marker private with no getter
    protected int int1;
    private int int2;

    // constructor
    public SuperclassNotes(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
    }

    //getter
    public int getInt2(){return int2;}
    //setter
    public void setInt1(int int1){ this.int1 = int1;}

    // abstract
    public abstract int int1square();



    public class subClass extends SuperclassNotes {
        // this class' own instance vars
        private int int3;

        //constructor
        public subClass(int int1, int int2, int int3) {
            super(int1, int2);  // calls the two superclass variables
            this.int3 = int3;
        }

        // method calling from super class
        public int sum() {
            return int1 + super.getInt2() + int3;
        }

        @Override
        public int int1square(){return int1*int1;}
    }



    }

