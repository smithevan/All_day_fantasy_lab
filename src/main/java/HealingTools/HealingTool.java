package HealingTools;

public abstract class HealingTool {

    int strength;

    public HealingTool(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength;
    }

}
