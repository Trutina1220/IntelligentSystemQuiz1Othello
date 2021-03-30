package trutina;

public class Main {

    public static void main(String[] args) {



        OthelloScorer scorer1, scorer2;
        scorer1 = new OthelloScorerC();
        scorer2 = new OthelloScorerC();

        OthelloPlayer player1, player2;

//        Change the depth of the minimax AI in here
        int depth1 = 6;

        player1 = new OthelloMinimax(true,depth1,scorer1);
        player2 = new OthelloRandomPlayer();

        System.out.println("Player 1 is: Minimax AI ");
        System.out.println("Player 2 is: Random Move " );

        OthelloGame state = new OthelloGame();
        OthelloPlayer players[] = { player1, player2 };

        do
        {
            // Display the current state in the console:
            System.out.println("\nCurrent state, " + OthelloGame.PLAYER_NAMES[state.nextPlayerToMove] + " to move:");
            System.out.print(state);

            // Get the move from the player:
            OthelloMove move = players[state.nextPlayerToMove].getMove(state);
            System.out.println(move);
            state = state.applyMoveCloning(move);
        } while(!state.gameOver());

        // Show the result of the game:
        System.out.println("\nThe Score are calculated by the winning pieces substracted by the losing pieces");
        System.out.println("Final state with score: " + state.score());
        System.out.println(state);
    }


}

