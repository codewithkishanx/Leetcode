class Solution {
    public String winningPlayer(int x, int y) {
        boolean turn = true; // Alice's turn

        while (x > 0 && y >= 4) {
            x--;
            y -= 4;
            turn = !turn;
        }

        return turn ? "Bob" : "Alice";
    }
}