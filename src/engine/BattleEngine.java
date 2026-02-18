package engine;

import java.util.ArrayList;
import java.util.List;
import characters.Character;

public class BattleEngine {
    private final GameIO io;
    private final long stepDelayMillis;

    public BattleEngine(GameIO io) {
        this(io, 800);
    }

    public BattleEngine(GameIO io, long stepDelayMillis) {
        this.io = io;
        this.stepDelayMillis = stepDelayMillis;
    }

    private void pause() {
        try {
            Thread.sleep(stepDelayMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public BattleResult fight(Character a, Character b) {
        io.printLine("Battle starts: " + a.getName() + " vs " + b.getName());
        int round = 1;

        while (a.isAlive() && b.isAlive()) {
            io.printLine("Round " + round);
            
            pause();

            // a attacks b
            a.attack(b);
            
            pause();
            if (!b.isAlive()) {
                String endStatus = "End of Round " + round + ": " + a.getName() + " HP: " + a.getHealth() + ", " + b.getName() + " HP: " + b.getHealth();
                io.printLine(endStatus);
                
                break;
            }

            // b attacks a
            b.attack(a);
            
            pause();

            String endStatus = "End of Round " + round + ": " + a.getName() + " HP: " + a.getHealth() + ", " + b.getName() + " HP: " + b.getHealth();
            io.printLine(endStatus);
            round++;
        }

        Character winner = a.isAlive() ? a : b;
        pause();
        io.printLine("Winner: " + winner.getName());
        return new BattleResult(winner);
    }
}
