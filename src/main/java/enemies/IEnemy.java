package enemies;

import Players.IPlayable;

public interface IEnemy {

    int damage(int injury);
    int getHealth();
    int attack(IPlayable player);
    String getName();
}
