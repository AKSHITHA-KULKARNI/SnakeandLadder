public class CheckPosition {
    public int check(int playerPosition, int dieRoll) {
        if (playerPosition + dieRoll > 100) {
            return playerPosition;  // Player stays at the same position
        }
        return playerPosition + dieRoll;  // Normal move
    }
}
