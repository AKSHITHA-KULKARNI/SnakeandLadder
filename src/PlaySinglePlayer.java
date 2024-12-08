public class PlaySinglePlayer {
    RollDie rollDie = new RollDie();
    CheckOption checkOption = new CheckOption();
    MovePlayer movePlayer = new MovePlayer();
    CheckPosition checkPosition = new CheckPosition();

    public void play() {
        int position = 0;
        int diceRollCount = 0;

        while (position != 100) {
            int dieRoll = rollDie.roll();
            diceRollCount++;
            String option = checkOption.check();
            position = movePlayer.move(position, dieRoll, option);
            position = checkPosition.check(position, dieRoll);

            System.out.println("Roll #" + diceRollCount + ": Die roll = " + dieRoll + ", Position = " + position + ", Option = " + option);
        }

        System.out.println("Player reached position 100 in " + diceRollCount + " rolls.");
    }
}
