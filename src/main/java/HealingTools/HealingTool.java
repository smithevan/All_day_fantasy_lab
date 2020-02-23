package HealingTools;

public abstract class HealingTool {

    String name;
    int strength;


    public HealingTool(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public int useHealable() {
        double dice = Math.random();
        double healingStrength = strength * dice;
        return (int) healingStrength;
    }

}
