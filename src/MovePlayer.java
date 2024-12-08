public class MovePlayer {
    public int move(int playerPosition, int dieRoll, String option) {
        if (option.equals("No Play")) {
            return playerPosition;  // No change in position
        } else if (option.equals("Ladder")) {
            playerPosition += dieRoll;  // Move forward
        } else if (option.equals("Snake")) {
            playerPosition -= dieRoll;  // Move backward
        }

        // Ensure player does not move below 0
        if (playerPosition < 0) {
            playerPosition = 0;
        }

        return playerPosition;
    }
}
