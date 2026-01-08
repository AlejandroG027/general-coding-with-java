import java.util.Random;

public class RandomNotes {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print(rand);
        // for integers, returns numbers 0-4
        rand.nextInt(5);

        // for doubles, returns numbers 2 - 4
        //2 + rand.nextDouble(5);

        // cahracters
        //Random char = new Random();
        //(char)('A' + char.next(26))

    }
}
