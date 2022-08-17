package character.characterClass;

import character.Character;

import java.util.Scanner;

public abstract class CharacterClass extends Character implements Attributes{

    static Mage myMage;
    static Ranger myRanger;
    static Rogue myRogue;
    static Warrior myWarrior;
    static String playerName;
    static String chosenClass;
    public double strength;
    public double dexterity;
    public double intelligence;
    public String[] usableWeapons;
    public String[] usableArmour;

    public CharacterClass(String name) {
        super(name);
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getUsableWeapons() {
        return usableWeapons;
    }

    public void setUsableWeapons(String[] usableWeapons) {
        this.usableWeapons = usableWeapons;
    }

    public String[] getUsableArmour() {
        return usableArmour;
    }

    public void setUsableArmour(String[] usableArmour) {
        this.usableArmour = usableArmour;
    }

}
