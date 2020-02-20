package Players;

import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Dwarf extends Player {
    ArrayList<IWeaponable> weapons;
    public Dwarf(String name, int healingPoints) {
        super(name, healingPoints);
        this.weapons = new ArrayList<IWeaponable>();
    }

    public int weaponCount(){
        return weapons.size();
    }

    public void addSword(Sword sword) {
        weapons.add(sword);
    }

    public void addAxe(Axe axe){
        weapons.add(axe);
    }

    public void addBow(Bow bow) {
        weapons.add(bow);
    }

    public double attack() {
        //begin with weapon strength
        //begin with enemy strength
        //multiply weapon strength by random number, deduct output from enemy health
        //multiply enemy strength by random number, deduct output from player health
        //continue looping until someone is zero.
        double randomNumber = Math.random();
        return randomNumber;
    }
}
