package TokenPass;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        this.board = new int[playerCount];

        for (int i = 0; i < board.length; i++) {
            board[i] = (int) (Math.random() * 10) + 1;
        }

        this.currentPlayer = (int) (Math.random() * playerCount);
    }

    public void distributeCurrentPlayerTokens() {
        int p = this.currentPlayer;

        for (int t = this.board[this.currentPlayer]; t > 0; t--) {
            p++;
            if (p == this.board.length) {
                p = 0;
            }

            this.board[p]++;
        }
    }

    public void nextTurn() {
        this.currentPlayer++;
        if (this.currentPlayer == this.board.length) {
            this.currentPlayer = 0;
        }
    }

    public String toString() {
        String o = "";
        int maxP = 0;

        for (int p = 0; p < this.board.length; p++) {
            o += "Player " + p + ": " + this.board[p] + " tokens      ";
            if (this.board[p] > this.board[maxP]) {
                maxP = p;
            }
        }

        o += "\nPlayer " + maxP + " has the most tokens!";
        return o;
    }
}
