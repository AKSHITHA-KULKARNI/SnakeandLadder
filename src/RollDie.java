import java.util.Random;

public class RollDie {
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;  // returns a number between 1 and 6
    }
}