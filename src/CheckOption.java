import java.util.Random;

public class CheckOption {
    public String check() {
        String[] options = {"No Play", "Ladder", "Snake"};
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }
}
