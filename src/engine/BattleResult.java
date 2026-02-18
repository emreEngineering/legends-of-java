package engine;

import characters.Character;

public class BattleResult {
    private final Character winner;

    public BattleResult(Character winner) {
        this.winner = winner;
    }

    public Character getWinner() {
        return winner;
    }
}
