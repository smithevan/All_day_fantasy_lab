package Players;

import enemies.IEnemy;
import treasure.ITreasurable;

public interface IPlayable{

    void takeDamage(int injury);
    int getHealingPoints();
    int attack(IEnemy enemy);
    String getName();
    void addTreasure(ITreasurable treasure);
    void addHealth(int healing);
}
