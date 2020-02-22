package Players;

import enemies.IEnemy;

public interface IPlayable {

    void takeDamage(int injury);
    int getHealingPoints();
    int attack(IEnemy enemy);
}
