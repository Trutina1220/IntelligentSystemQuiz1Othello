package trutina;

public class OthelloScorerC implements OthelloScorer
{
    @Override
    public int score(OthelloGame state)
    {
        return state.score();
    }
}

