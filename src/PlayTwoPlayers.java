public class PlayTwoPlayers {
    RollDie rollDie = new RollDie();
    CheckOption checkOption = new CheckOption();
    MovePlayer movePlayer = new MovePlayer();
    CheckPosition checkPosition = new CheckPosition();

    public void play() {
        int player1Position = 0;
        int player2Position = 0;
        int diceRollCount = 0;

        while (player1Position != 100 && player2Position != 100) {
            // Player 1's turn
            int dieRoll = rollDie.roll();
            diceRollCount++;
            String option = checkOption.check();
            player1Position = movePlayer.move(player1Position, dieRoll, option);
            player1Position = checkPosition.check(player1Position, dieRoll);
            System.out.println("Player 1 Roll #" + diceRollCount + ": Die roll = " + dieRoll + ", Position = " + player1Position + ", Option = " + option);

            // Player 2's turn
            if (player1Position != 100) {  // Player 2 plays if Player 1 hasn't won yet
                dieRoll = rollDie.roll();
                diceRollCount++;
                option = checkOption.check();
                player2Position = movePlayer.move(player2Position, dieRoll, option);
                player2Position = checkPosition.check(player2Position, dieRoll);
                System.out.println("Player 2 Roll #" + diceRollCount + ": Die roll = " + dieRoll + ", Position = " + player2Position + ", Option = " + option);
            }

            // Player 1 plays again if a ladder is rolled
            if (option.equals("Ladder") && player1Position != 100) {
                continue;
            }
        }

        if (player1Position == 100) {
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won!");
        }
    }
}
