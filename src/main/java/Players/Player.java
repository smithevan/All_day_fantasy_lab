package Players;

public abstract class Player {
     String name;
     int healingPoints;


    public Player(String name, int healingPoints){
        this.name = name;
        this.healingPoints= healingPoints;
    }

    public String getName(){
        return this.name;
    }

    public int getHealingPoints(){
        return healingPoints;
    }


}
