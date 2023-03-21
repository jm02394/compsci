package TokenPass;

public class TokenPassDriver {
    public static void main(String[] args) {
        TokenPass game = new TokenPass(4);

        for (int t = 0; t < 40; t++) {
            game.distributeCurrentPlayerTokens();
            game.nextTurn();
        }

        System.out.println(game);
    }
}
