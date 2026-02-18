

import characters.Warrior;
import characters.Dragon;
import engine.BattleEngine;
import engine.BattleResult;
import engine.ConsoleIO;
import engine.GameIO;



public class Main {
    public static void main(String[] args) {
        GameIO io = new ConsoleIO();
        BattleEngine engine = new BattleEngine(io);

        Warrior warrior = new Warrior("Aragorn");
        Dragon dragon = new Dragon("Smaug");

        BattleResult result = engine.fight(warrior, dragon);
    }
}
